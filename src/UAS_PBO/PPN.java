/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package UAS_PBO;

/**
 *
 * @author M. Daffa Rafi Naufal
 * Teknik Informatika - Univ. Islam Balitar
 * 2022 - 2023
 */
public interface PPN {
    double PajakSamsung = 0.05; // PPN 5%
    double PajakOppo = 0.02; // PPN 2%
    double PajakXiaomi = 0.01; // PPN 1%
    
    double HargaSetelahPPN (double harga);
       
}
