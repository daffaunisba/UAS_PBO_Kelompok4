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
public class PersegiPanjang extends HitungLuas{
    
    int panjang = 20;
    int lebar = 10;
    
    @Override
    public void luas(){
        System.out.println("Luas = "+panjang*lebar);
    }
}





