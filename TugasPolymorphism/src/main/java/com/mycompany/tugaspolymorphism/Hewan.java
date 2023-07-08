/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspolymorphism;

/**
 *
 * @author HP
 */
public class Hewan {
    
    public Hewan(String jenis,String ciri){
        System.out.println("Jenis: "+jenis);
        System.out.println("Ciri: "+ciri);
    }
    public void suara() {
        System.out.println("Suara hewan");
    }

    public void berjalan() {
        System.out.println("Hewan berjalan");
    }
}
