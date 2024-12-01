package org.example;

import org.example.builder.DesktopBuilder;
import org.example.builder.LaptopBuilder;
import org.example.builder.ordinateur.Desktop;
import org.example.builder.ordinateur.Laptop;
import org.example.factory.SimpleFactory;
import org.example.factory.factorymethod.CryptoFactory;
import org.example.factory.factorymethod.PayPalFactory;
import org.example.factory.paiment.Crypto;
import org.example.factory.paiment.Paiment;
import org.example.factory.paiment.PayPal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws SQLException {
        /*
        String URL = "jdbc:oracle:thin:@localhost:1521/orcl";
        String USER = "sys as sysdba";
        String PASSWORD = "test";
        MyCon1 myCon1= new MyCon1(URL,USER,PASSWORD);
        Connection connection1=myCon1.getInstance();
        MyCon1 myCon2= new MyCon1(URL,USER,PASSWORD);
        Connection connection2=myCon2.getInstance();
        System.out.println("La connection sans singleton");
        System.out.println("La réference de la connection1 : "+connection1);
        System.out.println("La réference de la connection2 : "+connection2);
        Connection myCon= MyCon.getInstance(URL,USER,PASSWORD);
        Statement statement = myCon.createStatement();
        String sql = "select * from user$";
        try (ResultSet rs = statement.executeQuery(sql)) {
            while (rs.next()) {
                String ename = rs.getString("USER#");
                String sal = rs.getString("NAME");
                String comm = rs.getString("TYPE#");
                System.out.println(ename+" "+sal+" "+comm);
            }
        }
        Connection autre=MyCon.getInstance();
        System.out.println(myCon);
        System.out.println(autre);*/
        DesktopBuilder desktopBuilder=new DesktopBuilder();
        Desktop desktop=desktopBuilder.buildProcesseur("intel").buildStockage(52).build();
        LaptopBuilder laptopBuilder=new LaptopBuilder();
        Laptop laptop=laptopBuilder.buildRAM(50).buildProcesseur("amd").buildStockage(52).build();
        System.out.println(desktop.toString());
        System.out.println(laptop.toString());


        SimpleFactory simpleFactory=new SimpleFactory();
        Paiment payPal=simpleFactory.initPaiement("paypal");
        payPal.displayMethod();
        PayPalFactory payPalFactory=new PayPalFactory();
        Paiment paiment=payPalFactory.createFactory();
        paiment.displayMethod();
        CryptoFactory cryptoFactory=new CryptoFactory();
        Paiment paiment1=cryptoFactory.createFactory();
        paiment1.displayMethod();
    }
}