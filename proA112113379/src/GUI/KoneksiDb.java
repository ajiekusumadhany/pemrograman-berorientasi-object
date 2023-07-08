/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

/**
 *
 * @author HP
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class KoneksiDb {
    public static Connection conn;
    public static Statement stm;
    public String usr;
 
    public KoneksiDb(String usr){
        try {
            this.usr = usr;
            conn=DriverManager.getConnection("jdbc:mysql://localhost/a11202113379","root","");
            stm=(Statement) conn.createStatement();
            JOptionPane.showMessageDialog(null,"Koneksi Berhasil!");
        } catch (SQLException ex) {
                Logger.getLogger(KoneksiDb.class.getName()).log(Level.SEVERE,null,ex);
        }
    }
    
    public static Connection getConn(){
        return conn;
    }
    
    public static void main(String[] args) {
        KoneksiDb konn = new KoneksiDb("a11202113379");
    }
}
