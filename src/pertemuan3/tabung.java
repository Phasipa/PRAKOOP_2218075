/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Nadya Intan
 */
public class tabung extends LIngkaran{
    int t;
    double volume,luaspermukaan;

    public tabung(int r, int t) {
        super(r);
       this.t = 20; 
    }
    double HitvolumeTabung(){
        volume = + ((phi * r * r)* t);
            return volume;
    }
    
    void Keterangan(){
        Deskripsi();
        System.err.println("Menghitung Volume Tabung");
    }
}
