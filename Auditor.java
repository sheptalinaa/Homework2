/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mirea.kt.homework1;

public class Auditor extends Store {
    
   public void closeStore(Store str){
       String name = str.getName();
       if ("IKEA".equals(name)){
           str.setName(null);
       }
   }
   
   public void storeRebrand(Store str){
       String name = str.getName();
       if ("MacDonalds".equals(name)){
           str.setName("Вкусно и точка");
       }
       if (name == null){
           str.setName(null);
       }
       else{
           str.setName(name.substring(1));
       }
   }
    public Auditor(){    
    }
}
