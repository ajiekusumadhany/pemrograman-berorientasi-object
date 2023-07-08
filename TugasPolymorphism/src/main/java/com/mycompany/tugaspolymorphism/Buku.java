/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugaspolymorphism;

/**
 *
 * @author HP
 */
class Buku {

    public Buku(String judul, String pengarang, String penerbit, int tahun) {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Penerbit: " + penerbit);
        System.out.println("Tahun: " + tahun);
    }

    public Buku(String judul, String pengarang) {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
    }
    
}
