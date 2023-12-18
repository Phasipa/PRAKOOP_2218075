/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Nadya Intan
 */
public class Limas_Segitiga extends Segitiga{
    double tinggilimas,vol;
    double volumeLimas()
    {
        vol = ((0.333 * Luas()) * tinggilimas);
        return vol;
    }
}
