package com.wendeveloper;

public class Car {

    private String make;
    private String model;
    private int autoYear;
    private String color;
    private String id;

    //constructor blueprint------------------------------
    public Car( String make, String model, int autoYear, String color, String id) {

        //fields for Car object
        this.id = id;
        this.make = make;
        this.model = model;
        this.autoYear = autoYear;
        this.color = color;
    }

    //methods---------------------------------------------
    public String getId() {
        return id;
    }
    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getAutoYear() {
        return autoYear;
    }
    public String getColor() {
        return color;
    }

    public void setID(String id) {
        this.id = id;
    }

    public static String bookCar(String id){
        return(id);
    }
    public static String returnCar(String id){
        return(id);
    }

}
