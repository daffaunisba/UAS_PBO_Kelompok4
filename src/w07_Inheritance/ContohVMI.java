/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w07_Inheritance;

/**
 *
 * @author M. Daffa Rafi Naufal
 * Teknik Informatika - Univ. Islam Balitar
 * 2022 - 2023
 */


public class ContohVMI {
    public static void main(String[] args) {
        //syntax VMI
        //Superclass namaObj = new namaConstrSubClass();
        HitungLuas hitungLuas = new PersegiPanjang();
        System.out.println("Panjangnya = "+hitungLuas.panjang);
        System.out.println("Lebarnya = "+hitungLuas.lebar);
        hitungLuas.luas();
    }
}






