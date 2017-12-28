package ec.gvaca.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import ec.gvaca.enums.RestrictionTime;

public class DateTimeComparator {

	private String time;
	private String date;
	
	public boolean isRestrictedTime(){
		return (compareMorning() || compareNight());
	}
	
	private boolean compareMorning(){
		return (RestrictionTime.Morning.initToDate().before(txtToDate(this.time)) && RestrictionTime.Morning.finishToDate().after(txtToDate(this.time)));
	}
	
	private boolean compareNight(){
		return (RestrictionTime.Night.initToDate().before(txtToDate(this.time)) && RestrictionTime.Night.finishToDate().after(txtToDate(this.time)));
	}
	
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
