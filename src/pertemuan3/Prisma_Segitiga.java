/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Nadya Intan
 */
public class Prisma_Segitiga extends Segitiga{
    double tinggiprisma,vol;
    double VolumePrisma()
    {
        vol = (Luas() * tinggiprisma);
        return vol;
    }
}
