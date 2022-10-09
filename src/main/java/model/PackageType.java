package main.java.model;

import java.util.List;

public class PackageType {
	private String name;
	private int guestCapacity;
	private List<String> availableVenues;
	private double cost;

	public PackageType(String name, int guestCapacity, double cost) {
		this.name = name;
		this.guestCapacity = guestCapacity;
		this.cost = cost;
	}

	public String getName() {
		return name;
	}
	public int getGuestCapacity() {
		return guestCapacity;
	}

	public List<String> getAvailableVenues() {
		return availableVenues;
	}

	public double getCost() {
		return cost;
	}
}
