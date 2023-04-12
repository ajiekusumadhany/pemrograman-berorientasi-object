public class Nilai{
    String nim;
    String nama;
    int nilaiTugas;
    int nilaiUts;
    int nilaiUas;
    float totalNilai;

    void masukkanNilai(String nim, String nama,
                        int nilaiTugas,
                        int nilaiUts,
                        int nilaiUas){
                            this.nim=nim;
                            this.nama=nama;
                            this.nilaiTugas=nilaiTugas;
                            this.nilaiUts=nilaiUts;
                            this.nilaiUas=nilaiUas;

                        }

    void tampilNilai(){
        System.out.println("Nim\t\t:"+this.nim);
        System.out.println("Nama\t\t:"+this.nama);
        System.out.println("Nilai Tugas\t\t:"+this.nilaiTugas);
        System.out.println("Nilai UTS\t\t:"+this.nilaiUts);
        System.out.println("Nilai UAS\t\t:"+this.nilaiUas);
    }

    void hitungNilai(){
        totalNilai=(float)(this.nilaiTugas+this.nilaiUts+this.nilaiUas)/3;
        System.out.println("Total Nilai\t\t:"+totalNilai);
        System.out.println("================");
        if(totalNilai>=75){
            System.out.println("Lulus");
        }else
        {
            System.out.println("Tidak Lulus");
        }
    }
}