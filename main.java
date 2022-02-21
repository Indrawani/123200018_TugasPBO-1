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
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
    int pilih ;
    float celcius;
    boolean penentu = true;
    
    Scanner input = new Scanner(System.in);
      
      System.out.println("Nama : Indrawani ");
      System.out.println("NIM  : 123200018 ");
      System.out.println("");
      System.out.println("+---------------------------+");
      System.out.println("| PROGRAM KONVERSI SUHU AIR |");
      System.out.println("+---------------------------+");
      System.out.println("Input Data");
      System.out.println("-------------");
      System.out.print("Masukan Suhu Dalam Celcius : ");celcius = input.nextFloat();
      System.out.println("");
      konversi datakonversi = new konversi(celcius);
      System.out.println("");
      System.out.println("");
      
      do{
          System.out.println("");
          System.out.println("== Opsi ==");
          System.out.println("------------");
          System.out.println("1. Lihat Data Konversi");
          System.out.println("2. Edit Data Konversi");
          System.out.println("3. Exit ");
          System.out.print("Pilih : ");pilih = input.nextInt();
          
          if(pilih == 1){
            datakonversi.simpandata();
          }
          else if (pilih == 2){
              input = new Scanner(System.in);
              System.out.println("== Edit Data ==");
              System.out.println("-----------------");
              System.out.print("Masukan Suhu Dalam Celcius : ");datakonversi.celcius = input.nextInt();
              System.out.println("");
          }
          else if (pilih == 3){
              System.exit(0);
          }
          else{
              System.out.println("Opsi Tidak Ada, Mohon Masukan Opsi Dengan Benar!!!");
              penentu = true;
          }
          
          }while(penentu = true);
    }
}
        
 