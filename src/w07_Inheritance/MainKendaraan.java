/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package w07_Inheritance;

import java.lang.reflect.Array;

/**
 *
 * @author M. Daffa Rafi Naufal
 * Teknik Informatika - Univ. Islam Balitar
 * 2022 - 2023
 */
public class MainKendaraan extends Kendaraan{

    @Override
    public void jalankan() {
        System.out.println("Matic");
    }

    @Override
    public void setMesin(String mesin){
        System.out.println("Besar mesin: "+mesin);
    }
    
    @Override
    public String getMesin(){
        return super.getMesin();
    }
        
    public static void main(String[] args) {
        //instansiasi object
        MainKendaraan mainKendaraan = new MainKendaraan();
        mainKendaraan.jalankan();
        mainKendaraan.setMesin("150 cc");
        System.out.println(mainKendaraan.getMesin());
    }
}


