/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab5;

/**
 *
 * @author Nadya Intan
 */
public class karyawanoverriding {
    public double gajiDasar;
    
    public karyawanoverriding(double gajiDasar)
    {
        this.gajiDasar = gajiDasar;
    }
    
    public double hitungTunjangan()
    {
        return gajiDasar * 0.1;
    }
}
