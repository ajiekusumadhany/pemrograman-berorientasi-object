/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polymorphism;

/**
 *
 * @author HP
 */
public class Matematika{
	int hasilPertambahanBulat;
	double hasilPertambahanPecahan;
	
	public void pertambahan (int a, int b){
		hasilPertambahanBulat = a + b;
		System.out.println("hasil:" + hasilPertambahanBulat);
	}
	public void pertambahan (double a, double b, double c){
		hasilPertambahanPecahan = a + b + c;
		System.out.println("hasil:" + hasilPertambahanPecahan);
	}

   
    
}
