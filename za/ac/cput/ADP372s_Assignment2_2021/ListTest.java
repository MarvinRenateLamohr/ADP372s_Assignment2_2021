package za.ac.cput.ADP372s_Assignment2_2021;

/**
 * Student Name: MARVIN RENATE LAMOHR
 * Student Number: 214273830
 **/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    List<String> listGroceries = new LinkedList<>();

    @BeforeEach
    void setUp(){
        listGroceries.add("Bread");
        listGroceries.add("Milk");
        listGroceries.add("Eggs");
        listGroceries.add("Toys");
        listGroceries.add("Cheese");
        listGroceries.add("Fruit");
    }

    @Test
    void addList(){
        System.out.println("List: "+listGroceries);
        System.out.println("List Size: "+listGroceries.size()+" Items"+"\n");

        assertEquals(6,+listGroceries.size());
    }

    @Test
    void deleteList(){
        listGroceries.remove("Toys");

        System.out.println("List after remove: "+listGroceries);
        System.out.println("List Size: "+listGroceries.size()+" Items"+"\n");

        assertEquals(5,+listGroceries.size());
    }

    @Test
    void findList(){
        Boolean data = listGroceries.contains("Fruit");

        System.out.println("Does the list contain the item 'Fruit'?: "+data+"\n"+"List: "+listGroceries+"\n");

        assertNotNull(listGroceries,"My wife loves shopping, There goes my budget");
    }
}