package com.company;

import com.company.lesson16.SwitchExample;
import com.company.lesson23.StringExample;
import com.company.lesson24.TypeConversion;
import com.company.lesson5.POJO;

import com.company.lesson8.Cat;
import com.company.lesson8.Dog;
import com.company.lesson8.Duck;
import com.company.lesson8.MoveType;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static com.company.lesson23.StringExample.run;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // lesson 5 - POJO
        POJO.run();

        // lesson 6 - Экземпляры класса
        com.company.lesson6.Animal animal = new com.company.lesson6.Animal();
        animal.voice();

        com.company.lesson6.Cat cat = new com.company.lesson6.Cat();
        cat.voice();

        // lesson 7 - Пакеты
        com.company.lesson7.Cat catFromLesson7 = new com.company.lesson7.Cat();
        catFromLesson7.voice();

        // lesson 8 - Методы
//        com.company.lesson8.Animal animalFrom8 = new com.company.lesson8.Animal();
//        animalFrom8.voice();

//        Animal animalFrom8WithProp = new Animal("any", 10);
//        animalFrom8WithProp.voice();

        Cat catFromLesson8 = new Cat("Barsik", 20);
        System.out.println(catFromLesson8.jumpHeight());

        // lesson 9 - Уровни методов в Java

        Dog dog = new Dog();
        dog.goToStick(14);
        dog.whereTheDog();

        dog.goToStick(20);
        dog.whereTheDog();

        dog.goToStick(15);
        dog.whereTheDog();


        Dog homelessDog = Dog.ofHomeless(10);
        dog.voice();

        // lesson 10 - Наследование
         Duck duck = new Duck();
        duck.voice();

        duck.takeOff();
        duck.isTheBirdFlying();
        duck.showSpeed();

        duck.landing();
        duck.isTheBirdFlying();
        duck.showSpeed();


        // lesson 13 - Массивы
        List<Dog> dogsHomeles = Arrays.asList( new Dog[] {
                Dog.ofHomeless(1),
                Dog.ofHomeless(2),
                Dog.ofHomeless(3),
                Dog.ofHomeless(14),
        });
        System.out.println(dogsHomeles.size());
        System.out.println("Треним геттеры и сеттеры");
        for (Dog dogItem: dogsHomeles){
            System.out.println(dogItem);
            // lesson 19 - Getter & Setter
            dogItem.setName(String.valueOf((new Random()).nextInt(10)));
//            System.out.println(dogItem.getName());
            System.out.println(dogItem);
            System.out.println("Прошла итерация");

        }
        System.out.println("Треним геттеры и сеттеры");
        System.out.println("");


        List<Dog> dogs = Dog.randomArray();
        for ( int i=0; i < dogs.size(); i++){
            System.out.println(dogs.get(i));
        }


        // lesson 15 - Циклы
        List<Dog> dogsLinkedList = new LinkedList<>();
        dogsLinkedList.add(Dog.ofHomeless(1));
        dogsLinkedList.add(Dog.ofHomeless(2));
        dogsLinkedList.add(Dog.ofHomeless(3));
        dogsLinkedList.add(Dog.ofHomeless(4));
        dogsLinkedList.add(Dog.ofHomeless(5));

        System.out.println("");

        int indexLinkedList = 0;
        while (indexLinkedList < dogsLinkedList.size()){
            System.out.println(dogsLinkedList.get(indexLinkedList));
            indexLinkedList++;
        }



        // lesson 16 - Switch
        System.out.println("");

//        for(int i = 0; i<100; i++){
////            SwitchExample.run();
//        }


        // lesson 17 - Уровни доступа

//        Animal animalExample = new Animal();
//        animalExample.voice();


        // lesson 20 - equals & hashCode
        Dog dogSharik = new Dog("Sharik", 5);
        Dog dogBobik = new Dog("Bobik", 4);
        Dog dogSharikVar1 = new Dog("Sharik", 5);

        System.out.println("Operation == return: " + (dogSharik == dogSharik));
        System.out.println("Operation == return: " + (dogSharik == dogBobik));
        System.out.println("Operation == return: " + (dogSharik == dogSharikVar1));

        System.out.println("");


        System.out.println("Operation equals return: " + (dogSharik.equals(dogSharik)));
        System.out.println("Operation equals return: " + (dogSharik.equals(dogBobik)));
        System.out.println("Operation equals return: " + (dogSharik.equals(dogSharikVar1)));



        // lesson 22 - Enum
        System.out.println("");
        System.out.println(duck.getMoveType());
        System.out.println(dog.getMoveType());

        if (dog.getMoveType() == MoveType.WALK){
            System.out.println("Может ходить");

        }

        // lesson 23 - String

        System.out.println("");
        StringExample.run();

        // lesson 24 - Преобразования типов
        System.out.println("");
        TypeConversion.run();





        // lesson 26 - Абстрактные классы



    }
}
