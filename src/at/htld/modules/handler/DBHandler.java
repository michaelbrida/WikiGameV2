package at.htld.modules.handler;

import at.htld.util.DBConnection;
import com.sun.org.apache.xpath.internal.functions.FuncFalse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;

public class DBHandler {

    //User object
    public boolean addUser() throws SQLException {
        DBConnection connHelper = new DBConnection();
        PreparedStatement pstmt;
        Connection conn = connHelper.getConnection();

        String username = ""; //Object.getusername
        String password = ""; //Opbject.getpassword
        String name = ""; //Object.getname

        int temp = userExists(username);
        boolean bool = true;
        if (temp == 0) {
            try {
                pstmt = conn
                        .prepareStatement("INSERT INTO wikiuser (username, name, password) VALUE (?, ?, ?)");
                pstmt.setString(1, username);
                pstmt.setString(2, password);
                pstmt.setString(3, name);
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
    public String userPassword() throws SQLException {
        DBConnection connHelper = new DBConnection();
        PreparedStatement pstmt;
        Connection conn = connHelper.getConnection();

        ResultSet rset;


        return null;
    }






}
