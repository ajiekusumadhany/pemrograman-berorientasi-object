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
public class PerulanganWhile {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=1;
        String ya="Y";
        while (ya.equals("Y"))
        {
            System.out.println(a+"UDINUS");
            a++;
            System.out.println("Mau lanjut? Y/N\t:");
            ya=sc.nextLine();
            if (ya=="N")
            {
                break;
            }
            
            if (a==10)
            {
                break;
            }
        }
    }
    
}
