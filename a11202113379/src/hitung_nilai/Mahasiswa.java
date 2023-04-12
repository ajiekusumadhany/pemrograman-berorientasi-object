/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hitungnilai;

/**
 *
 * @author HP
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private int nilai;
    private char nHuruf;
    private String predikat;

    
    public void setNim(String nim){
        this.nim=nim;
    }
    public String getNim()
    {
        return nim;
    }
    
    public void setNama(String nama){
        this.nama=nama;
    }
    public String getNama(){
        return nama;
    }
    
    public void setNilai(int nilai){
        this.nilai=nilai;
    }
    public int getNilai(){
        return nilai;
    }
    
    public void setNhuruf(char nHuruf)
    {
        this.nHuruf=nHuruf;
    }
    
    public char getNilHuruf()
    {
        return nHuruf;
    }

    public void setPredikat(String predikat)
    {
        this.predikat=predikat;
    }
    public String getPredikat()
    {
        return predikat;
    }
  
}

