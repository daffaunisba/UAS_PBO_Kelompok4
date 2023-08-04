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
public class Toni extends Kakek implements AyahInterface, IbuInterface{
    
    public static void main(String[] args) {
        Toni toni = new Toni();
        toni.cetak();
        toni.cetak1();
        toni.cetak2();
    }

    @Override
    public void cetak() {
        System.out.println("Ini Embah");
    }

    @Override
    public void cetak1() {
        System.out.println("Ini Ayah");
    }

    @Override
    public void cetak2() {
        System.out.println("Ini Ibu");
    }
}
