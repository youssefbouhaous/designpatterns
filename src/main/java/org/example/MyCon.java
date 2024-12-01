package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyCon {
    private static String URL;
    private static String USER;
    private static String PASSWORD;
    private static Connection conn;
    private static Statement statement;
    private MyCon(String URL,String USER,String PASSWORD){
        MyCon.URL =URL;
        MyCon.USER =USER;
        MyCon.PASSWORD =PASSWORD;
    }

    public static Connection getInstance(String url,String user,String password){
        if(conn==null){
            try {
                new MyCon(url,user,password);
                conn = DriverManager.getConnection(URL, USER, PASSWORD);
                //statement = conn.createStatement();
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        return conn;
    }
    public static Connection getInstance(){
        return conn;
    }
}
