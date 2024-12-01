package org.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MyCon1 {
    private String URL;
    private String USER;
    private String PASSWORD;
    private Connection conn;

    MyCon1(String url,String user,String password){
        URL =url;
        USER =user;
        PASSWORD =password;
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            //statement = conn.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public Connection getInstance(){
        return this.conn;
    }
}
