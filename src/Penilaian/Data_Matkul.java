/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Penilaian;

/**
 *
 * @author Nadya Intan
 */
public class Data_Matkul {
    String kode_mk;
    String nama_mk;
    String dosen_pengampu;
    int jml_sks;
    
    void datakode (String kode_mk)
    {
        this.kode_mk = kode_mk;
    }
    void datanama(String nama_mk)
    {
        this.nama_mk = nama_mk;
    }
    void datadosen(String dosen_pengampu)
    {
        this.dosen_pengampu = dosen_pengampu;
    }
    void datasks(int jml_sks)
    {
        this.jml_sks = jml_sks;
    }
    String cetakkode()
    {
    return kode_mk;
    }
        String cetakmk()
    {
    return nama_mk;
    }
         String cetakdosen()
    {
    return dosen_pengampu;
    }
    int cetaksks()
    {
    return jml_sks;
    }

    public Data_Matkul() {
        this.kode_mk = "EF339";
        this.nama_mk = "OOP";
        this.dosen_pengampu = "Yosep Agus";
        this.jml_sks = 4;
    }
}
