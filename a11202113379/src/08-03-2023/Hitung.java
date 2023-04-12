public class Hitung{
    float panjang;
    float lebar;
    float luasPersegi;
    double phi;
    double jari;
    double luasLingkaran;

    void inputPersegi(float panjang, float lebar){
        this.panjang=panjang;
        this.lebar=lebar;
    }

    void inputLingkaran(double phi, float jari){
    this.phi=phi;
    this.jari=jari;
    }

    void hitungPersegi(){
        luasPersegi=(float) (this.panjang*this.lebar);
        System.out.println("Luas Persegi Panjang");
        System.out.println("====================");
        System.out.println("Panjang\t\t:"+this.panjang);
        System.out.println("Lebar\t\t:"+this.lebar);
        System.out.println("Luasnya\t\t:"+luasPersegi);
        System.out.println("====================");

    }

    void hitungLingkaran(){
        luasLingkaran=(double) (this.phi*this.jari*this.jari);
        System.out.println("Luas Lingkaran");
        System.out.println("====================");
        System.out.println("Nilai Phi\t:"+this.phi);
        System.out.println("Jari-jari\t:"+this.jari);
        System.out.println("Luasnya\t\t:"+luasLingkaran);
        System.out.println("====================");

    }
}