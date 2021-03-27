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
public class Manusia extends Mahasiswa {
    
    private String nim;
    private String kelas;
    
    public String getNim() {
        return nim;
    }
    
    public void setNim() {
        this.nim = nim;
    }
    
    public String getKelas() {
        return kelas;
    }

    
    public void setKelas() {
        this.kelas = kelas;
    }
    
    public void Siapakamu() {
        System.out.println("Saya Manusia");
    }
    
}
