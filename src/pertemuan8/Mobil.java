/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

/**
 *
 * @author Nadya Intan
 */
public class Mobil extends Kendaraan implements Berjalan{
    public Mobil(String merek) {
        super(merek);
    }
    
    @Override
    void carabergerak(){
        System.err.println(" Bergerak maju melalui roda yang bersentuhan langsung dengan permukaan tanah. ");
    }
    
    @Override
    void kecepatanMax(){
        System.err.println(" 500km/h ");
    }
    
    @Override
    public void berjalan(){
        System.err.println(" mobil " + getMerek() + " Sedang berjalan di jalan raya");
    }
}
