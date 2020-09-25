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
public class MotorBike extends Vehicle {

	protected int bikeEngineSize;



	MotorBike(String id, String brand, DateTime entryTime, int size) {

		super(id, brand, entryTime);

		this.bikeEngineSize = size;

	}



	// setter for vehicle engineSize

	public void setEngineSize(int size) {

		bikeEngineSize = size;

	}



	// getter for vehicle engineSize

	public int getEngineSize() {

		return bikeEngineSize;

	}

}
