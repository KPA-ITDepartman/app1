/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package superliga;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Укиии Цар
 */
public class Baza {
    
    Connection dbConn = null;
    Statement naredba = null;
    
    public void poveziSaBazom(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
                        
            //uspostavljanje veze
            dbConn = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:ORACLE","UKIII","ukiii");
            
            //ako je veza ok
            System.out.println("Veza sa bazom je: "+dbConn);
            System.out.println("Veza uspostavljena\\n");
            
            naredba = dbConn.createStatement();
        }
        catch (Exception e){
            System.out.println("Greska je izbacena: "+e.getMessage());
        }
    }
    
    public void zatvoriBazu(){
        try{
            if (naredba != null)
                naredba.close();
            if (dbConn != null)
                dbConn.close();
        }
        catch (Exception e){
            System.out.println("SQL izuzetak za vreme  close(): "+e.getMessage());
        }
    }  
}