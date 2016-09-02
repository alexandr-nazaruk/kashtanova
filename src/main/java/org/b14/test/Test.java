package org.b14.test;

/**
 * Created by onazaruk on 27.01.2016.
 */


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;


import javax.sql.DataSource;
import java.sql.*;
import java.util.*;


public class Test {
    private final String sql="SELECT id FROM a_test_table";

    public String test(String param) {
        return this.getClass().getName();
    }



    public String testJdbc() {


        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return e.getMessage();
        }

        System.out.println("PostgreSQL JDBC Driver Registered!");

        Connection connection = null;

        try {
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://127.8.101.130:5432/14b", "adminwe7zppv",
                    "tYBq2ez7U4d_");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return e.getMessage();

        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");

            String res ="";
            try {
                PreparedStatement ps = connection.prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    res+=rs.getString(1);
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
                e.printStackTrace();
                res=e.getMessage();
            }
            return res;

        } else {
            System.out.println("Failed to make connection!");
            return "Failed to make connection!";
        }
    }

    public static void main(String[] args) {
String s=null;
        System.out.println(s.isEmpty());
      //  ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
      //  System.out.println(((TestDAO)ctx.getBean("testDAO")).testSpringJdbc());


    }

    public String testSpringJdbc(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        return ((TestDAO)ctx.getBean("testDAO")).testSpringJdbc();
    }
}
