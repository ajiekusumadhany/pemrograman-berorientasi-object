/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan01;

/**
 *
 * @author D2A
 */
public class Suhu {
    float k,f,ra,d,n,re,ro;
    
    public float kelvin (float c){
        return k=c+(float)273.15;
    }
    
    public float fahrenheit (float c){
        return f=c*(float)1.8+32;
    }
    
    public float rankine (float c){
        return ra=c*(float)1.8+(float)491.6;
    }
    
    public float delisle (float c){
        return d=(100-c)*(float)1.5;
    }
    
    public float newton (float c){
        return n=c*(float)0.33;
    }
    
    public float reamure (float c){
        return re=c*(float)0.8;
    }
    
    public float romer (float c){
        return ro=c*(float)0.525+(float)7.5;
    }
    
}
