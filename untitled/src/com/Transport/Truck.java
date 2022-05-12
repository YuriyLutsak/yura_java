package com.Transport;

public class Truck extends Transport{
   private boolean isLoaded;

   protected Truck(int speed, byte[] place, boolean isLoaded){
       super(speed, place);
      // super.setValue(speed, place);
       this.isLoaded = isLoaded;
       System.out.println(isLoaded());
   }

   // @Override
    protected void setValue(int speed, byte[] place, boolean isLoaded) {
        super.setValue(speed, place);
        this.isLoaded = isLoaded;

    }

    protected String isLoaded() {
       if (isLoaded == true)
        return "Truck is loaded";
       else
           return "Truck is empty";
    }
}
