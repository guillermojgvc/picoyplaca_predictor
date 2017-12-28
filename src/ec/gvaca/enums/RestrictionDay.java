package ec.gvaca.enums;

import java.util.ArrayList;
import java.util.List;



public enum RestrictionDay {
	Monday(1,2),
	Tuesday(3,4),
	Wednesday(5,6),
	Thursday (7,8),
	Friday(9,0), 
	Saturday(-1,-1),
	Sunday(-1,-1);
	
	private int lastDigit1;
	private int lastDigit2;
	
	RestrictionDay(int lastDigit1,int lastDigit2) {
		this.lastDigit1 = lastDigit1;
		this.lastDigit2 = lastDigit2;
	}
	
	public List<Integer> getRange(){
		List<Integer> range = new ArrayList<Integer>();
		range.add(lastDigit1);
		range.add(lastDigit2);
		return range;
	}
	
	public int getLastDigit1() {
		return lastDigit1;
	}

	public int getLastDigit2() {
		return lastDigit2;
	}

}
