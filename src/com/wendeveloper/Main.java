package com.wendeveloper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // instances of Car class------------------------------------------------------------
        //Car( String make, String model, int autoYear, String color, String id)
        Car car1 = new Car("Subaru",   "Outback", 2011, "blue", "101");
        Car car2 = new Car("Mazda",    "CX-5",    2012, "blue", "102");
        Car car3 = new Car("Honda",    "Accord",  2013, "blue", "103");
        Car car4 = new Car("Toyota",   "Camry",   2014, "blue", "104");
        Car car5 = new Car("Mercedes", "Benz",    2015, "blue", "105");

        //array of availableCars getting id of each Car instance--------------------------
        List<Car> availableCars = new ArrayList<>();
        availableCars.add(car1);
        availableCars.add(car2);
        availableCars.add(car3);
        availableCars.add(car4);
        availableCars.add(car5);
        //System.out.println("Available: " + availableCars);
        for (int i = 0; i < availableCars.size(); i++){
            System.out.println("Available: " + availableCars.get(i).getId());
        }

        //array of bookedCars----------------------------------------------------------------
        List<Car> bookedCars = new ArrayList<>();
        System.out.println("Reserved: " + bookedCars);


        //user input--------------------------------------------------------------------------
        Scanner input = new Scanner(System.in);
        System.out.print("Enter rental ID to Reserve: ");
        String rentalId = Car.bookCar(input.nextLine());

        //book car----------------------------------------------------------------------------
        for(int i = 0; i < availableCars.size(); i++) {
            Car carData = null;
            if (rentalId.equals(availableCars.get(i).getId())) {
                //book the rental here--------------
                carData = availableCars.get(i);
                availableCars.remove(carData);  //remove car from available
                bookedCars.add(carData);        //reserve car
                //display cars reserved
                for (int j = 0; j < bookedCars.size(); j++){
                    System.out.println("Reserved: " + bookedCars.get(j).getId());
                }
            }
            //display available cars
            System.out.println("Available: " + availableCars.get(i).getId());
        }

        //return car--------------------------------------------------------------------------
        System.out.print("Enter rental ID to RETURN: ");
        rentalId = Car.returnCar(input.nextLine());
        for( int i = 0; i < bookedCars.size(); i++){
            Car carData = null;
            if(rentalId.equals(bookedCars.get(i).getId())) {
                //return the rental-----------
                carData = bookedCars.get(i);
                bookedCars.remove(carData);   // remove from bookedCars
                availableCars.add(carData);   // add to availableCars
                System.out.println("Reserved: " + bookedCars);

            }
            //System.out.println("Available: " + availableCars);

        }
        for (int i = 0; i < availableCars.size(); i++){
            System.out.println("Available: " + availableCars.get(i).getId());
        }

    }
}
