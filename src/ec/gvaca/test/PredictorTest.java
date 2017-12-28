package ec.gvaca.test;

import static org.junit.Assert.*;

import org.junit.Test;

import ec.gvaca.entities.Car;
import ec.gvaca.enums.RestrictionDay;
import ec.gvaca.utils.DateTimeComparator;

public class PredictorTest {
	
	@Test
	public void driveRestrictedTime1(){
		boolean condition = false;
		String plate = "PCN-4431";
		String date = "01/01/2018";
		String time = "07:10";
		
		DateTimeComparator dateTimeComparator = new DateTimeComparator();
		dateTimeComparator.setTime(time);
		dateTimeComparator.setDate(date);
		Car car = new Car(plate);
		
		if(RestrictionDay.valueOf(dateTimeComparator.dayName()).getRange().contains(car.getLastDigit())){
			condition = dateTimeComparator.isRestrictedTime();
		}else{
			condition = false;
		}
		
		assertTrue("it could be true",condition);
	}
	
	@Test
	public void driveRestrictedTime2(){
		boolean condition = false;
		String plate = "PCN-4431";
		String date = "01/01/2018";
		String time = "18:43";
		
		DateTimeComparator dateTimeComparator = new DateTimeComparator();
		dateTimeComparator.setTime(time);
		dateTimeComparator.setDate(date);
		Car car = new Car(plate);
		
		if(RestrictionDay.valueOf(dateTimeComparator.dayName()).getRange().contains(car.getLastDigit())){
			condition = dateTimeComparator.isRestrictedTime();
		}else{
			condition = false;
		}
		
		assertTrue("it could be true",condition);
	}
	
	@Test
	public void driveNonRestrictedTime1(){
		boolean condition = false;
		String plate = "PCN-4431";
		String date = "01/01/2018";
		String time = "06:10";
		
		DateTimeComparator dateTimeComparator = new DateTimeComparator();
		dateTimeComparator.setTime(time);
		dateTimeComparator.setDate(date);
		Car car = new Car(plate);
		
		if(RestrictionDay.valueOf(dateTimeComparator.dayName()).getRange().contains(car.getLastDigit())){
			condition = dateTimeComparator.isRestrictedTime();
		}else{
			condition = false;
		}
		
		assertFalse("it could be false",condition);
	}

	@Test
	public void driveNonRestrictedTime2(){
		boolean condition = false;
		String plate = "PCN-4431";
		String date = "01/01/2018";
		String time = "10:21";
		
		DateTimeComparator dateTimeComparator = new DateTimeComparator();
		dateTimeComparator.setTime(time);
		dateTimeComparator.setDate(date);
		Car car = new Car(plate);
		
		if(RestrictionDay.valueOf(dateTimeComparator.dayName()).getRange().contains(car.getLastDigit())){
			condition = dateTimeComparator.isRestrictedTime();
		}else{
			condition = false;
		}
		
		assertFalse("it could be false",condition);
	}
}
