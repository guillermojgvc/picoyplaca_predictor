package ec.gvaca.entities;

/**
 * 
 * @author Guillermo Vaca
 *
 */
public class Car {
	
	private String plate;
	private int lastDigit;
	
	/**
	 * Constructor for car object
	 * @param plate
	 */
	public Car(String plate){
		this.plate = plate;
		try{
			this.lastDigit = Integer.parseInt(plate.substring(plate.length()-1));
		}catch(NumberFormatException ne){
			System.out.println("Error at plate input " + ne.getMessage() );
		}
		
	}
	
	/**
	 * 
	 * @return getter plate number
	 */
	public String getPlate() {
		return plate;
	}
	
	/**
	 * 
	 * @param plate setter plate number to car
	 */
	public void setPlate(String plate) {
		this.plate = plate;
	}
	
	/**
	 * getter of lastDigit attribute
	 */
	public int getLastDigit() {
		return lastDigit;
	}
	
	/**
	 * 
	 * @param lastDigit setter of lastDigit attribute
	 */
	public void setLastDigit(int lastDigit) {
		this.lastDigit = lastDigit;
	}

}
