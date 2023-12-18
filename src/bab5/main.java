/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bab5;

/**
 *
 * @author Nadya Intan
 */
public class main {
    public static void main(String[] args) {
        manager Manager = new manager(8000000);
        staffmarketing staff = new staffmarketing(4500000);
        
        System.err.println("Tunjangn Manager : " + Manager.hitungTunjangan());
        System.err.println("Tunjangan Staff Marketing : " + staff.hitungTunjangan());
    }
}
