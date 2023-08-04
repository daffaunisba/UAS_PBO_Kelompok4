/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package UAS_PBO;

/**
 *
 * @author Kelompok 4 UAS 
 * Teknik Informatika - Univ. Islam Balitar
 * 2022 - 2023
 */
public class Smartphone implements PPN {
    public String vendor;
    public String tipe;
    public double harga;
    
    // Constructor dengan tiga parameter (vendor, tipe, harga)
    public Smartphone(String vendor, String tipe, double harga){
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }
    
    // Implementasi method dari interface PPN
    @Override
    public double HargaSetelahPPN (double harga){
        if (harga == 5000000){
            return harga + (harga * PajakSamsung);
        } else if (harga == 4400000){
            return harga + (harga * PajakOppo);
        } else if (harga == 4100000){
            return harga + (harga * PajakXiaomi);
        } else {
            return harga;
        }
    }
    
    // Getter untuk mendapatkan harga setelah ditambahkan PPN
    public double getHargaSetelahPPN (){
        return HargaSetelahPPN(harga);
    }
    
    // Main method untuk pengujian
    public static void main(String[] args) {
        // Membuat objek smartphone dengan vendor Samsung, tipe A51, harga Rp 5,000,000.00 PPN 5%
        Smartphone samsung = new Smartphone("Samsung", "A51", 5000000.00);
        System.out.println("Harga Samsung setelah ditambah PPN: Rp" + samsung.getHargaSetelahPPN());

        // Membuat objek smartphone dengan vendor Oppo, tipe Reno 5, harga Rp 4,400,000.00 PPN 2%
        Smartphone oppo = new Smartphone("Oppo", "Reno 5", 4400000.00);
        System.out.println("Harga Oppo setelah ditambah PPN: Rp" + oppo.getHargaSetelahPPN());

        // Membuat objek smartphone dengan vendor Xiaomi, tipe A1, harga Rp 4,100,000.00 PPN 1%
        Smartphone xiaomi = new Smartphone("Xiaomi", "A1", 4100000.00);
        System.out.println("Harga Xiaomi setelah ditambah PPN: Rp" + xiaomi.getHargaSetelahPPN());
    }
}
