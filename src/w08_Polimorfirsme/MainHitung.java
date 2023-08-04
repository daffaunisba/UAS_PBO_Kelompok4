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
public class MainHitung {
    
    public static void main(String[] args) {
        System.out.println("========== Aplikasi Perhitungan Matematika ==========\n");
        tampilkanSemua();
        System.out.println("\n Terima Kasih\n");
    }
    
    public static void tampilkanSemua(){
        OperasiBilangan penjumlahan = new Penjumlahan();
        penjumlahan.setA(10.5);
        penjumlahan.setB(0.5);
        penjumlahan.tampilkan();
        
        OperasiBilangan pengurangan = new Pengurangan();
        pengurangan.setA(10.5);
        pengurangan.setB(0.5);
        pengurangan.tampilkan();
        
        OperasiBilangan perkalian = new Perkalian();
        perkalian.setA(10.5);
        perkalian.setB(0.5);
        perkalian.tampilkan();
        
        OperasiBilangan pembagian = new Pembagian();
        pembagian.setA(10.5);
        pembagian.setB(0.5);
        pembagian.tampilkan();
    }
}
