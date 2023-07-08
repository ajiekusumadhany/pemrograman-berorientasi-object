package com.mycompany.responsia11202113379;

import java.util.Scanner;

public class Bengkel {
    
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
        int biayaService = 0;
        int total = 0;
        String namaService = "";
        String tambahSparepart = "N";
        int jmlhSparepart = 0;
        String[] dataNamaSparepart = new String[10];
        int[] dataHargaSparepart = new int[10];
        int hargaSparepart;
        String namaSparepart;
        int i;
        
        Menu();
                                
        System.out.print("Pilih service: ");
        pilih = scanner.nextInt();
        
        if (pilih==1 || pilih==2 || pilih==3 || pilih==4)
        {
            biayaService=150000;
            System.out.print("Apakah ada penambahan sparepart? (Y/N) ");
            tambahSparepart = scanner1.nextLine();
            
            if(pilih==1){
                namaService="Mesin";
            }
            else if(pilih==2){
                namaService="AC";
            }
            else if(pilih==3){
                namaService="Kelistrikan";
            }
            else if(pilih==4){
                namaService="Pengereman";
            }
                   
        }
        else if(pilih==5)
        {
            namaService="Check Up";
            biayaService=1200000;
        }
        else{
           System.exit(0);
        }
        
        if (tambahSparepart.equalsIgnoreCase("Y"))
            {
                System.out.print("Tambah berapa sparepart? = ");
                jmlhSparepart = scanner.nextInt();
                for(i=0;i<jmlhSparepart;i++)
                {
                    System.out.print("Apakah nama sparepartnya? = ");
                    namaSparepart = scanner1.nextLine(); 
                    dataNamaSparepart[i]=namaSparepart;

                    System.out.print("Berapa harganya? = ");
                    hargaSparepart= scanner.nextInt();
                    dataHargaSparepart[i]=hargaSparepart;
                }
                for(i=0;i<jmlhSparepart;i++)
                {
                    total += dataHargaSparepart[i];
                }
            }
        
        total += biayaService;
        
        System.out.println("Laporan:");
        System.out.println("Service Bengkel ABC");
        System.out.println("Nama Service: "+namaService);
        if (tambahSparepart.equalsIgnoreCase("Y"))
        {
            System.out.println("Nama Sparepart: ");
            for(i=0;i<jmlhSparepart;i++)
            {
                System.out.println((i+1)+". "+dataNamaSparepart[i]+" = Rp. "+dataHargaSparepart[i]);
            }
        }
        System.out.println("Total Biaya: "+total);
        
    }
}