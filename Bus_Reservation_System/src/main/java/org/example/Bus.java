package org.example;

/**
 * Represents a Bus in the reservation system.
 * <p>
 * This class stores basic information about a bus such as its number,
 * whether it is air-conditioned (AC), and its seating capacity.
 * It provides simple getters and setters and a convenience method to
 * print the bus details to standard output.
 */
public class Bus {
    /** Unique bus number / identifier. */
    private int bus_no;

    /** True if the bus is air-conditioned (AC). */
    private boolean isAc;

    /** Seating capacity of the bus (number of seats). */
    private int capacity;

    /**
     * Construct a Bus with the given properties.
     *
     * @param bus_no   the bus number or identifier
     * @param isAc     true if the bus is air-conditioned
     * @param capacity seating capacity (number of seats)
     */
    public Bus(int bus_no, boolean isAc, int capacity) {
        this.bus_no = bus_no;
        this.isAc = isAc;
        this.capacity = capacity;
    }

    /**
     * Return the bus number / identifier.
     *
     * @return bus number
     */
    public int getBus_no() {
        return bus_no;
    }

    /**
     * Set the bus number / identifier.
     *
     * @param bus_no new bus number
     */
    public void setBus_no(int bus_no) {
        this.bus_no = bus_no;
    }

    /**
     * Returns whether the bus is air-conditioned.
     *
     * @return true if AC, false otherwise
     */
    public boolean isAc() {
        return isAc;
    }

    /**
     * Set whether the bus is air-conditioned.
     *
     * @param ac true if the bus should be marked as AC
     */
    public void setAc(boolean ac) {
        isAc = ac;
    }

    /**
     * Return the seating capacity of the bus.
     *
     * @return seating capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * Set the seating capacity of the bus.
     *
     * @param capacity new seating capacity
     */
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    /**
     * Print bus details to standard output in a human-readable form.
     * This is a convenience method used for simple demos or debugging.
     */
    public void getBusDetails() {
        System.out.println("Bus No: " + bus_no + ", AC: " + (isAc ? "Yes" : "No") + ", Capacity: " + capacity);
    }
}
