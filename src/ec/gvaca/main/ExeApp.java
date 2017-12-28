package ec.gvaca.main;

import java.util.Scanner;

import ec.gvaca.entities.Car;
import ec.gvaca.enums.RestrictionDay;
import ec.gvaca.utils.DateTimeComparator;

public class ExeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input the plate as text");
		String plate = in.nextLine();
		System.out.println("Input date as text in format dd/mm/yyyy");
		String date = in.nextLine();
		System.out.println("Input time as text in format HH:MM");
		String time = in.nextLine();
		System.out.println("Please wait...");
		in.close();
		DateTimeComparator dateTimeComparator = new DateTimeComparator();
		dateTimeComparator.setTime(time);
		dateTimeComparator.setDate(date);
		Car car = new Car(plate);
		
		//Prediction Logic
		if(RestrictionDay.valueOf(dateTimeComparator.dayName()).getRange().contains(car.getLastDigit())){
			System.out.println(dateTimeComparator.isRestrictedTime() ? "Whops! You can't drive at this moment. Sorry :( ":"You can drive this moment " + dateTimeComparator.dayName() + " at " + dateTimeComparator.getTime());
		}else{
			System.out.println("Don't worry you can drive without restrictions this " + dateTimeComparator.dayName());
		}
			
	}

}
