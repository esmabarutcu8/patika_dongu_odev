package kuvvet;
import java.util.Scanner;

public class Dongu_kuvvet {

    public static void main(String[]args){
        int sayi;
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        sayi=input.nextInt();

        for(int i=0;i<sayi;i*=4){
            System.out.println("4 ün kuvvetleri:");
            System.out.println(i);
        }

        for(int i=0;i<sayi;i*=5){
            System.out.println("5 in kuvvetleri:");
            System.out.println(i);
        }
    }
}
