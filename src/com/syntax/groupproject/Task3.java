package com.syntax.groupproject;

public class Task3 {
    /*
    Create a Class Car that would have the following fields:   carPrice   and   color   and   method
    calculateSalePrice() which should be returning a price of the car.
    Create 2 sub classes: Sedan and Truck. The Truck class has field as weight and has its own implementation of
    calculateSalePrice() method in which returned price calculated as following:
    if weight>2000 then returned price car should include 10% discount, otherwise 20% discount.
    The Sedan class has field as length and also does it is own implementation of calculateSalePrice():
    if length of sedan is >20 feet then returned car price should include 5% discount, otherwise 10% discount
     */
}
class Car {
    double carPrice;
    String color;
    double disco;

    public Car(double carPrice,String color){
        this.carPrice=carPrice;
        this.color=color;
    }
    double calculateSalePrice(){
        return carPrice-carPrice*disco;
    }
}
class Sedan extends Car{
    int length;
    public Sedan(double carPrice,String color,int length){
        super( carPrice,color);
        this.length=length;
    }
    @Override
    double calculateSalePrice(){
        if(length>20){
            disco=0.05;
        }else{
            disco=0.1;
        }
        return carPrice -carPrice*disco;
    }
}
class Truck extends Car{
    int weight;
    public Truck(double carPrice,String colour,int weight){
        super(carPrice,colour);
        this.weight=weight;
    }
    @Override
    double calculateSalePrice(){
        if(weight>2000){
            disco=0.1;
        }else{
            disco=0.2;
        }
        return carPrice-carPrice*disco;
    }

}
class Test {
    public static void main(String[] args) {
        Sedan sedan=new Sedan(20_000, "White", 20);
        System.out.println(sedan.calculateSalePrice());
        Car truck=new Truck(50_000, "Black", 2350);
        System.out.println(truck.calculateSalePrice());
    }

}