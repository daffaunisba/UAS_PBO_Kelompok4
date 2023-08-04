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
public class Dangdut extends Penyanyi{
    String nama = "Maher Zain";

    @Override
    public String nama(String nama) {
        return this.nama = nama;
    }

    @Override
    public void genre(String genre) {
        System.out.println("Genre Dangdut");
    } 
}
