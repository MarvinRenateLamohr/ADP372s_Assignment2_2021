package za.ac.cput.ADP372s_Assignment2_2021;

/**
 * Student Name: MARVIN RENATE LAMOHR
 * Student Number: 214273830
 **/

import java.util.LinkedList;

public class List {
    java.util.List<String> listGroceries = new LinkedList<>();

    public void addList(String list){
        listGroceries.add("Bread");
        listGroceries.add("Milk");
        listGroceries.add("Eggs");
        listGroceries.add("Toys");
        listGroceries.add("Cheese");
        listGroceries.add("Fruit");

        System.out.println(list);
    }

    public void deleteSet(Integer list){
        listGroceries.remove(3);

        System.out.println("After removing " +list+ " there will be 5 items left");
        String data = listGroceries.get(list);

        System.out.println(data);
    }

    public void findSet(){
        String data = listGroceries.get(1);

        System.out.println(data);
    }
}
