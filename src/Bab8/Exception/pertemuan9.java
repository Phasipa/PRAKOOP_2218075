/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.Exception;

import javax.swing.JOptionPane;
import java.util.Scanner;

/**
 *
 * @author Nadya Intan
 */
public class pertemuan9 {

    public static void main(String[] args) {
        try {
            int a, b, hasil;
            Scanner keyboard = new Scanner(System.in);
            System.out.println("=====Program Pembagian=====");
            System.out.println("Masukkan angka 1 =  ");
            a = Integer.parseInt(keyboard.next());
            System.err.println("Masukkan angka ke 2 = ");
            b = Integer.parseInt(keyboard.next());
            hasil = a / b;
            System.err.println(Integer.toString(hasil));
        } catch (ArithmeticException c) {
            JOptionPane.showMessageDialog(null, "Nilai pembagi tidak boleh 0 !!", "Wrning", 2);
        } catch (NumberFormatException d) {
            JOptionPane.showMessageDialog(null, "Inputan yang anda masukkan bukan angka !!", "Wrning", 2);
        } finally {
            System.err.println("Terimakasih sudah menjalankan program");
        }
    }
}
