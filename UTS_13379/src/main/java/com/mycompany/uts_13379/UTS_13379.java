/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.uts_13379;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class UTS_13379 {
    
    static void Menu(){
        System.out.println("1. Pesawat");
        System.out.println("2. Kapal Laut");
        System.out.println("3. Kereta Api");
        System.out.println("4. Hitung Biaya");
        System.out.println("5. Keluar Program");
        System.out.println("===================");
    }
    
    static void Tujuan(){
        System.out.println("a. Semarang - Jakarta");
        System.out.println("b. Semarang - Surabaya");
        System.out.println("c. Semarang - Bandung");
    }

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
        
        String namaPembeli;
        String jkPembeli;
        int pilihTiket;
        String pilihKelas;
        int jumlahTiket = 0;
        String pilihTujuan = "";
        int hargaTiket = 0;
        String namaTiket;
        int totalBiaya = 0;
        int dibayar = 0;
        int kembalian;
        String namaTujuan = "";
        
        System.out.print("Nama Pembeli: ");
        namaPembeli = scanner.nextLine();
        
        System.out.print("Jenis Kelamin: ");
        jkPembeli = scanner.nextLine();
        
        Menu();
        System.out.print("Pilih Tiket: ");
        pilihTiket = scanner1.nextInt();
        
        System.out.print("Beli kelas apa?(VIP/EKONOMI): ");
        pilihKelas = scanner.nextLine();
        
        System.out.print("Nama tiket?: ");
        namaTiket = scanner.nextLine();
        
        if(pilihTiket==1){
            
            System.out.print("Jumlah Tiket: ");
            jumlahTiket = scanner1.nextInt();
            
            Tujuan();
               System.out.print("Pilih Tujuan(a/b/c):");
               pilihTujuan = scanner.nextLine();
            
            if(pilihKelas.equals("VIP"))
            {
               
                switch (pilihKelas) {
                    case "a":
                        hargaTiket = 750000;
                        break;
                    case "b":
                        hargaTiket = 600000;
                        break;
                    default:
                        hargaTiket = 950000;
                        break;
                }
            }
            
            if(pilihKelas.equals("EKONOMI") )
            {
               
               if(pilihTujuan =="a"){
                   hargaTiket = 450000;
               }
               else if(pilihTujuan =="b"){
                   hargaTiket = 490000;
               }
               else{
                   hargaTiket = 650000;
               }
            }
            
        }
        
        else if(pilihTiket==3){
            System.out.println("Jumlah Tiket: ");
            jumlahTiket = scanner1.nextInt();
            
            Tujuan();
               System.out.print("Pilih Tujuan(a/b/c):");
               pilihTujuan = scanner.nextLine();
            
            if(pilihKelas == "VIP" )
            {
               
               if(pilihTujuan =="a"){
                   hargaTiket = 350000;
               }
               else if(pilihTujuan =="b"){
                   hargaTiket = 300000;
               }
               else{
                   hargaTiket = 450000;
               }
            }
            
            if(pilihKelas == "EKONOMI" )
            {
               
               if(pilihTujuan =="a"){
                   hargaTiket = 150000;
               }
               else if(pilihTujuan =="b"){
                   hargaTiket = 90000;
               }
               else{
                   hargaTiket = 250000;
               }
            }
            
        }
        
        else if(pilihTiket==2){
            System.out.println("Jumlah Tiket: ");
            jumlahTiket = scanner1.nextInt();
            
            Tujuan();
               System.out.print("Pilih Tujuan(a/b/c):");
               pilihTujuan = scanner.nextLine();
            
            if(pilihKelas == "VIP" )
            {
               
               if(pilihTujuan =="a"){
                   hargaTiket = 350000;
               }
               else if(pilihTujuan =="b"){
                   hargaTiket = 300000;
               }
               else{
                   hargaTiket = 650000;
               }
            }
            
            if(pilihKelas == "EKONOMI" )
            {
               
               if(pilihTujuan =="a"){
                   hargaTiket = 150000;
               }
               else if(pilihTujuan =="b"){
                   hargaTiket = 90000;
               }
               else{
                   hargaTiket = 250000;
               }
            }
            
        }

        
        
     totalBiaya=hargaTiket*jumlahTiket;
     kembalian=dibayar-totalBiaya;
     
     System.out.print("Uang yang dibayarkan:\t");
     dibayar=scanner1.nextInt();
     
     kembalian=dibayar-totalBiaya;
     
     System.out.print("=============================================");
     System.out.println("Nama Pembeli: " +namaPembeli);
     System.out.println("Jenis Kelamin: " +jkPembeli);
     System.out.println("Nama Tiket: " +namaTiket);
     System.out.println("Jumlah Tiket: " +jumlahTiket);
     System.out.println("Kelas:" +pilihKelas);
     System.out.println("Nama Tujuan: " +pilihTujuan);
     System.out.println("Total Biaya: " +totalBiaya);
     System.out.println("Dibayar: " +dibayar);
     System.out.println("Kembalian: " +kembalian);
     System.out.print("----------------------------------------------");
     
     
        
    }
}
