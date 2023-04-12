/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan01;

/**
 *
 * @author D2A
 */
public class Sepeda {
    int kepatan;
    int gigi;
    
    public void tambahKecepatan(int kecepatan)
    {
        this.kepatan=this.kepatan+kecepatan;
        System.out.println("Kecepatan Sekarang\t"+this.kepatan);
    }
    
    public void gantigigi(int gigi)
    {
        this.gigi=this.gigi+gigi;
        System.out.println("Gigi berubah\t:"+this.gigi);
    }
    
}
