/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author ASUS
 */
public abstract class Gaji {  
 public String Nama; 
 public int Gapok, t_hadir, j_lembur, Gatot, jmlhadir, jmlembur;

 public Gaji(){
     Gapok = 3000000; 
     t_hadir = 15000; 
     j_lembur = 25000; 
     jmlhadir = 0; 
     jmlembur = 0; 
 }

 public String Nama() {
 return Nama;
 }
 public void Nama(String Nama) { 
 this.Nama = Nama;
 }
 public void Jmlhadir(int jmlhadir) { 
 this.jmlhadir = jmlhadir;
 }
 public void Jlembur(int jmlembur) { 
 }
 int hitGaji() { 
 return Gatot;
 }
}
