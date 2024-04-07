package com.company.lesson8;

public class Duck extends Bird{

    public static final String DUCK_VOICE = "Quack Quack";
    public static final Integer SPEED_FLY = 40;
    public static final Integer SPEED_WALK = 4;
    public Duck() {
        super();
        System.out.println("public Duck()");
    }

    @Override
    public void voice() {
        System.out.println(DUCK_VOICE);
    }

    public void showSpeed(){
        if(flyNodeActive){
            System.out.println("Duck speed: " + SPEED_FLY);
        }else {
            System.out.println("Duck speed: " + SPEED_WALK);
        }
    }

}
