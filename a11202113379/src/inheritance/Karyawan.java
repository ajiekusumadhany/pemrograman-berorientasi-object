/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author HP
 */
public class Karyawan {
    String nama;
    int tunjanganAnak;

    public Karyawan(String nama, int tunjanganAnak) {
        this.nama = nama;
        this.tunjanganAnak = tunjanganAnak;
    }

    public String getNama() {
        return nama;
    }

    public int getTunjanganAnak() {
        return tunjanganAnak;
    }

    public int hitungTotalGaji() {
        return 0;
    }

}

