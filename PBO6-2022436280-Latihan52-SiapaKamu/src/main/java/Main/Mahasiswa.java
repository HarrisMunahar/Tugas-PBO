/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

/**
 *
 * @author Funtsu
 */
public class Mahasiswa extends SiapaKamu {
    
    private String nama;
    private int umur;
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public int umur() {
        return umur;
    }
    
    public void setUmur(int umur) {
        this.umur = umur;
    }
    
    public void KelasApa () {
        Manusia M;
        M = new Manusia();
        System.out.println("Saya "+ nama +" umur "+ umur +" tahun sedang belajar di kelas " + M.getKelas());
    }
    
    public void SiapaKamu () {
        System.out.println("Saya Mahasiswa");
    }
    
}
