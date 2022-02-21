/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.indra.program;

/**
 *
 * @author IIN
 */
public class konversi {

  float celcius; 
  public konversi(float celcius){
       this.celcius = celcius;
   }
  float fahrenheit(){
      return ((9*celcius)/5)+32;
  }
  float reamur(){
      return (4*celcius)/5;
  }
  double kelvin(){
      return celcius + 273.15;
  }
  
  void simpandata(){
       
      System.out.println("");
      System.out.println("Suhu Dalam Celcius    : " + celcius +" ° C");
      System.out.println("Suhu Dalam Fahrenheit : " + fahrenheit() + " F");
      System.out.println("Suhu Dalam Reamur     : " + reamur() + " R");
      System.out.println("Suhu Dalam Kelvin     : " + kelvin() + " K");
      
      if(celcius <= 0){
          System.out.println("Kondisi Air Membeku");
      }
      else if(celcius > 0 && celcius < 100){
          System.out.println("Kondisi Air Normal");
      }
      else if(celcius >= 100){
          System.out.println("Kondisi Air Mendidih");
      }
  }
}
