/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Nadya Intan
 */
public class LIngkaran {
    int r;
    double phi, luas;

    public LIngkaran(int r) {
        this.r = r;
        phi = 3.14;
    }
    void Deskripsi(){
        System.err.println("Ini adalah hasil menghitung");
    }
    double HitLuasLingkaran(){
        luas = (phi * r * r);
        return luas;
    }
    
}
