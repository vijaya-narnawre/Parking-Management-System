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


interface CarParkManager {



	public abstract void addVehicle(); //public abstract methods held by the interface



	public abstract void deleteVehicle();



	public abstract void displayCurrentList();



	public abstract void printStatistics();



	public abstract void displayPerDayList();



	public abstract void displayParkingCharges();

}
