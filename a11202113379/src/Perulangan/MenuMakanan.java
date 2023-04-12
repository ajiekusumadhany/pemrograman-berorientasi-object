/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perulangan;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class MenuMakanan {
    static void Nasi()
    {
        System.out.println("Nasi    ");
        System.out.println("============");
        System.out.println("Nasi Rames");
        System.out.println("Nasi Goreng");
        System.out.println("Nasi Gudeg");
        System.out.println("Nasi Kibuli");
        System.out.println("============");
    }
    
        static void Minum()
    {
        System.out.println("Minuman    ");
        System.out.println("============");
        System.out.println("Air Putih");
        System.out.println("Es Teh");
        System.out.println("Es Jeruk");
        System.out.println("============");
    }
    public static void main(String[] args)
    {
        Scanner jns=new Scanner(System.in);
        System.out.println("1. Makanan");
        System.out.println("2. Minuman");
        System.out.print("Pilih jenis menu 1/2:\t");
        int jenis;
        jenis=jns.nextInt();
        
        if (jenis==1)
        {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);        
        int pilih;
        String ya="Y";
        while (ya.equals("Y") || ya.equals("y"))
        {
            Nasi();
            System.out.print("Pilih Menu\t:");
            pilih=sc.nextInt();
            if (pilih==1)
            {
                System.out.println("Anda Memilih Nasi Rames");
                
            }
            else if (pilih==2)
            {
                System.out.println("Anda Memilih Nasi Goreng");
            }
            else if (pilih==3)
            {
                System.out.println("Anda Memilih Nasi Gudeg");
            }
            else if (pilih==4)
            {
                System.out.println("Anda Memilih Nasi Kibuli");
            }
            else
            {
                System.out.println("Makanan tidak tersedia!");
            }
            System.out.print("Pilih lagi Y/N:\t");
            ya=sc1.nextLine();
            if (ya=="N" || ya=="n")
            {
                break;
            }
        }
        }
        
        else if (jenis==2)
        {
        Scanner mn=new Scanner(System.in);
        Scanner mn1=new Scanner(System.in);        
        int pilih;
        String ya="Y";
        while (ya.equals("Y") || ya.equals("y"))
        {
            Minum();
            System.out.print("Pilih Menu\t:");
            pilih=mn.nextInt();
            if (pilih==1)
            {
                System.out.println("Anda Memilih Air Putih");
                
            }
            else if (pilih==2)
            {
                System.out.println("Anda Memilih Es Teh");
            }
            else if (pilih==3)
            {
                System.out.println("Anda Memilih Jus Jeruk");
            }
            else
            {
                System.out.println("Minuman tidak tersedia!");
            }
            System.out.print("Pilih lagi Y/N:\t");
            ya=mn1.nextLine();
            if (ya=="N" || ya=="n")
            {
                break;
            }
        }
        }
        else {
            System.out.println("Pilihan tidak tersedia!");
        }
        
        
    }
}
