/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Nadya Intan
 */
public class maintabung {
    public static void main(String[]args){
        LIngkaran lkr = new LIngkaran(7);
        lkr.Deskripsi();
        System.err.println("Hasil adala : " + lkr.HitLuasLingkaran());
        System.err.println("==================================== ");
        tabung tbg = new tabung(7,20);
        tbg.Keterangan();
        System.err.println("volume tabung : "+ tbg.HitvolumeTabung());
    }
}
