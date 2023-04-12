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
public class Array1 {
        public static void main (String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        
        int b;
        System.out.print("Jumlah Data : ");
        b = sc.nextInt();
        
        //declarasi array
        int a[]=new int[b];
        
        int i=0;
        for(i=0;i<b;i++)
        {
            int c=i+1;
            System.out.print("Data ke - "+c+" = ");
            a[i]=sc.nextInt();

        }
        daftarNilai(a);
    }

    private static void daftarNilai(int[] a) {
        for(int i=0;i<a.length;i++) {
      
        System.out.println("Hasil nilai["+i+"]="+a[i]);
    }
    }
}
