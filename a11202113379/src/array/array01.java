/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array;

/**
 *
 * @author HP
 */
public class array01 {
    public static void main (String[] args)
    {
        //declarasi array
        int a[]=new int[5];
        
        //isi element array
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;
        
        //tampilkan array
        System.out.println("Array a[0]"+a[0]);
        System.out.println("Array a[1]"+a[1]);
        System.out.println("Array a[2]"+a[2]);
        System.out.println("Array a[3]"+a[3]);
        System.out.println("Array a[4]"+a[4]);
        System.out.println("==================");
        
        int i=0;
        for(i=0;i<a.length;i++)
        {
            System.out.println("Arrray ["+i+"]"+a[i]);
        }
        //array 2 dimensi
        int duadimen[][]=new int[3][3];
        duadimen[0][0]=10;
        duadimen[0][1]=20;
        duadimen[0][2]=30;
        duadimen[1][0]=40;
        duadimen[1][1]=50;
        duadimen[1][2]=60;
        duadimen[2][0]=70;
        duadimen[2][1]=80;
        duadimen[2][2]=90;
        
        int b=0,c=0;
        for(b=0;b<3;b++)
        {
            for(c=0;c<3;c++)
            {
                System.out.print(" "+duadimen[b][c]+" ");
            }
            System.out.println("\n");
        }
        
        
        
    }
    
}
