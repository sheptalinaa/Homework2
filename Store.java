package com.mirea.kt.homework1;


public class Store {
    private String storeName;
    private int productPrice;
    private String storeSection;
    private String goodsName;
    private int quantityOfGoods;
    
    
   
   public Store(){
    }
    
    public Store(String storeName, String goodsName, int productPrice, int quantityOfGoods, String storeSection){
        this.storeName = storeName;
        this.goodsName = goodsName;
        this.productPrice = productPrice;
        this.quantityOfGoods = quantityOfGoods;
        this.storeSection = storeSection;
    }
   
    public String getName(){
        return storeName;
    }
    
     public void setName(String storeName){
        this.storeName = storeName;
    }
     

    public int getProductPrice(){
        return productPrice;
    }
    
     public void setProductPrice(int productPrice){
         if (productPrice > 0){
        this.productPrice = productPrice;
         }
         else{
             System.out.println("Error!");
     }
    }
    
    public String getStoreSection(){
        return storeSection;
    }
    
     public void setStoreSection(String storeSection){
        this.storeSection = storeSection;
    }
     
    public String getNameOfGoods(){
        return goodsName;
    }
    
    public void setNameOfGoods(String goodsName){
        this.goodsName = goodsName;
    }
    public void setQuantityOfGoods(int quantityOfGoods){
        this.quantityOfGoods = quantityOfGoods;
    }
    
    public int getQuantityOfGoods(){
        return quantityOfGoods;
    }
    
    public void goToStore() {
        System.out.println("A person go to store.");
    }
    
    public void admiring () {
        System.out.println("A person admiring the flower.");
    }
    
    public void bought () {
        System.out.println("A person bought the flower.");
    }
    @Override
    public String toString() {
        return ("Name of Store:" + getName() + " Product:" + getNameOfGoods() + " Price: " + getProductPrice() + " Quantity: " + getQuantityOfGoods() + " Section: " + getStoreSection());
    }
    }
      
      
/*public int getProductPrice(){
        return productPrice;
    }
    
    public void setProductPrice(int productPrice){
        this.productPrice = productPrice;
    }
    
    public String getGoodsName(){
        return goodsName;
    }
    
     public void setGoodsName(String goodsName){
        this.goodsName = goodsName;
    }
     
    public String getNameOfGoods(){
        return goodsName;
    }
     
      public void setQuantityOfGoods(int quantityOfGoods){
        this.quantityOfGoods = quantityOfGoods;
    }
   
      public int getQuantityOfGoods(){
        return quantityOfGoods;
    }
      
      public void setStoreSection(String storeSection){
        this.storeSection = storeSection;
    }
      
      public String getStoreSection(){
        return storeSection;
    } */