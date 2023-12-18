/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author Nadya Intan
 */
public class P0001 extends pembayaran{
    public String nama,alamat;
    public int saldo;
    public String kode;
    double diskon,bayar,total;
    
    public P0001(){
        this.nama = "Nadya Intan ";
        this.kode = "S0001";
        this.saldo = 3000000;
        this.alamat = "Malang";
    }
      
    @Override
    double cekKode(String input){
         if(input.compareTo(kode) == 0){
             diskon = 0.3;
         }
         else {
             diskon = 0;
         }
         return diskon;
     }
    @Override
    double hitPembayaran(double bayar){
         diskon = bayar * diskon;
         total = bayar - diskon;
         return total;
     }
     double potSaldo(){
         return this.saldo - total;
     }
    @Override
    void tampilkanMember(){
         System.err.println(" Member P0001 dengan Diskon 30%");
     }
}
