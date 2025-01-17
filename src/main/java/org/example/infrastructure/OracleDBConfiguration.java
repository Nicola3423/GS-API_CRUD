package org.example.infrastructure;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class OracleDBConfiguration {
    private static final String URL = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
    private static final String USER = "RM554227";
    private static final String PASSWORD = "081204";


    public Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }


    public void closeConnection(Connection connection) throws SQLException{
        connection.close();
    }
}
