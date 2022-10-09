import java.io.*;
import java.time.LocalDate;

public class Venue implements Serializable {
	private String name;
	private String address;
	private String description;
	private String virtualTour;
	private LocalDate[] availableDates;

	public Venue(String name, String address, String description, String virtualTour, LocalDate[] availableDates) {
		this.name = name;
		this.address = address;
		this.description = description;
		this.virtualTour = virtualTour;
		this.availableDates = availableDates;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getDescription() {
		return description;
	}

	public String getVirtualTour() {
		return virtualTour;
	}

	public LocalDate[] getAvailableDates() {
		return availableDates;
	}

	public void setAvailableDates(LocalDate[] availableDates) {
		this.availableDates = availableDates;
	}

	public void update() {
		try (FileOutputStream fos = new FileOutputStream("venue.dat");
			 ObjectOutputStream oos = new ObjectOutputStream(fos)) {

			// write object to file
			oos.writeObject(this);

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}
}
