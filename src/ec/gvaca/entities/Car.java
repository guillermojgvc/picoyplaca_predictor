package ec.gvaca.entities;

public class Car {
	
	private String plate;
	private int lastDigit;
	
	public Car(String plate){
		this.plate = plate;
		try{
			this.lastDigit = Integer.parseInt(plate.substring(plate.length()-1));
		}catch(NumberFormatException ne){
			System.out.println("Error at plate input " + ne.getMessage() );
		}
		
	}
	
	public String getPlate() {
		return plate;
	}
	public void setPlate(String plate) {
		this.plate = plate;
	}
	public int getLastDigit() {
		return lastDigit;
	}
	public void setLastDigit(int lastDigit) {
		this.lastDigit = lastDigit;
	}

}
