/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak1;

/**
 *
 * @author Nadya Intan
 */
public class Kesehatan extends DataResepobat implements tindakan{
    String iddokter;
    String namadokter;
    String poli;
    String diagnosis;
    
    @Override
    void setjudul()
    {
    System.out.println("Kartu Laporan Kesehatan Pasien");
    }
    void dataIddokter(String IdDokter)
    {
    this.iddokter= IdDokter;
    }
    public void datanamadokter(String NamaDokter)
    {
    this.namadokter = NamaDokter;
    } 
    void dataIdpasien(String IdPasien)
    {
    this.idpasien = IdPasien;
    } 
    @Override
    void datanamapasien(String NamaPasien)
    {
    this.namapasien = NamaPasien;
    }
    
    public void datapoli(String Poli)
    {
    this.poli = Poli;
    } 
    public void datadiagnosis(String Diagnosis)
    {
    this.diagnosis = Diagnosis;
    } 
    
    String cetakIdDoter()
    {
    return iddokter;
    }
    String cetakNamaDokter()
    {
    return namadokter;
    }
    @Override
     String cetakIdPasien()
    {
    return idpasien;
    }
    @Override
     String cetakNamaPasien()
    {
    return namapasien;
    }
    String cetakPoli()
    {
    return poli;
    }
    String cetakDiagnosis()
    {
    return diagnosis;
    }
    @Override
    public String Medis()
    {
        return "Kondisi Pasien yang Kritis";
    }
    @Override
    public String Operasi()
    {
        return "Tingkat keparahan atau progresivitas penyakit Pasien";
    }
    @Override
    public String Terapi()
    {
        return "Pertimbangan medis, keinginan pasien, dan kondisi-kondisi khusus ";
    }
   }

