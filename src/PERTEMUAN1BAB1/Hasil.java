/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN1BAB1;

/**
 *
 * @author Nadya Intan
 */
public class Hasil {
    public static void main(String[] args) {
    Mahasiswa mhs = new Mahasiswa(); 
    mhs.dataNIM("2118112");
    mhs.dataNama("Firman Frezy Pradana");
    mhs.dataJenisKelamin("Laki-laki ");
    mhs.dataProdi("Teknik Informatika");
    mhs.dataAngkatan("2021");
    mhs.dataAlamat("Malang");
    System.out.println("Kartu Tanda Mahasiswa ITN Malang");
    System.out.println("------------------------------------");
    System.out.println("NIM : "+ mhs.cetakNIM()); 
    System.out.println("Nama : "+ mhs.cetakNama()); 
    System.out.println("Jenis Kelamin : "+ mhs.cetakJenisKelamin()); 
    System.out.println("Prodi : "+ mhs.cetakProdi()); 
    System.out.println("Angkatan : "+ mhs.cetakAngkatan()); 
    System.out.println("Alamat : "+ mhs.cetakAlamat()); 
 }
}

