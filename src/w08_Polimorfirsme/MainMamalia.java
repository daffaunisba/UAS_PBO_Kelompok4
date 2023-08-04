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
public class MainMamalia {
    
    public static void main(String[] args) {
        show (new Mamalia());
        show (new Sapi());
        show (new Limosin());
        show (new Brahman());
        show (new Kelinci());
    }
    
    public static void show(Object obj) {
        System.out.println(obj);
    }
}
