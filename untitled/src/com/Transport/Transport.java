package com.Transport;


public abstract class Transport {
    private int speed;
    private byte[] place;

    protected Transport(int speed, byte[] place){
        this.speed = speed;
        this.place = place;
        System.out.println("Object created");
        System.out.println(getValue());

    }

    protected void setValue (int speed, byte[] place){
        this.speed = speed;
        this.place = place;

    }

    protected String getValue (){
       // System.out.println("Object created");
        String info = "Speed: " + speed + "\n";
        String infoPlace = "Coordinate: \n";
            for(int i = 0; i < place.length; i++){
                infoPlace += place[i] + "\n";
                }
        return info + infoPlace;
    }




}
