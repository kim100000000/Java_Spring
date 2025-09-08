package com.seongtae.ex00.sample;


import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCTests {

    @Test
    public void testConnection() throws Exception{


        Class.forName("org.mariadb.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/springdb",
                "springdbuser","springdbuser");

        System.out.println(connection);

        connection.close();
    }
}
