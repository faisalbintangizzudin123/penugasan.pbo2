
package com.bintang123penugasanpbo;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Benda {
    Scanner run = new Scanner(System.in);
    int semua;

    int[] kodebarang = new int[50];
    int[] harga = new int[50];
    int[] stok = new int[50];
    int[] nilai = new int[50];
    String[] nama = new String[50];

    public Benda(){

    }
    public void masukkanData(){
        try{
            for(int i=0;i < semua;i++){
                System.out.println("Produk nomer"+(i+1));
                System.out.println("nama produk \t \ttekan 0 jika tidak jadi : ");

                run.nextLine();
                kodebarang[i]=i+1;
                nama[i] = run.nextLine();

                if (nama[i].equals("0")){
                    break;
                }

                System.out.println("harga produk : ");
                harga[i]= run.nextInt();
                System.out.println("stok produk : ");
                stok[i]= run.nextInt();
                nilai[i]=stok[i]*harga[i];
            }
        }catch (InputMismatchException e){
            System.out.println("nomer yang anda masukkan harus angka ");
            run.nextLine();
            menu();
        }
    }
    public void menu(){
        do{
            System.out.println("masukkan nomer produk : ");
            semua = run.nextInt();

            if (semua <= 0){
                System.out.println("yang anda masukkan lebih dari 0");
            }else {
                masukkanData();
            }
        }while (semua <= 0);
    }
    public void getnilaidata(){
        for (int i =0; i < semua; i++){
            System.out.println("nomer produk : "+kodebarang[i]);
            System.out.println("nama produk : "+ nama[i]);
            System.out.println("harga produk : "+harga[i]);
            System.out.println("stok produk : "+stok[i]);
            System.out.println("nilai produk : "+nilai[i]);
        }
    }

}


 