package entities;

import java.util.Date;

public class HourContract {
	
	private Date date;
	private Double ValuePerHaour;
	private Integer hours;
	
	public HourContract() {
		
	}

	public HourContract(Date date, Double valuePerHaour, Integer hours) {
		
		this.date = date;
		ValuePerHaour = valuePerHaour;
		this.hours = hours;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getValuePerHaour() {
		return ValuePerHaour;
	}

	public void setValuePerHaour(Double valuePerHaour) {
		ValuePerHaour = valuePerHaour;
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}
	
	public double totalValue() {
		
		return ValuePerHaour * hours;
	}
	
	

}
