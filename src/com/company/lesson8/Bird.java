package com.company.lesson8;

public class Bird extends Animal{
    protected boolean flyNodeActive = false;

    public Bird() {
        super(MoveType.FLY);
    }

    public final void takeOff(){
        this.flyNodeActive = true;
    }
    public final void landing(){
        this.flyNodeActive = false;
    }

    public void isTheBirdFlying(){
        System.out.println(
                flyNodeActive == true ? "Flying mode: yes" : "Flying mode: no"
        );
    }


    public boolean isFlyNodeActive() {
        return flyNodeActive;
    }

    public void setFlyNodeActive(boolean flyNodeActive) {
        this.flyNodeActive = flyNodeActive;
    }
}


