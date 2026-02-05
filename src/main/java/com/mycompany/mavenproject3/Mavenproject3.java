/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject3;

/**
 *
 * @author armir
 */import java.util.Scanner;
public class Mavenproject3 {



    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[]months={
        "January","February","March","April","May","June","July","August","September","October","November","December"};
        float[] temprature2023= new float[12];
        float[] temprature2024=new float[12];
        float sumtemprature2023=0;
        float sumtemprature2024=0;
        //-----------2023 temprature input-------//
        System.out.println("Enter temprature for the months of 2023:");
        for(int i=0;i<12;i++){
        System.out.print(months[i]+"=");
        temprature2023[i]=s.nextFloat();}
        
        
        //--------2024 temprature iput 2024----//
        System.out.println("Enter temprature for the months of 2024:");
        for(int i=0;i<12;i++){
        System.out.print(months[i]+"=");
        temprature2024[i]=s.nextFloat();}
        //-----Temprature display for 2023 and 2024----//
        
        System.out.println("\ntemprature for the months of 2023:");
        for(int i=0;i<12;i++)
        {System.out.println(months[i]+"="+temprature2023[i]+"Celcius");
            }
        System.out.println("\ntemprature for the months of 2024:");
        for(int i=0;i<12;i++){
        System.out.println(months[i]+"="+temprature2024[i]+"Celcius");
        }
        //------- True or false if the data is equal-----//
        //------Boolean true or false------//
        boolean dataisidentical=true;
        for(int i=0;i<12;i++){
        if(temprature2023[i] != temprature2024[i])
        {dataisidentical=false;}
        } System.out.println("Do the year 2023 and 2024 have the same data?");
        System.out.println("The answer is\t" + dataisidentical);
        
         
      
        
        
    }
}
