package com;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maria
 */
public class JavaConnectDB {
    public static Connection ConnectDB() {
        try {
            Class.forName("oracle.jjdbc.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:mariutadb", "maria", "ASDqwe123");
            return con;
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}
