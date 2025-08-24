package BusBookingSystem;

public class Bus {
	private int BusNo;
	private boolean ac;
	private int capacity;

	Bus(int BusNo, boolean ac, int capacity) {
		this.BusNo = BusNo;
		this.ac = ac;
		this.capacity = capacity;
	}

	public int getBusNo() {
		return BusNo;
	}

	public boolean getAc() {
		return ac;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setBusNo(int num) {
		BusNo = num;
	}

	public void setAc(boolean val) {
		ac = val;
	}

	public void setCapacity(int cap) {
		capacity = cap;
	}

	public void displayBusInfo() {
		System.out.println("Bus No : " + BusNo + " Ac : " + ac + " Total Capacity : " + capacity);
	}
}
