
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Elvatania
 */
public class Latihan3 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jumlah = 0;
        String ulang;

        do {
            System.out.print("Masukkan nama anggota: ");
            String nama = sc.nextLine();
            jumlah++;

            System.out.print("Daftar anggota lagi? [ya/tidak]: ");
            ulang = sc.nextLine();

        } while (ulang.equalsIgnoreCase("ya"));

        System.out.println("Total anggota terdaftar: " + jumlah);
    }
}


