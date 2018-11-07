package database;

public interface RealEstateInterface { //imobil
	
	public String getLocation();
	public void setLocation(String location);
	public Float getPrice();
	public void setPrice(Float price);
	public Float getArea();
	public void setArea(Float area);
	
	public void toFile();
	public void fromFile();
	
}
