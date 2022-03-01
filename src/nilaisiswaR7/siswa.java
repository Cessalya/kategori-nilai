/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nilaisiswaR7;

/**
 *
 * @author LENOVO
 */
public class siswa {
    //mendefisinikan atribut
    String nama;
    int nilai;
    
    //mendefisinikan method cetak nilai
    public void cetaknilai(){
        System.out.println("nilai produktif RPL 7" +nama+ " adalah " +nilai);
    }
    //method mengecek lulus atau tidak
    public boolean lulus(){
        return nilai>=75;
    }
    public boolean tidaklulus(){
        return nilai<75;
    }
}
