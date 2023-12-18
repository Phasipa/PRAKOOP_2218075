/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak1;

/**
 *
 * @author Nadya Intan
 */
public class DataResepobat extends Abstract{
   String idpasien;
   String namapasien;
   private String kodeobat;
   String namaobat;
   int jumlahobat;
   int hargaobat;
   String dosis;
  
   void setjudul()
    {
    System.out.println("Resep Obat");
    }
   // penerapan Polimorfisme
    int jumlahobat(){
        return jumlahobat;
    }
   
    @Override
    public int hargaobat()
    {
       return hargaobat = jumlahobat * 45000;
    }   
    void dataidpasien(String IdPasien)
    {
        this.idpasien = IdPasien;
    }
    void datanamapasien(String NamaPasien)
    {
        this.namapasien = NamaPasien;
    }
    void datakodeobat(String KodeObat)
    {
        this.kodeobat = KodeObat;
    }
    public void datanamaobat(String NamaObat)
    {
        this.namaobat = NamaObat;
    }
    public void datahargaobat(int HargaObat)
    {
        this.hargaobat = HargaObat;
    }
    public void datadosis(String Dosis)
    {
        this.dosis = Dosis;
    }
    
    String cetakIdPasien()
    {
    return idpasien;
    }
    String cetakNamaPasien()
    {
    return namapasien;
    }
    String cetakKodeObat()
    {
    return kodeobat;
    }
    String cetakNamaObat()
    {
    return namaobat;
    }
    int cetakHargaObat()
    {
    return hargaobat;
    }
    String cetakDosis()
    {
    return dosis;
    }
    
}
