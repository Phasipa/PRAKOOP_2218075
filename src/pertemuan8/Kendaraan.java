/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

/**
 *
 * @author Nadya Intan
 */
public abstract class Kendaraan {
    private String merek;
    
    public Kendaraan (String merek){
        this.merek = merek;
    }

    public String getMerek(){
        return merek;
    }

abstract void carabergerak();
abstract void kecepatanMax();
        
}
