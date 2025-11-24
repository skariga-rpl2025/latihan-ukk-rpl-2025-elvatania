
import java.util.Scanner;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elvatania
 */
public class Latihan1 {
 
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== KALKULATOR MINI ===");
        System.out.println("1. Tambah");
        System.out.println("2. Kurang");
        System.out.println("3. Kali");
        System.out.println("4. Bagi");
        System.out.print("Pilih menu (1-4): ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        double hasil = 0;
        
        switch(pilihan){
            case 1 -> hasil = a + b;
            case 2 -> hasil = a - b;
            case 3 -> hasil = a * b;
            case 4 -> hasil = a / b;
            default -> System.out.println("Pilihan tidak valid");
    }
    
        System.out.println("Hasil: " + hasil);
    }
}