package com.gm.mundopc;

public class EntryDevices {
    private String entryType;
    private String tradeMark;

    public EntryDevices(String entryType, String tradeMark){
        this.entryType = entryType;
        this.tradeMark = tradeMark;
    }

    public String getEntryType() {
        return entryType;
    }

    public void setEntryType(String entryType) {
        this.entryType = entryType;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    @Override
    public String toString() {
        return super.toString() + "EntryDevices{" +
                "entryType='" + entryType + '\'' +
                ", tradeMark='" + tradeMark + '\'' +
                '}';
    }
}
