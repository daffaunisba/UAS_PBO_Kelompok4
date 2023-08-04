/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w08_Polimorfirsme;

/**
 *
 * @author M. Daffa Rafi Naufal
 * Teknik Informatika - Univ. Islam Balitar
 * 2022 - 2023
 */
public class Penyanyi {
    
    String nama = "Tidak dikenal";
            
    public Penyanyi() {
        System.out.println("Nama Penyanyinya Null");
    }    

    public Penyanyi(String nama) {
        System.out.println("Nama Penyanyinya : "+nama);
    }
    
    public String nama(String nama){
        return this.nama = nama;
    }
    
    public  void genre(String genre){
        System.out.println("Genrenya Umum");
    }

}
