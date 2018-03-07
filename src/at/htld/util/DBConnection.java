package at.htld.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final String DB_DATABASE_NAME = "wikigame";
    private final String DB_USER_NAME = "wikigameuser";
    private final String DB_USER_PASSWD = "asdf1234";

    /**
     * Liefert eine DB Connection auf die mysql-DB
     *
     * @return DB Connection
     */
    public Connection getConnection() throws SQLException {
        Connection conn = null;

        StringBuilder sbBuilder = new StringBuilder("jdbc:mysql://localhost:3306/");
        sbBuilder.append(DB_DATABASE_NAME).append("?user=")
                .append(DB_USER_NAME).append("&password=")
                .append(DB_USER_PASSWD)
                .append("&useUnicode=true&characterEncoding=UTF-8");

        conn = DriverManager.getConnection(sbBuilder.toString());

        return conn;
    }
}
