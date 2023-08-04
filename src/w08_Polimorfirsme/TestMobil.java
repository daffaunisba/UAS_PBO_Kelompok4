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
public class TestMobil {
    Mobil mobil1;
    
    public TestMobil(){
        mobil1 = new MobilBalap();
        MobilBalap mobil2 = (MobilBalap) mobil1;
    }
    
    public static void main(String[] args) {
        TestMobil testMobil = new TestMobil();
    }

}
