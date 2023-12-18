/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab5;

/**
 *
 * @author Nadya Intan
 */
public class staffmarketing extends karyawanoverriding{
    
    public staffmarketing(double gajiDasar) {
        super(gajiDasar);
    }
    
    @Override
    public double hitungTunjangan()
    {
        return gajiDasar * 0.1 + 200000;
    }
}
