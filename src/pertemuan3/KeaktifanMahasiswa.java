/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan3;

/**
 *
 * @author Nadya Intan
 */
public class KeaktifanMahasiswa extends penilaian {
    int nilai_keaktifan;

    public KeaktifanMahasiswa() 
    {
        this.nilai_keaktifan = 0;        
    }
    
    double nilaiKeaktifan()
    {
        return ((nilai_keaktifan * 0.1) + nilaiAkhir());
    }
    
}
