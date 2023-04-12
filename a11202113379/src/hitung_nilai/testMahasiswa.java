/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitungnilai;

/**
 *
 * @author HP
 */
import java.util.Scanner;

public class testMahasiswa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Mahasiswa mhs=new Mahasiswa();
      
        System.out.print("Masukkan NIM: ");
        String nim = scanner.nextLine();
        mhs.setNim(nim);
        
        System.out.print("Masukkan Nama: ");
        String nama = scanner.nextLine();
        mhs.setNama(nama);
        
        System.out.print("Masukkan Nilai: ");
        int nilai = scanner.nextInt();
        mhs.setNilai(nilai);
        
        if(nilai>=85)
        {
            mhs.setNhuruf('A');
        }
        else if(nilai>=70 && nilai<=84)
        {
            mhs.setNhuruf('B');
        }
        else if(nilai>=60 && nilai<=69)
        {
            mhs.setNhuruf('C');
        }
        else if(nilai>=40 && nilai<=59)
        {
            mhs.setNhuruf('D');
        }
        else{
            mhs.setNhuruf('E');
        }
        
        
        char nilaiHuruf=mhs.getNilHuruf();
        switch (nilaiHuruf)
        {
            case 'A':
                mhs.setPredikat("Apik");
                break;
            case 'B':
                mhs.setPredikat("Baik");
                break;
            case 'C':
                mhs.setPredikat("Cukup");
                break;      
            case 'D':
                mhs.setPredikat("Dablek");
                break;
            default:
                mhs.setPredikat("Elek");
                break;
      
        }
        
        
        System.out.println("NIM\t\t: " + mhs.getNim());
        System.out.println("Nama\t\t: " + mhs.getNama());
        System.out.println("Nilai\t\t: " + mhs.getNilai());
        System.out.println("Nilai Huruf\t: " + mhs.getNilHuruf());
        System.out.println("Predikat\t: " + mhs.getPredikat());

    }
}
