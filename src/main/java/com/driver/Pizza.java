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
            price = 300;
            bill += "Base Price Of The Pizza: 300\n";
//            System.out.println("Base Price Of The Pizza: "+ price);
        }else{
            price = 400;
            bill += "Base Price Of The Pizza: 400\n";
//            System.out.println("Base Price Of The Pizza: "+ price);

        }
    }


    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        int extraCheese = 80;
        if(cheeseCount == 0){
//            System.out.println("Extra Cheese Added: "+ extraCheese);
            price += 80;
            bill += "Extra Cheese Added: 80\n";
        }
        cheeseCount++;
    }

    public void addExtraToppings(){
        // your code goes here
        if(toppingsCount ==0 ){
            if(isVeg){
                price += 70;
                bill += "Extra Toppings Added: 70\n";
//                System.out.println("Extra Toppings Added: 70");
            }else {
                price += 120;
                bill += "Extra Toppings Added: 120\n";
//                System.out.println("Extra Toppings Added: 120");
            }
        }

        toppingsCount++;
    }

    public void addTakeaway(){
        // your code goes here
        if(paperBagCount == 0){
            price += 20;
            bill += "Paperbag Added: 20\n";
//        System.out.println("Paperbag Added: 20");
        }


        paperBagCount++;
    }

    public String getBill(){
        // your code goes here
        bill += "Total Price: " +price +"\n";
        return this.bill;
    }
}
