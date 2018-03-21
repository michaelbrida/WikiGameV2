package at.htld.modules.handler;

import at.htld.modules.entity.User;
import at.htld.util.DBConnection;
import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import javax.xml.transform.Result;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

public class DBHandler {

    //User object
    public boolean addUser(User user) throws SQLException {
        DBConnection connHelper = new DBConnection();
        PreparedStatement pstmt;
        Connection conn = connHelper.getConnection();

        String username = user.getUserName(); //Object.getusername
        String password = user.getPassword(); //Opbject.getpassword
        String name = user.getName(); //Object.getname

        int temp = userExists(username);
        boolean bool = true;
        if (temp == 0) {
            try {
                pstmt = conn
                        .prepareStatement("INSERT INTO wikiuser (username, name, password) VALUE (?, ?, ?)");
                pstmt.setString(1, username);
                pstmt.setString(2, name);
                pstmt.setString(3, password);
                pstmt.execute();
                return bool;
            } finally {
                if (conn != null) {
                    conn.close();
                }
            }
        } else {
            bool = false;
            return bool;
        }
    }


    public int userExists(String username) throws SQLException {
        DBConnection connHelper = new DBConnection();
        PreparedStatement pstmt;
        Connection conn = connHelper.getConnection();

        ResultSet rset;
        int erg = 0;

        try {
            pstmt = conn
                    .prepareStatement("SELECT count(*) AS num FROM wikiuser WHERE username = ?");
            pstmt.setString(1, username);

            rset = pstmt.executeQuery();
            if (rset.next()) {
                erg = rset.getInt("num");
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
        }
        return erg;
    }

    //user object
    public String userPassword(String username) throws SQLException {
        DBConnection connHelper = new DBConnection();
        PreparedStatement pstmt;
        Connection conn = connHelper.getConnection();

        ResultSet rset;
        String password = "";

        try {
            pstmt = conn
                    .prepareStatement("SELECT password AS pw FROM wikiuser WHERE username = ?");
            pstmt.setString(1, username);

            rset = pstmt.executeQuery();
            if (rset.next()) {
                password = rset.getString("pw");
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
            return password;
        }
    }

    public User getUser(String username) throws SQLException {
        User u = new User();

        DBConnection connHelper = new DBConnection();
        PreparedStatement pstmt;
        Connection conn = connHelper.getConnection();

        ResultSet rset;
        try {
            pstmt = conn
                    .prepareStatement("SELECT username AS usrn, password AS pw, name AS nm FROM wikiuser WHERE username = ?");
            pstmt.setString(1, username);

            rset = pstmt.executeQuery();
            if (rset.next()) {
                u.setUserName(rset.getString("usrn"));
                u.setPassword(rset.getString("pw"));
                u.setName(rset.getString("nm"));
            }
        } finally {
            if (conn != null) {
                conn.close();
            }
        }

        return u;
    }








}
