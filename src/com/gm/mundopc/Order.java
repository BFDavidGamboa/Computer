package com.gm.mundopc;

public class Order {
    private int orderId;
    private Computer[] computers;
    private int orderCount;
    private static int computerCount;
    private static final int MAX_COMPUTERS = 10;

    public Order(){
        this.orderId = ++orderCount;
        computers = new Computer[MAX_COMPUTERS];
    }

    public void addComputer(Computer computer){

        if(computerCount < MAX_COMPUTERS) {
            computers[computerCount++] = computer;
        } else {
            System.out.println("You can't buy more than this quantity" + MAX_COMPUTERS);
         }
    }
    public double totalCalculate(){
        double result = 0;

        for (Computer computer : computers) {
            if (computer != null) {
                result++;
            }
        }
        return result;
    }

    public void showOrder(){
        System.out.println("Orden  #:" + orderId);
        System.out.println("Computers in the order #" + orderId + ":");
        for (int i = 0; i < computerCount; i++) {
            System.out.println(computers[i]);
        }
    }

 }
