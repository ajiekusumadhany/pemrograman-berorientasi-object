/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan01;

import java.util.Scanner;

/**
 *
 * @author D2A
 */
public class TestSuhu {
    public static void main (String[] args){
        float celcus;
        Scanner sc=new Scanner(System.in);
        Suhu sh=new Suhu();
        
        System.out.println("Masukkan Derajat Celcius\t:");
        celcus=sc.nextFloat();

        System.out.println(""+celcus+" derajat Celcius\t:"+sh.kelvin(celcus)+" Kelvin");
        System.out.println(""+celcus+" derajat Celcius\t:"+sh.fahrenheit(celcus)+" Fahrenheit");
        System.out.println(""+celcus+" derajat Celcius\t:"+sh.rankine(celcus)+" Rankine");
        System.out.println(""+celcus+" derajat Celcius\t:"+sh.delisle(celcus)+" Delisle");
        System.out.println(""+celcus+" derajat Celcius\t:"+sh.newton(celcus)+" Newton");
        System.out.println(""+celcus+" derajat Celcius\t:"+sh.reamure(celcus)+" Reamure");
        System.out.println(""+celcus+" derajat Celcius\t:"+sh.romer(celcus)+" Romer");

    }
}
