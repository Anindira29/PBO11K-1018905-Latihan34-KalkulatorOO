/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif11k.pkg10118905.latihan34.calkulator;
import java.util.Scanner;
/**
 *
 * @author Fitri
 * Nama     : Anindira Dina Fitriani
 * Kelas    : IF11-K
 * Nim      : 10118905
 * Deskripsi: Program kalkulator
 */
public class PBOIF11K10118905Latihan34Calkulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        Kalkulator k = new Kalkulator();
        double bil1,bil2;
        System.out.println("=====Aplikasi Kalkulator Bilangan=====");
        System.out.println("Masukkan angka ke-1\t:");
        bil1 = input.nextDouble();
        k.value1 = bil1;
        System.out.println("Masukkan angka ke-2\t:");
        bil2 = input.nextDouble();
        k.value2 = bil2;
        System.out.println("");
        System.out.println("Hasil Pertambahan\t:"+k.tambahBilangan());
        System.out.println("Hasil Pengurangan\t:"+k.kurangBilangan());
        System.out.println("Hasil Perkalian\t"+k.kaliBilangan());
        System.out.println("Hasil Pembagian\t:"+k.bagiBilangan());
        System.out.println("Hasil Sisa\t:"+k.sisaBilangan());
    }
    
}
