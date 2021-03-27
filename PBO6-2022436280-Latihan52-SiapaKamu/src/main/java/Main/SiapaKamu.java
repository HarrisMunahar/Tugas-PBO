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
public class SiapaKamu {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Dosen D;
        Mahasiswa Mh;
        Manusia M;
        
        D = new Dosen();
        Mh = new Mahasiswa();
        M = new Manusia();
        D.setNip("412278299930");
        D.setNama("Rizki Adam Kurniawan");
        D.setUmur(27);
        
        
        System.out.println("Nip Dosen" + D.getNip());
        D.Siapakamu();
        D.MengajarApa();
        
        // TODO code application logic here
    }
}
