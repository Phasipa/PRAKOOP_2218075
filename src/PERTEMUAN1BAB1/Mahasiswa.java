/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PERTEMUAN1BAB1;

/**
 *
 * @author Nadya Intan
 */
public class Mahasiswa {
   String nim, nama,JenisKelamin, prodi, angkatan,alamat;
    public void dataNIM(String Nim)
    {
    this.nim = Nim;
    } 
    public void dataNama(String Nama)
    {
    this.nama = Nama;
    }
    public void dataJenisKelamin(String JenisKelamin)
    {
    this.JenisKelamin = JenisKelamin;
    } 
    public void dataProdi(String Prodi)
    {
    this.prodi = Prodi;
    }
    public void dataAngkatan(String angkatan)
    {
    this.angkatan = angkatan;
    }
    public void dataAlamat(String alamat)
    {
    this.alamat = alamat;
    } 

    public String cetakNIM()
    {
    return nim;
    }
    public String cetakNama()
    {
    return nama;
    }
    public String cetakJenisKelamin()
    {
    return JenisKelamin;
    }
    public String cetakProdi()
    {
    return prodi;
    }
    public String cetakAngkatan()
    {
    return angkatan;
    }
    public String cetakAlamat()
    {
    return alamat;
    }
}


