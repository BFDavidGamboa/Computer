package com.gm.mundopc;

public class Monitor {
    private int monitorId;
    private String tradeMark;
    private double size;
    private static int monitorQuantity;

    private Monitor(){
        this.monitorId = ++monitorQuantity;
    }

    public Monitor(String tradeMark, double size){
        this();
        this.tradeMark = tradeMark;
        this.size = size;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }


    @Override
    public String toString() {
        return super.toString() + "Monitor{" +
                "monitorId=" + monitorId +
                ", tradeMark='" + tradeMark + '\'' +
                ", size=" + size +
                '}';
    }
}
