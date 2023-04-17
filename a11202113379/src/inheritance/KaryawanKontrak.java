/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author HP
 */
public class KaryawanKontrak extends Karyawan {
    int upahHarian;
    int jumlahHari;

    public KaryawanKontrak(String nama, int tunjanganAnak, int upahHarian, int jumlahHari) {
        super(nama, tunjanganAnak);
        this.upahHarian = upahHarian;
        this.jumlahHari = jumlahHari;
    }

    public int getUpahHarian() {
        return upahHarian;
    }

    public void setUpahHarian(int upahHarian) {
        this.upahHarian = upahHarian;
    }

    public int getJumlahHari() {
        return jumlahHari;
    }

    public void setJumlahHari(int jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    @Override
    public int hitungTotalGaji() {
        return (upahHarian * jumlahHari) + tunjanganAnak;
    }
}

