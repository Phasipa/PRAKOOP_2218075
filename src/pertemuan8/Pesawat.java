/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

/**
 *
 * @author Nadya Intan
 */
public class Pesawat extends Kendaraan implements Berjalan, Terbang{
  
    public Pesawat(String merek){
        super(merek);
    }
    
    @Override
    void carabergerak(){
        System.err.println(" Pesawat bergerak dalam udara dengan menggunkan mesin mesin yang untuk terbang");
    }
    
    @Override
    void kecepatanMax(){
        System.err.println(" 900 km/h ");
    }
    
    @Override
    public void berjalan(){
        System.err.println(" Pesawat" + getMerek() + "berjalan meju melalui roda yang bersentuhan dengan permukaan tanah");
    }
    
    @Override
     public void terbang(){
        System.err.println(" pesawat" + getMerek() + "Mesin yang berkecepatan tinggi,baling2 dan sayap aerodinamic memungkinkan pesawat untuk lepas landas");
    }
}
