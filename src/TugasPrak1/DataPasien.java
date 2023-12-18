/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak1;

/**
 *
 * @author Nadya Intan
 */
public class DataPasien {
    public static void main(String[] args) 
    {
    Sistem_Informasi_RumahSakit DataP;
    DataP = new Sistem_Informasi_RumahSakit();
    DataP.setjudul();
    System.out.println("------------------------------------");
    System.out.println("Id Pasien : "+ DataP.cetakIdPasien()); 
    System.out.println("Nama Pasien : "+ DataP.cetakNamaPasien());  
    System.out.println("Alamat : "+ DataP.cetakAlamat()); 
   
 }
}
