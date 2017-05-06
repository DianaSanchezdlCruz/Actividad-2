/*
 * avtividad: 2.Identificación de objetos, declaración de clases y creación y uso de objetos.
 * Alumno: Diana Sanchez de la Cruz    16470289     MS-2  
 * Fecha de Entrega: o3 de mayo del 2017
 */
package model;

/**
 *
 * @author Sanchez de la Cruz
 */
public class CuentaDeAhorros {
        int numerodecuenta;
        String cliente;
        double saldo;
        public double saldo2;
        double tasaInteres = 0.3287;
        public double Interes;
        public double comision;
        double comisionporsaldo = 50;
        double cantidad;
        double retiro;
        public double Interes2;
        public double comision2;
        
        public CuentaDeAhorros (int numerodecuenta, String cliente){
            this.numerodecuenta = 1;
            this.cliente = "diana";
        }
        
        public double getSaldo(){
            return this.saldo;
        }
                
        public double depositar(double deposito)
        {
            this.cantidad = deposito;
            saldo = saldo + cantidad;
            return saldo;
        }

        public boolean retirar (double retirar)
         {
            boolean Saldox = true;
            this.retiro = retirar;
            if(retiro <= saldo) {
                saldo=saldo-retiro;
                Saldox = true;
            }
            else {
                if (retiro>saldo)
                {
                    Saldox = false;
                }

            }
            return Saldox;
          }
        
        public double calcularInteres (double periodo)
        {
            Interes = (tasaInteres * saldo)/100;
            Interes = Interes * periodo;
            return Interes;
        }
        
        public double calcularcomisionporsaldo(double periodo)
        {
            if(saldo < 1000) {
                comision = comisionporsaldo * periodo;
            }
            else
            {
                if(saldo >= 1000)
                {
                    comision = 0;
                }
            }
            return comision;
        }
        
        public double cortemensual (){
            
            saldo2 = saldo;
            Interes2 = (tasaInteres * saldo) / 100;
            
            if(saldo < 1000){
                comision2 = comisionporsaldo;
            }
            else
            {
                if(saldo >= 1000)
                {
                    comision2 = 0;
                }
            }
            
            saldo = saldo + Interes2;
            
            saldo = saldo - comision2;
            
            return saldo;
      }
        
        
}
   