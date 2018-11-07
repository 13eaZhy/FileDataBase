package database;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Apartment implements RealEstateInterface{
	private String location; //Location (City, Street, Number)
	private Float price;     //Price / Offer (currency,amount)
	private Float area;    
	private Integer rooms;
	
	//CONSTRUCTOR
	public Apartment(String location, Float price, Float area, Integer rooms) {
		this.location = location;
		this.price = price;
		this.setArea(area);
		this.rooms = rooms;
	}
	
	
	//GETTERS AND SETTERS
	public String getLocation() {
		return location;
	}
	
	public void setLocation(String location) {
		this.location = location;
	}
	public Float getPrice() {
		return price;
	}
	public void setPrice(Float price) {
		if (price >= 3000){
		this.price = price;
		} else {
			System.err.println("ERROR, wrong price value (>=3000 euro)");
		}
	}
	public Float getArea() {
		return area;
	}
	public void setArea(Float area) {
		if (area>=10){
		this.area = area;
		} else {
			System.err.println("ERROR, wrong area value (>=10m2)");
		}
	}
	public Integer getRooms() {
		return rooms;
	}
	public void setRooms(Integer rooms) {
		if (rooms>=1){
		this.rooms = rooms;
		} else {
			System.err.println("ERROR, wrong rooms value (>= 1 room)");
		}
	}
	
	//Casting
	public String toString(){
		return String.format(
				"APARTMENT\n"+
				"\t%s\n"+
				"\t%.2f Lei \n"+
				"------------\n"+
				"\t%.1f m2 (%d rooms)", // folosind ? daca avem 1 - room daca 8 - rooms
				this.location,
				this.price,
				this.area,
				this.rooms
				);
	}


	
	public void toFile() {
		String file_name = this.hashCode()+ ".txt";
		try{
		BufferedWriter bf = new BufferedWriter(new FileWriter( file_name ));
		bf.write(
				String.format(
						   "%s\n%.2f\n%.1f\n%d",
						   this.location,
						   this.price,
						   this.area,
						   this.rooms
						)
				);
			bf.close();
		} catch (IOException e){
			System.err.println("CANNOT SAVE FILE !");
		}
	}


	
	public void fromFile() {
		
		
	}
	
	
}
