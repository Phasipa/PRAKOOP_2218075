/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN1BAB1;

/**
 *
 * @author Nadya Intan
 */
public class Main {
    public static void main(String[]args) {
        Kendaraan mobil = new Kendaraan();
        mobil.nama = "Mobil";
        mobil.warna = "Merah";
        mobil.merk = "Toyota";
        System.out.println("Nama Kendaraan : "+ mobil.nama);
        System.out.println("Nama Kendaraan : "+ mobil.warna);
        System.out.println("Merk Kendaraan : "+ mobil.merk);
        System.out.println("Jumlah Roda :"+ mobil.jmlroda(4)+"\n");
        System.out.println("Saat Maju :");
        mobil.kendaraanMaju();
        System.out.println("Saat Mundur :");
        mobil.kendaraanMundur();
        System.out.println("Saat Berhenti :"+ mobil.nama);
        mobil.kendaraanBerhenti();
    }
}
