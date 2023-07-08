/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author HP
 */
public class TestPesawat {
    public static void main(String[] args){
        Pesawat boing=new Pesawat();
        PesawatTempur f16=new PesawatTempur();
        
        boing.terbang();
        boing.mendarat();
        
        f16.terbang();
        f16.manuver();
        f16.mendarat();
    }
}
