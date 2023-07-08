/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspolymorphism;

/**
 *
 * @author HP
 */
public class Singa extends Hewan {

    public Singa(String jenis, String ciri) {
        super(jenis, ciri);
    }

    @Override
    public void berjalan() {
        System.out.println("Singa Berjalan");
    }

    @Override
    public void suara() {
        System.out.println("Suara Singa");
    }

  

    
    
    
}
