/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unipiloto.algoritmia.simulador.tienda;

/**
 *
 * @author linan
 */
public class TiendaCtrl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Producto libreta=new Producto("Libreta de apuntes", Producto.PAPELERIA, 23, 15, 5500, 87);
       System.out.println(" OBJETO"+ libreta.toString());
       
       Producto leche=new Producto("Leche en blsa 1 litro", Producto.SUPERMERCADO, 150, 30, 2100, 30);
       System.out.println(" OBJETO"+ leche.toString());
       
       Producto jabon=new Producto("Jabon en polvo", Producto.SUPERMERCADO, 15, 50, 4200, 80);
       System.out.println(" OBJETO"+ jabon.toString());
       
       Producto aspirina=new Producto("Aspirina caja de 12 unidades", Producto.DROGUERIA, 60, 100, 2400, 200);
       System.out.println(" OBJETO"+ aspirina.toString());
    }
    
    //Exprsiones aritmeticas

    System.out.println("Expresiones aritmeticas 1: ");
    double leche=Leche.getCantidadBodega()- Leche.getCantidadMinima;
    System.out.println("leche: " + leche);
    double aspirina=Aspirina.getValorUnitario()/(Aspirina.getCantidadBodega()*12);
    System.out.println("aspirina: " + aspirina);
    double jabon=(Jabon.getTotalProductosVendidos() + Jabon.getCantidadBodega())*(Jabon.getValorUnitario()*Productos.IVA_MERCADO)
    System.out.printlnt("jabon: " + jabon);
    double libreta=LIbreta.getValorUnitario()*Libreta.getCantidadBodega()/Libreta.getCantidadMinima();
    System.out.printlnt("libreta" + libreta);
    leche=Leche.getValorUnitario()*Leche.getTotalProductosVendidos()*Productos.IVA_MERCADO;
    System.out.printlnt("leche" + leche);
    
    //Expresiones aritmeticas 2
    
    System.out.printlnt("Expresiones aritmeticas 2: ");
    aspirina=Aspirina.getValorUnitario()*(1+Productos.IVA_FARMACIA)*Aspirina.getTotalProductosVendidos()/Aspirina.getCantidadBodega();
    System.out.printlnt("aspirina: " + aspirina);
    double La_tienda=Marcador.getValorUnitario()

}