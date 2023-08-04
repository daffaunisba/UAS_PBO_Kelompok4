/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package W3;

/**
 *
 * @author M. Daffa Rafi Naufal
 * Teknik Informatika - Univ. Islam Balitar
 * 2022 - 2023
 */
import java.util.Scanner; 
public class Overloading {
    
    //Menghitung Luas Persegi
    public static void HitungLuas(double sisi){
        double luas = sisi * sisi;
        System.out.println("Luas Persegi adalah : " + luas);
    }
    
    //Menghitung Luas Persegi Panjang
    public static void HitungLuas(double panjang, double lebar){
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang adalah : " + luas);
    }
    
    //Menghitung Luas Segitiga
    public static void HitungLuas(double alas, double tinggi, String jenisSegitiga){
        double luas = alas * tinggi / 2;
        System.out.println("Luas " + jenisSegitiga + ": " + luas);
    }
   
    public static void main(String[] args) {
        double sisi, panjang, lebar, alas, tinggi;
        Scanner scan = new Scanner(System.in);
        
        System.out.println(" ========== Persegi ========== ");
        System.out.println("Input Sisi : ");
        sisi = scan.nextDouble();
        HitungLuas(sisi);
        
        System.out.println(" ========== Persegi Panjang ========== ");
        System.out.println("Input Panjang : ");
        panjang = scan.nextDouble();
        System.out.println("Input Lebar : ");
        lebar = scan.nextDouble();
        HitungLuas(panjang, lebar);
        
        System.out.println(" ========== Segitiga Siku Siku ========== ");
        System.out.println("Input Alas : ");
        alas = scan.nextDouble();
        System.out.println("Input Tinggi : ");
        tinggi = scan.nextDouble();
        HitungLuas(alas, tinggi, "Segitiga Siku-siku adalah : ");
        
    }

}
