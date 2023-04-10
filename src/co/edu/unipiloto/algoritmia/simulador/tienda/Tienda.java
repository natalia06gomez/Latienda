/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.algoritmia.simulador.tienda;

/**
 *
 * @author linan
 */
public class Tienda {
    
    //Atributos
    private Producto p1;
    private Producto p2;
    private Producto p3;
    private Producto p4;
    
    
    public Tienda() {
    }

    public Tienda(Producto p1, Producto p2, Producto p3, Producto p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }
    
    //Get y Set

    public Producto getP1() {
        return p1;
    }

    public void setP1(Producto p1) {
        this.p1 = p1;
    }

    public Producto getP2() {
        return p2;
    }

    public void setP2(Producto p2) {
        this.p2 = p2;
    }

    public Producto getP3() {
        return p3;
    }

    public void setP3(Producto p3) {
        this.p3 = p3;
    }

    public Producto getP4() {
        return p4;
    }

    public void setP4(Producto p4) {
        this.p4 = p4;
    }

    @Override
    public String toString() {
        return "Tienda{" + "p1=" + p1 + ", p2=" + p2 + ", p3=" + p3 + ", p4=" + p4 + '}';
    }
    
    
    
    
}
