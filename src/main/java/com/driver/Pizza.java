package com.driver;

public class Pizza {

    private int price;
    private String bill;
    private boolean isExtraCheesAdded;
    private boolean isExtraToppingAdded;
    private boolean isTakeAway;
    private  int toppings;
    private boolean isBillCreated;
    public Pizza(Boolean isVeg){
        if(isVeg == true){
            this.price = 300;
            toppings = 70;
        }else{
            this.price = 400;
            toppings = 120;
        }
        this.isTakeAway = false;
        this.isExtraCheesAdded = false;
        this.isExtraToppingAdded = false;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
        this.isBillCreated = false;
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(isExtraCheesAdded == false){
           this.price += 80;
            isExtraCheesAdded = true;
        }
        // your code goes here
    }

    public void addExtraToppings(){

        if(isExtraToppingAdded == false){
            this.price += toppings;
            this.isExtraToppingAdded = true;
        }
        // your code goes here
    }

    public void addTakeaway(){
        if(isTakeAway == false){
            this.price += 20;
            isTakeAway = true;
        }
        // your code goes here
    }

    public String getBill(){
        if(isBillCreated == false){
            if(isExtraCheesAdded)
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
        return "Bill is already created";

    }
}
