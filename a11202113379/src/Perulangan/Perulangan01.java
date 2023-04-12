/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Perulangan;

/**
 *
 * @author HP
 */
public class Perulangan01 {
    public static void main(String[] args){
        
        System.out.println("Perulangan For");
        int a=0,i=0;
        for (a=1;a<=5;a++)
        {
            System.out.println(""+a);
        }
        System.out.println("====================");
        
        for (a=1;a<=5;a++)
        {
            for(i=1;i<=a;i++)
            {
                System.out.print(" "+i);
            }
            System.out.println("");
        }
        System.out.println("====================");
        
        
        a=0;i=0;
        for (a=1;a<=5;a++)
        {
            for(i=0;i<a;i++)
            {
                System.out.print(" "+(i+a)+" ");
            }
            System.out.println("");
        }
        System.out.println("====================");
        
        
        System.out.println("Perulangan While");
        
        a=1;i=0;
        while (a<=5) {
            System.out.println(a);
            a++;
        }
        System.out.println("====================");
        
        a=1;
        while(a<=5)
        {
            i=1;
            while(i<=a)
            {
                System.out.print(" "+i);
                i++;
            }
            System.out.println(" ");
            a++;
        }
        System.out.println("====================");
        
        
        a=1;
        while (a<=3)
        {
            i=1;
            while(i<=a)
            {
                System.out.print(" "+((i-1)+a)+" ");
                i++;
            }
            System.out.println("");
            a++;
        }
        System.out.println("====================");
        
        
                
        System.out.println("Perulangan Do While");
        
        a=1;i=0;
        do {
            System.out.println(a);
            a++;
        }
        while (a<=5);
        System.out.println("====================");
        
        a=1;
        do {
            i=1;
            do {
                System.out.print(" "+i);
                i++;
            }
            while(i<=a);
            System.out.println(" ");
            a++;
        }
        while(a<=5);
        System.out.println("====================");
        
        
        a=1;
        do {
            i=1;
            do {
                System.out.print(" "+((i-1)+a)+" ");
                i++;
            }
            while(i<=a);
            System.out.println("");
            a++;
        }
        while (a<=3);
        System.out.println("====================");

    }
    
}
