/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.algoritmia.simulador;

/**
 *
 * @author linan
 */
class Corriente {
    
    //Atributos
    private double saldo;
    
    //Constructor

    public Corriente() {
    }

    public Corriente(double saldo) {
        this.saldo = saldo;
    }
    
    //Get y Set

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    //To string

    @Override
    public String toString() {
        return "Corriente{" + "saldo=" + saldo + '}';
    }
    
    
}
