package ec.gvaca.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import ec.gvaca.enums.RestrictionTime;

/**
 * Util class to do comparison with date and time
 * 
 * @author Guillermo Vaca
 *
 */
public class DateTimeComparator {

	private String time;
	private String date;
	
	/**
	 * Method that returns if a time is in range of Morning or Night
	 * 
	 * @return true if restricted, false if non-restricted
	 */
	public boolean isRestrictedTime(){
		return (compareMorning() || compareNight());
	}
	
	/**
	 * Method which compare morning range with user input time
	 * 
	 * @return true if are in range
	 */
	private boolean compareMorning(){
		return (RestrictionTime.Morning.initToDate().before(txtToDate(this.time)) && RestrictionTime.Morning.finishToDate().after(txtToDate(this.time)));
	}
	
	/**
	 * Method which compare night range with user input time
	 * 
	 * @return true if are in range
	 */
	private boolean compareNight(){
		return (RestrictionTime.Night.initToDate().before(txtToDate(this.time)) && RestrictionTime.Night.finishToDate().after(txtToDate(this.time)));
	}
	
	/**
	 * Method to convert time to date
	 * 
	 * @param time in String format
	 * @return Date from time String
	 */
	private Date txtToDate(String time){
		Date formatter = null;
		try {
			formatter = new SimpleDateFormat("HH:mm").parse(time);
		} catch (ParseException e) {
			e.printStackTrace();
		}finally{
			return formatter;
		}
	}
	
	/**
	 * Method to get the Day name from the given date as String
	 * 
	 * @return Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
	 */
	public String dayName(){
		Date formatter;
		String name = null;
		try {
			formatter = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH).parse(this.date);
			name = new SimpleDateFormat("EEEE",Locale.ENGLISH).format(formatter); 
		} catch (ParseException e) {
			e.printStackTrace();
		}finally{
			return name;
		}
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
