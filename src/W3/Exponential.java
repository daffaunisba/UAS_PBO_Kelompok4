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
public class Exponential {

    private void hasil() {
        System.out.println("Hasil Perhitungan = "+hasil);
    }

    double hasil;
    
    public static void main(String[] args) {
//       rumus membuat obj
//       NamaClass namaObject = new namaConstructor();
        Exponential exponential = new Exponential();
    //   hasil();
        exponential.pangkat(3);
        exponential.hasil();
    }

    private double pangkat(int a) {
        double temp = Math.pow(a, 4);
        hasil = temp;
        return hasil;
    }
}