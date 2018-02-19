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
		
	static final String CONNECTION_STRING = "jdbc:derby://localhost:1527/CanadaCensusDB";
    static final String CONNECTION_USER = "jvisser";
    static final String CONNECTION_PASSWORD = "Access@34";
	
	public static Connection getConnectionToDatabase() throws SQLException, InstantiationException, IllegalAccessException, ClassNotFoundException {
		
		Properties connectionProperties = new Properties();
        connectionProperties.put("user", CONNECTION_USER);
        connectionProperties.put("password", CONNECTION_PASSWORD);

		Class.forName("org.apache.derby.jdbc.ClientDriver").newInstance();
		
        Connection connection = DriverManager.getConnection(CONNECTION_STRING, connectionProperties);

        connection.setAutoCommit(false);
        connection.createStatement().executeUpdate("SET SCHEMA APP");

        return connection;
	}
}
