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
public class TokoBuku {
    static String [] judulBuku;
    private static String [] pengarang;
    private static String [] penerbit;
    private static int [] tahunCetak;
    private static String [] kategori;
    
    public static String getJudulBuku (int i){
        return judulBuku[i];
    }
    public static void setJudulBuku(String[]judulBuku){
        TokoBuku.judulBuku = judulBuku;
    }   
    public static String getPengarang(int i){
        return pengarang[i]; 
    }   
    public static void setPengarang(String[]pengarang){
        TokoBuku.pengarang = pengarang;   
    }
    public static String getPenerbit(int i){
        return penerbit[i]; 
    }   
    public static void setPenerbit(String[]penerbit){
        TokoBuku.penerbit = penerbit;
    }
    public static int getTahunCetak(int i){
        return tahunCetak[i]; 
    }   
    public static void setTahunCetak(int[]tahunCetak){
        TokoBuku.tahunCetak = tahunCetak;
    }
    public static String getKategori(int i){
        return kategori[i]; 
    }   
    public static void setKategori(String[]kategori){
        TokoBuku.kategori = kategori; 
    }
}




