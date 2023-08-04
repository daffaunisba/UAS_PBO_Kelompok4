/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UAS_PBO;

import java.util.Scanner;

/**
 *
 * @author M. Daffa Rafi Naufal
 * Teknik Informatika - Univ. Islam Balitar
 * 2022 - 2023
 */
public class UAS2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); 
        int a = 100, b = 25, hasil;
        
        System.out.println("======Program Perhitungan Matematika======\n");
        System.out.println("a = 100, \t b = 25\n"); 
        System.out.println("1.Penjumlahan");
        System.out.println("2.Pengurangan");
        System.out.println("3.Perkalian");
        System.out.println("4.Pembagian"); 
        System.out.print("\nMasukkan Pilihan : "); 
        int pilihan = scanner.nextInt();


        switch (pilihan) {
            case 1 -> {
                hasil = a + b;
                System.out.println("\n100 + 25 = " + hasil);
                }
            case 2 -> { 
                hasil = a - b; 
                System.out.println("\n100 - 25 = " + hasil); 
            }
            case 3 -> { 
                hasil = a * b;
                System.out.println("\n100 * 25 = " + hasil);
                }
            case 4 -> { 
                hasil = a / b;
                System.out.println("\n100 / 25 = " + hasil);
                }
            default -> System.out.println("\nPilihan Anda Salah!");
        }
    }
    
 
}
