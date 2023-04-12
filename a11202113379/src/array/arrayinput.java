/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class arrayinput {
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        
        int j;
        System.out.print("Mau input berapa data?: ");
        j = sc1.nextInt();
        
        String nim[]=new String[j];
        String nama[]=new String[j];
        int nTugas[]=new int[j];
        int nUts[]=new int[j];
        int nUas[]=new int[j];
        
        
        int i=0;
        for(i=0;i<j;i++)
        {
            System.out.print("Masukkan Nim:");
            nim[i]=sc.nextLine();
            System.out.print("Masukkan Nama:");
            nama[i]=sc.nextLine();
            System.out.print("Masukkan N.Tugas:");
            nTugas[i]=sc1.nextInt();
            System.out.print("Masukkan N.Uts:");
            nUts[i]=sc1.nextInt();
            System.out.print("Masukkan N.Nuas:");
            nUas[i]=sc1.nextInt();

        }
        daftarNilai(nim,nama,nTugas,nUts,nUas);
    }

public static void daftarNilai(String[] nim, String[] nama, int[] nTugas, int[] nUts, int[] nUas) {
    System.out.println("Daftar Nilai:");
    System.out.println("NIM\tNama\tTugas\tUTS\tUAS\tTotal");
    System.out.println("=====================================================");

    for(int i=0;i<nim.length;i++) {
        int total = nTugas[i] + nUts[i] + nUas[i];
        System.out.println(nim[i] + "\t" + nama[i] + "\t" + nTugas[i] + "\t" + nUts[i] + "\t" + nUas[i] + "\t" + total);
    }
    System.out.println("=====================================================");
}

    
}
