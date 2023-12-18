/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan8;

/**
 *
 * @author Nadya Intan
 */
public class Payment extends Purchase implements  Cash, Credit, EMoney {
       double total, creditBlance, emoneyBalance, cashbalance;
       
       public Payment(double setTotal) {
           this.creditBlance = 1000000;
           this.emoneyBalance = 500000;
           this.cashbalance = 1500000;
           this.total = setTotal;
       }
    
       @Override
       void titlePurchase(int numberPurchase){
           System.out.println(" pembelian ke- "+ numberPurchase);;
       }
       @Override
       public double cashProses(){
           total = cashbalance - this.total;
           return total;
       }
       @Override
       public double creditProses(){
           total = creditBlance - this.total;
           return total;
       }
       @Override
       public double emoneyProses(){
           total = emoneyBalance - this.total;
           return total;
       }
}
