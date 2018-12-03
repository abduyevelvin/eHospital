/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package az.orient.hospital.dao;

import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Locale;
import java.util.Properties;

/**
 *
 * @author EAAbduyev
 */
public class DBHelper {
    
    public static Connection getConnection() throws Exception {
        Locale.setDefault(Locale.ENGLISH);
        Properties p = new Properties();
        p.load(new FileReader("config.properties"));
        Class.forName(p.getProperty("db.driver"));
        Connection c = DriverManager.getConnection(p.getProperty("db.url"), p.getProperty("db.un"), p.getProperty("db.pass"));
        
        return c;
    }
    
}
