package com.gm.mundopc;

public class Keyboard extends EntryDevices{
    private final int keyboardId;
    private static int keyboardCount;

    public Keyboard(String entryType, String tradeMark){
        super(entryType, tradeMark);
        keyboardId = ++keyboardCount;
    }

    @Override
    public String toString() {
        return super.toString() + "Mouse{" +
                "mouseId=" + keyboardId +
                ", keyboardCount= " + keyboardCount+
                '}';
    }
}
