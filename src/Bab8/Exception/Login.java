/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bab8.Exception;

/**
 *
 * @author Nadya Intan
 */
public class Login {
    private String username, password;
    public String nama;
    public Login(){
        nama = "Nadya Intan Rayyano";
        username = "Nadya";
        password = "NadyaIntan";
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    boolean Ceklogin(String Username, String Password){
        if(username.equals(getUsername()) && password.equals(getPassword())){
            return true;
        }
        return false;
    }
}
