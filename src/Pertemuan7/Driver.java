/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pertemuan7;

/**
 *
 * @author Nadya Intan
 */
public class Driver {
    public static void main(String[] args) {
        pembayaran Payment;
        Payment = new P0001();
        Payment.tampilkanMember();
        
        if (Payment instanceof P0001){
            P0001 p0001 = (P0001) Payment;
            System.err.println(" Jenis Member : " + p0001.member(p0001));
            System.err.println(" Total Pembelian : " + p0001.hitPembayaran(500000));
            System.err.println(" Sisa Saldo : " + p0001.potSaldo());
        }
    }
}
