package com.driver;

public class Pizza {

    private int price;
    private int toppings;
    private String bill;
    boolean isExtraCheeseAdded;
    boolean isExtraToppingAdded;
    boolean isTakeAway;

   boolean isBillCreated;
    public Pizza(Boolean isVeg){
        if(isVeg){
            this.price = 300;
            toppings = 70;
        }else{
            this.price = 400;
            toppings = 120;
        }
        this.isTakeAway = false;
        this.isExtraCheeseAdded = false;
        this.isExtraToppingAdded = false;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
        this.isBillCreated = false;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtraCheeseAdded){
           this.price += 80;
            isExtraCheeseAdded = true;
        }
        // your code goes here
    }

    public void addExtraToppings(){

        if(!isExtraToppingAdded){
            this.price += toppings;
            this.isExtraToppingAdded = true;
        }
        // your code goes here
    }

    public void addTakeaway(){
        if(!isTakeAway){
            this.price += 20;
            isTakeAway = true;
        }
        // your code goes here
    }

    public String getBill(){
        if(isBillCreated == false){
            if(isExtraCheeseAdded)
                this.bill += "Extra Cheese Added: 80" + "\n";
            if(isExtraToppingAdded){
                this.bill += "Extra Toppings Added: " + this.toppings + "\n";
            }
            if(isTakeAway){
                this.bill += "Paperbag Added: 20"+"\n";
            }
            this.bill += "Total Price: "+this.price;


            isBillCreated = true;
            return this.bill;
        }
        return "";

    }
}
