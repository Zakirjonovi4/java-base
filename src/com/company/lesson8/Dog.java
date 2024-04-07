package com.company.lesson8;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Dog extends Animal{

    public Dog(String name, Integer weight) {
        super(name, weight, MoveType.WALK);
    }

    public Dog() {
        super(MoveType.WALK);
    }

    /**
     * Идем до позиции палки. Чтобы дойти до палки, нужно определить разницу
     * между текущей позицией и позицией палки
     * @param stickPosition - Позиция палки
     */

    public void goToStick(Integer stickPosition){
        Integer delta = stickPosition - currentPosition;
        runForward(delta);
    }

    public  void whereTheDog(){
        System.out.println("Current position: " + currentPosition);
    }

    public static Dog ofHomeless(Integer weight){
        Dog dog = new Dog();
        dog.weight = weight;
        return dog;
    }

    public static Dog of(String name, Integer weight){
        return new Dog(name, weight);
    }

    @Override
    public void voice() {
        System.out.println("Wow!");
    }

    public static List<Dog> randomArray(){
        List<Dog> dogs = new ArrayList<>();

        Integer arraySize = (new Random()).nextInt(2,10);

        dogs.add(Dog.of("Sharik", 3));
        dogs.add(Dog.of("Bobik", 1));
        dogs.add(Dog.of("Tuzic", 5));

        return dogs;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", currentPosition" + currentPosition +
                '}';
    }
}
