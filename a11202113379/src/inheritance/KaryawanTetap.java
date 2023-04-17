/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
 *
 * @author HP
 */

public class KaryawanTetap extends Karyawan {
    int gajiPokok;

    public KaryawanTetap(String nama, int tunjanganAnak, int gajiPokok) {
        super(nama, tunjanganAnak);
        this.gajiPokok = gajiPokok;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(int gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    @Override
    public int hitungTotalGaji() {
        return gajiPokok + tunjanganAnak;
    }
}


