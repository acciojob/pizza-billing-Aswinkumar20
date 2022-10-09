package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    int cheeseCount;
    int toppingsCount;
    int paperBagCount;
    public Pizza(Boolean isVeg){
        this.cheeseCount = 0;
        this.toppingsCount =0;
        this.paperBagCount = 0;
        this.isVeg = isVeg;
        this.bill ="";


        // your code goes here
        if(isVeg){
            this.price = 300;
            this.bill += "Base Price Of The Pizza: 300\n";
//            System.out.println("Base Price Of The Pizza: "+ price);
        }else{
            this.price = 400;
            this.bill += "Base Price Of The Pizza: 400\n";
//            System.out.println("Base Price Of The Pizza: "+ price);

        }
    }


    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        int extraCheese = 80;
        if(this.cheeseCount == 0){
//            System.out.println("Extra Cheese Added: "+ extraCheese);
            this.price += 80;
            this.bill += "Extra Cheese Added: 80\n";
        }
        cheeseCount++;
    }

    public void addExtraToppings(){
        // your code goes here
        if(this.toppingsCount ==0 ){
            if(isVeg){
                this.price += 70;
                this.bill += "Extra Toppings Added: 70\n";
//                System.out.println("Extra Toppings Added: 70");
            }else {
                this.price += 120;
                this.bill += "Extra Toppings Added: 120\n";
//                System.out.println("Extra Toppings Added: 120");
            }
        }

        toppingsCount++;
    }

    public void addTakeaway(){
        // your code goes here
        if(this.paperBagCount == 0){
            this.price += 20;
            this.bill += "Paperbag Added: 20\n";
//        System.out.println("Paperbag Added: 20");
        }


        paperBagCount++;
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: " +price +"\n";
        return this.bill;
    }
}
