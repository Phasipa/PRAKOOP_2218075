/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

/**
 *
 * @author Nadya Intan
 */
public class main {
    public static void main(String[] args) {
        Payment pay1 = new Payment(750000);
        
        pay1.titlePurchase(1);
        System.out.println("Credit Balance : " + pay1.creditBlance);
        System.out.println("Emoney Balance: " + pay1.emoneyBalance);
        System.out.println("Cash Balance : " + pay1.cashbalance);
        System.out.println("================================" );
        System.out.println("total payment : " + pay1.total);
        System.out.println("================================" );
        
        System.out.println(" payment with credit, ending balance"+ pay1.creditProses());
        System.out.println(" payment with E-Money, ending balance"+ pay1.emoneyProses());
        System.out.println(" payment with Cash, ending balance"+ pay1.cashProses());

    }
}
