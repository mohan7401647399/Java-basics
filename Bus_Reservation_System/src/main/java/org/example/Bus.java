package org.example;

public class Bus {
    private int bus_no;
    private boolean isAc;
    private int capacity;

    public Bus(int bus_no, boolean isAc, int capacity) {
        this.bus_no = bus_no;
        this.isAc = isAc;
        this.capacity = capacity;
    }

    public int getBus_no() {
        return bus_no;
    }

    public void setBus_no(int bus_no) {
        this.bus_no = bus_no;
    }

    public boolean isAc() {
        return isAc;
    }

    public void setAc(boolean ac) {
        isAc = ac;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void getBusDetails() {
        System.out.println("Bus No: " + bus_no + ", AC: " + (isAc ? "Yes" : "No") + ", Capacity: " + capacity);
    }
}
