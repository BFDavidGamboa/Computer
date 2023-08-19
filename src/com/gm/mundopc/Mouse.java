package com.gm.mundopc;

public class Mouse extends EntryDevices{
    private final int mouseId;
    private static int mouseCount;


     public Mouse(String entryType, String tradeMark){
        super(entryType, tradeMark);
        mouseId = ++mouseCount;
    }

    @Override
    public String toString() {
        return super.toString() + "Mouse{" +
                "mouseId=" + mouseId +
                ", mouseCounter=" + mouseCount +
                '}';
    }
}
