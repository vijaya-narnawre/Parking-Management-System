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
public class Car extends Vehicle {

	protected String CarColor;



	Car(String id, String brand, DateTime entryTime, String color) {

		super(id, brand, entryTime);

		this.CarColor = color;

	}

    



	// setter for vehicle engineSize

    /**
     *
     * @param color
     */

	public void setCarColor(String color) {

		CarColor = color;

	}



	// getter for vehicle engineSize

    /**
     *
     * @return
     */

	public String getCarColor() {

		return CarColor;

	}

}