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
public class Pembagian extends OperasiBilangan {

    @Override
    public void tampilkan(){
        double a = this.getA();
        double b = this.getB();
        double hasil = A / B;
        
        System.out.println(A+" / "+B+" = " + hasil);
    }
}
