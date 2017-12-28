package ec.gvaca.enums;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Enumerator class
 * 
 * @author Guillermo Vaca
 *
 */
public enum RestrictionTime {

	Morning("7:00","9:30"),
	Night("16:00","19:30");
	
	private String initTime;
	private String finishTime;
	
	/**
	 * Constructor
	 * 
	 * @param initTime
	 * @param finishTime
	 */
	RestrictionTime(String initTime,String finishTime){
		this.initTime = initTime;
		this.finishTime = finishTime;
	}
	
	/**
	 * Returns time in date format for comparison 
	 * 
	 * @return a date to compare time
	 */
	public Date initToDate(){
		Date formater = null;
		try {
			formater = new SimpleDateFormat("HH:mm").parse(this.initTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}finally{
			return formater;
		}
	}
	
	/**
	 * 
	 * Returns time in date format for comparison 
	 * 
	 * @return a date to compare time
	 */
	public Date finishToDate(){
		Date formater = null;
		try {
			formater = new SimpleDateFormat("HH:mm").parse(this.finishTime);
		} catch (ParseException e) {
			e.printStackTrace();
		}finally{
			return formater;
		}
	}
	
	public String getInitTime() {
		return initTime;
	}

	public String getFinishTime() {
		return finishTime;
	}
	
}
