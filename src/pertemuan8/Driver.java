/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

/**
 *
 * @author Nadya Intan
 */
public class Driver {
    public static void main(String[] args) {
        Mobil mobil = new Mobil("Toyota");
        mobil.berjalan();
        mobil.carabergerak();
        mobil.kecepatanMax();
        System.err.println("==================================");
        Pesawat pesawat = new Pesawat("Boeing 737");
        pesawat.carabergerak();
        pesawat.kecepatanMax();
        pesawat.berjalan();
        pesawat.terbang();
    }
}
