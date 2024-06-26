package com.company.lesson8;

public class Cat extends Animal{
    public Cat(String name, Integer weight) {
        super(name, weight, MoveType.WALK);
    }

    public Cat() {
        super(MoveType.SWIM);
    }


    private int heightCoefficient(Integer weight){
        if(weight > 10){
            return 120;
        }

        return 90;
    }
    public int jumpHeight(){
        if(this.weight == null) return 300;
        return heightCoefficient(this.weight);
    }

    @Override
    public void voice() {
        System.out.println("Meow");
    }
}
