/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan6;

/**
 *
 * @author ASUS
 */
public class Manager extends Gaji{
 private String id_manager; 

 public Manager() {
 Gapok = 3400000; 
 t_hadir = 12000; 
 j_lembur = 26000; 
 }
 //method
 void Id_manager(String Id_Manager) { 
 this.id_manager = Id_Manager;
 }
String Id_manager() {
 return id_manager;
 }
 @Override
 int hitGaji() { 
 Gatot = Gapok + (jmlhadir * t_hadir) + (jmlembur * j_lembur); 
 return Gatot;
 }
 @Override
 public void Jmlhadir(int jmlhadir) { 
 this.jmlhadir = jmlhadir;
 }
 public void jmlembur(int jmlembur) { 
 this.jmlembur = jmlembur;
 }
}
