/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak1;

/**
 *
 * @author Nadya Intan
 */
public abstract class Pengobatan {
    private String Tindakan;
    abstract int hargaobat(); 
    
    public Pengobatan(String Tindakan){
        this.Tindakan = Tindakan;
    }
    public String getTindakan() {
        return Tindakan;
    }
    
    abstract void RawatInap();
    abstract void RawatJalan();
}
