/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adminparkmanager;

/**
 *
 * @author bagde
 */
public class DateTime {

	private int hours;

	private int mins;

	private int day;

	private int month;

	private int year;

        //default constructor
        DateTime()
        {
            hours = 0;

		mins = 0;

		day = 0;

		month = 0;

		year = 0;
        
        }

	//paramarized constructor

	DateTime(int hours, int mins, int day, int month, int year) {

		super();

		this.hours = hours;

		this.mins = mins;

		this.day = day;

		this.month = month;

		this.year = year;

	}



	public int getHours() {

		return hours;

	}



	public void setHours(int hours) {

		this.hours = hours;

	}



	public int getMins() {

		return mins;

	}



	public void setMins(int mins) {

		this.mins = mins;

	}



	public int getDay() {

		return day;

	}



	public void setDay(int day) {

		this.day = day;

	}



	public int getMonth() {

		return month;

	}



	public void setMonth(int month) {

		this.month = month;

	}



	public int getYear() {

		return year;

	}



	public void setYear(int year) {

		this.year = year;

	}

}
