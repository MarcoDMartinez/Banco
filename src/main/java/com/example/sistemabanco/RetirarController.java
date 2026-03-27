package com.example.sistemabanco;

public class RetirarController {
   private double cuenta;

   public RetirarController(double cuenta){
       this.cuenta = cuenta;
   }
   public String retirarDinero(double monto){
       if (cuenta.retirar(monto)){
           return "Retiro exitoso. Saldo : $" + cuenta.getSaldo();
       }else{
           return "Fondos insuficientes o monto invalido";
       }
   }


}
