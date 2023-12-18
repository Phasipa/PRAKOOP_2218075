/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author ASUS
 */
public class Sekertaris extends Gaji{
    
 private String id_sekertaris; 
 public Sekertaris() {
 Gapok = 3300000; 
 t_hadir = 15000; 
 }

 void Id_sekertaris(String Id_sekertaris) { 
 this.id_sekertaris = Id_sekertaris;
 }
 String Id_sekertaris() { 
 return id_sekertaris;
 }
 @Override
 int hitGaji() { 
 Gatot = Gapok + (jmlhadir * t_hadir); 
 return Gatot;
 }
 @Override
 public void Jmlhadir(int jmlhadir) { 
 this.jmlhadir = jmlhadir;
 }

   
}
