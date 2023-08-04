/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w07_Inheritance;

import java.util.Scanner;

/**
 *
 * @author M. Daffa Rafi Naufal
 * Teknik Informatika - Univ. Islam Balitar
 * 2022 - 2023
 */
public class MainTokoBuku extends TokoBuku {
    
    public static Scanner input = new Scanner (System.in);
    public static void main(String[] args) {
        System.out.println("Masukkan jumlah data yang ingin anda input : ");
        int jumData = input.nextInt();
        String[] JudulBuku = new String[jumData];
        String[] pengarang = new String[jumData];
        String[] penerbit = new String[jumData];
        int[] tahunCetak = new int[jumData];
        String[] kategori = new String[jumData];
        
        input.nextLine();
        for (int i = 0; i < jumData; i++){
            System.err.println("\nData Buku ke-" + (i + 1));
            System.out.println("Masukkan Judul Buku = ");
            JudulBuku[i] = input.nextLine();
            System.out.println("Masukkan Pengarang Buku = ");
            pengarang[i] = input.nextLine();
            System.out.println("Masukkan Penerbit Buku = ");
            penerbit[i] = input.nextLine();
            System.out.println("Masukkan Tahun Cetak = ");
            tahunCetak[i] = input.nextInt();
            
        input.nextLine();
            System.out.println("Masukkan Kategori Buku (su/r/d/a) = ");
            kategori[i] = input.nextLine();
            switch (kategori[i]){
                case "su":
                case "SU":
                    kategori[i] = "Semua Umur";
                    break;
                case "r":
                case "R":
                    kategori[i] = "Remaja";
                    break;
                case "d":
                case "D":
                    kategori[i] = "Dewasa";
                    break;
                case "a":
                case "A":
                    kategori[i] = "Anak";
                    break;
                default:
                    break;   
            } 
        }
        setTokoBuku(JudulBuku, pengarang, penerbit, tahunCetak, kategori);
        lihatBuku(jumData);
    }
    public static void lihatBuku(int jumData){
        System.out.println("\n=============================================");
        System.out.println("Hasil Output :");
        System.out.println("\n=============================================");
        for (int i = 0; i < jumData; i++){
            System.out.println("\nData Buku ke-"+(i + 1));
            System.out.println("===========================================");
            System.out.println("Judul Buku : "+getJudulBuku(i));
            System.out.println("Pengarang : "+getPengarang(i));
            System.out.println("Penerbit : "+getPenerbit(i));
            System.out.println("Tahun Cetak : "+getTahunCetak(i));
            System.out.println("Kategori : "+getKategori(i));
        }   
    }
    private static void setTokoBuku(String[] judulBuku, String[] pengarang, String[] penerbit, int[] tahunCetak, String[] kategori) {
        setJudulBuku(judulBuku);
        setPengarang(pengarang);
        setPenerbit(penerbit);
        setTahunCetak(tahunCetak);
        setKategori(kategori); 
    }
}



