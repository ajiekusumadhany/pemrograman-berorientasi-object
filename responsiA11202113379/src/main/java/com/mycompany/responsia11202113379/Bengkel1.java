/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.responsia11202113379;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Bengkel1 {
    
    static void Menu(){
        System.out.println("1. Service Mesin");
        System.out.println("2. Service Ac");
        System.out.println("3. Service Kelistrikan");
        System.out.println("4. Service Pengereman");
        System.out.println("5. Service Check Up");
        System.out.println("6. Exit");
        System.out.println("===================");
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Scanner scanner1 = new Scanner(System.in);
     
        
        int pilih;
        int biaya = 0;
        int total;
        String nama = null;
        String sp = "Y";
        int tbh = 0;
        int i;
        
        Menu();
                                
        System.out.print("Pilih service: ");
        pilih = scanner.nextInt();
        if (pilih==1 || pilih==2 || pilih==3 || pilih==4)
        {
            biaya=150000;
            System.out.print("Apakah ada penambahan sparepart? = ");
            sp = scanner1.nextLine();
            System.out.print("Tambah berapa sparepart? = ");
            tbh = scanner.nextInt();
            
            if(pilih==1){
                nama="Mesin";
            }
            else if(pilih==2){
                nama="AC";
            }
            else if(pilih==3){
                nama="Kelistrikan";
            }
            else if(pilih==4){
                nama="Pengereman";
            }
                   
        }
        else if(pilih==5)
        {
            nama="Check Up";
            biaya=1200000;
            sp="n";
        }
        else{
           System.exit(0);
        }
        
        if (sp.equals("Y") || sp.equals("y"))
        {
            
        String[] dataArray = new String[tbh];
        String[] dataNs = new String[tbh];
        int[] dataHarga = new int[tbh];
        int harga;
        String ns;
            for(i=0;i<tbh;i++)
            {
                System.out.print("Apakah nama sparepartnya? = ");
                ns = scanner1.nextLine(); 
                dataNs[i]=ns;

                System.out.print("Berapa harganya? = ");
                harga = scanner.nextInt();
                dataHarga[i]=harga;
                
            }
        total=biaya+dataHarga[i];
        
        System.out.println("Laporan:");
        System.out.println("Service Bengkel ABC");
        System.out.println("Nama Service: "+nama);
        System.out.println("Nama Sparepart: "+dataNs[i]);
        System.out.println("Harga\n: "+dataHarga[i]);
        System.out.println("Total(jasa+spareparth): "+total);
        }
        
        
    }
}
