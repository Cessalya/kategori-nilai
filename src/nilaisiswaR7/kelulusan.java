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
public class kelulusan {
    public static void main(String[] args){
           // TODO code application logic here
    
    //object
    siswa pelajar= new siswa ();
    
    //mengisikan atribut
    pelajar.nama="Chiko";
    pelajar.nilai=80;
    
    //menjalankan method
    pelajar.cetaknilai();
    
    if (pelajar.lulus()){
        System.out.println("Selamat Telah Lulus");
    }
    if (pelajar.tidaklulus()){
        System.out.println("Anda Harus Lebih Giat Lagi");
    }
            }
}
