/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan01;

/**
 *
 * @author HP
 */
public class PercabanganIF {
    public static void main(String[] args){
        int a=0;
        if (a<10)
        {
            System.out.println("Pernyataan benar");
        }
        else
        {
            System.out.println("Pernyataan salah");
        }
        
        int nilai=90;
        if (nilai>90)
        {
            System.out.println("Predikat ISTIMEWA"); 
        }
        else if(nilai>80)
        {
            System.out.println("Predikat TERPUJI");
        }
        else
        {
            System.out.println("Predikat LUMAYAN");
        }
        
        String nilaiHuruf="E";
        switch (nilaiHuruf)
        {
            case "A":
                System.out.println("Predikat APIK");
                break;
            case "B":
                System.out.println("Predikat BAIK");
                break;
            case "C":
                System.out.println("Predikat CUKUP");
                break;      
            default:
                System.out.println("Predikat KURANG BAIK");
                break;
      
        }
    }
       
    
}
