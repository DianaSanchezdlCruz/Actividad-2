/*
 avtividad: 2.Identificación de objetos, declaración de clases y creación y uso de objetos.
 * Alumno: Diana Sanchez de la Cruz    16470289     MS-2  
 * Fecha de Entrega: o3 de mayo del 2017
 */
package model;

/**
 *
 * @author Sanchez de la Cruz
 */
public class CuentaBasica {
    private int numerodecuenta; 
    private String cliente = null;
    private double saldo;
    private double cantidad;
    private double retiro;
    
    public CuentaBasica (int numerodecuenta, String cliente, int saldo)
    {
        this.numerodecuenta = 1;
        this.cliente = "diana";
        this.saldo = getSaldo();
      
    }

    public double getSaldo()
    {
        return this.saldo;
    }
    
    public double depositar(double deposito){
        this.cantidad = deposito;
        saldo = saldo + cantidad;
        return saldo;
    }
    
    public boolean retirar (double retirar) {
        boolean Saldox = true;
        this.retiro = retirar;
        if(retiro <= saldo)
        {
            saldo = saldo-retiro;
            Saldox = true;
        }
        else
        {
            if (retiro > saldo)
            {
                Saldox =false;
            }
 
        }
        return Saldox;

    }
    
}

