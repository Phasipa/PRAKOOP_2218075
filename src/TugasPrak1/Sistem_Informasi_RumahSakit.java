/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak1;

/**
 *
 * @author Nadya Intan
 */
public class Sistem_Informasi_RumahSakit {
    
    String idpasien;
    String namapasien;
    String tgllahir;
    String jeniskelamin;
    String alamat;
    String no_tlpn;
    
    void setjudul()
    {
    System.out.println("Kartu Pasien Rumah Sakit Assyifa");
    }
    void dataIdpasien(String IdPasien)
    {
    this.idpasien = IdPasien;
    } 
    void datanamapasien(String NamaPasien)
    {
    this.namapasien = NamaPasien;
    }
    public void datatgllahir(String TanggalLahir)
    {
    this.tgllahir = TanggalLahir;
    }
    public void datatgllahir(String TanggalLahir, int dayOfBirth) 
    {
    this.tgllahir = TanggalLahir + " " + dayOfBirth;
    }
    public void datajeniskelamin(String JenisKelamin)
    {
    this.jeniskelamin= JenisKelamin;
    }
    void dataalamt(String Alamat)
    {
    this.alamat = Alamat;
    }
    public void datano_tlpn(String NoTlpn)
    {
    this.no_tlpn = NoTlpn;
    }
   

    String cetakIdPasien()
    {
    return idpasien;
    }
    String cetakNamaPasien()
    {
    return namapasien;
    }
    String cetakTanggalLahir()
    {
    return tgllahir;
    }
    String cetakJenisKelamin()
    {
    return jeniskelamin;
    }
    String cetakAlamat()
    {
    return alamat;
    }
    String cetakNoTlpn()
    {
    return no_tlpn;
    }

    public Sistem_Informasi_RumahSakit() {
        this.idpasien = "2218075";
        this.namapasien = "Nadya Intan Rayyano";
        this.tgllahir = "10 Mei 2023";
        this.jeniskelamin = "Perempuan";
        this.alamat = "Kota Malang";
        this.no_tlpn = "083420565126";
    }
}
