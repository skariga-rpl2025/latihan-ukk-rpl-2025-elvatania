
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elvatania
 */
public class Latihan2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int suaraA = 0, suaraB = 0;
        String input;

        while (true) {
            System.out.print("Masukkan pilihan anda (A/B) atau ketik 'selesai': ");
            input = sc.nextLine();

            if (input.equalsIgnoreCase("selesai")) {
                break;
            } else if (input.equalsIgnoreCase("A")) {
                suaraA++;
            } else if (input.equalsIgnoreCase("B")) {
                suaraB++;
            } else {
                System.out.println("Input tidak valid!");
            }
        }

        System.out.println("=== HASIL HITUNG KANDIDAT ===");
        System.out.println("Total suara Kandidat A: " + suaraA);
        System.out.println("Total suara Kandidat B: " + suaraB);
    }
}


