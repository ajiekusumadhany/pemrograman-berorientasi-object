/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaketKoneksi;
import java.beans.Statement;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class KoneksiDB {
    public Connection conn;
    public Statement stm;
    public String usr;

    public KoneksiDB(String usr) throws ClassNotFoundException {
        try{
            String url="jdbc:mysql//localhost/"+usr;
            String user = "root";
            String pass = "";
            //Class.forName("com.mysql.jdbc.driver");
            JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
        }catch(Exception err){
            JOptionPane.showMessageDialog(null, "Tidak Terkoneksi!");
    }
    
}}
