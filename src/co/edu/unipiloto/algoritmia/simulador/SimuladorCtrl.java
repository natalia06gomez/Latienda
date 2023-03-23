/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unipiloto.algoritmia.simulador;

/**
 *
 * @author linan
 */
public class SimuladorCtrl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco miBanco=new Banco();
        miBanco.setNombre("Mi propio banco");
        miBanco.setCorreo("banco@gmail.com");
        miBanco.setNit("900000001");
        System.out.println(" DATOS DEL BANCO"+miBanco.toString());
        
        //Crea cuentas ahorro, corriente y CDT
        Ahorro ahorro01=new Ahorro(15, 0);
        Corriente corriente01=new Corriente(500000);
        CDT cdt01=new CDT (10000000, new Fecha(15, 6, 2022), 0, 12);
        //Crear cuenta
        Cuenta miCuenta=new Cuenta("Gonzalo Jimenez", "gonzaloj@gmail.com", "79000000", ahorro01,corriente01, cdt01, 0);
        //Asociar la cuenta al banco
        miBanco.setPrimera(miCuenta);
        //Mostrar banco
        System.out.println(" DATOS DEL BANCO"+miBanco.toString());
        //Consignar en ahorros 
        System.out.println("Cuenta de ahorros"+ahorro01.toString());
        ahorro01.consignar(500000);
        System.out.println("Cuenta de ahorros"+ahorro01.toString());
        System.out.println("Los intereses son "+ahorro01.calcularIntereses());
        System.out.println("Retiro 700000 es " + ahorro01.retirar(700000));
        System.out.println("Cuenta de ahorros"+ahorro01.toString());
        System.out.println("Abrir CDT");
        CDT miCDT=new CDT();
        miCDT.abrirCDT(new Fecha(21,3,2023), 3400000);
        System.out.println("CDT " + miCDT.toString());
    }
    
}
