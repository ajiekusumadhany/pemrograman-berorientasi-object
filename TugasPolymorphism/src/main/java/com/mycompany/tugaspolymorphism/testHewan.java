/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspolymorphism;

/**
 *
 * @author HP
 */
public class testHewan {
    public static void main(String[] args) {
    Singa s=new Singa("Mamalia","Pemakan Daging");
          s.suara();
          s.berjalan();
          
    Elang e=new Elang("Burung","Memiliki paruh");
          e.suara();
          e.berjalan();    
    
    Lebah l=new Lebah("Serangga","Memiliki sengat");
          l.suara();
          l.berjalan();
    
    Paus  p=new Paus("Mamalia","Bernapas menggunakan paru-paru.");
          p.suara();
          p.berjalan();


    }
}
