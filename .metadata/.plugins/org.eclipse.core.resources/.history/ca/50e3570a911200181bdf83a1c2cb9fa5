package prog3060.assignment1.jvisser.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class DBConnection {
	
	static final String CONNECTION_STRING = "jdbc:derby://localhost:1527/LeagueDB";
    static final String CONNECTION_USER = "jwong";
    static final String CONNECTION_PASSWORD = "password123";
	
	public static Connection getConnectionToDatabase() throws SQLException {
		
		Properties connectionProperties = new Properties();
        connectionProperties.put("user", CONNECTION_USER);
        connectionProperties.put("password", CONNECTION_PASSWORD);

        Connection connection = DriverManager.getConnection(CONNECTION_STRING, connectionProperties);

        connection.setAutoCommit(false);
        connection.createStatement().executeUpdate("SET SCHEMA APP");

        return connection;
	}
}
