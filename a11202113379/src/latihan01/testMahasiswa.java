/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan01;

/**
 *
 * @author D2A
 */
public class testMahasiswa {
    public static void main(String[] args){
        Mahasiswa mhs=new Mahasiswa();
        mhs.setNim("a11202113379");
        System.out.println("Nim\t:"+mhs.getNim());
        
        mhs.setNama("Ajie Kusumadhany");
        System.out.println("Nama\t:"+mhs.getNama());
        
        mhs.setNilai("70");
        System.out.println("Nilai\t:"+mhs.getNilai());
    }
}
