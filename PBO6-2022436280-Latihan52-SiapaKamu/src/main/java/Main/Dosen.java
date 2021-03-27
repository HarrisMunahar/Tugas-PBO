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
public class Dosen extends Mahasiswa {
    
    private String nip;
    private String matakuliah;
    
    public String getNip() {
        return nip;
    }
    
    public void setNip(String nip) {
        this.nip = nip;
    }
    
    public String getMatakuliah() {
        return matakuliah;
    }

    
    public void setMatakuliah(String matakuliah) {
        this.matakuliah = matakuliah;
    }
    
    public void MengajarApa() {
        Mahasiswa M;
        M = new Mahasiswa();
        
        System.out.println("Saya" + M.getNama() + "umur "+ M.umur() +" tahun sedang mengajar matakuliah " + matakuliah);
    }
    
    public void Siapakamu() {
        System.out.println("Saya Donsen");
    }
    
}
