package za.ac.cput.ADP372s_Assignment2_2021;

/**
 * Student Name: MARVIN RENATE LAMOHR
 * Student Number: 214273830
 **/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedHashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {
    Set<String> setPlay = new LinkedHashSet<>();

    @BeforeEach
    void setUp(){
        setPlay.add("SuperSport 1");
        setPlay.add("SuperSport 2");
        setPlay.add("SuperSport 3");
        setPlay.add("SuperSport 4");
        setPlay.add("SuperSport 5");
        setPlay.add("SuperSport 6");
        setPlay.add("SuperSport 51");
    }

    @Test
    void addSet(){
        System.out.println("Set: "+setPlay);
        System.out.println("Set Size: "+setPlay.size()+" Channels"+"\n");

        assertEquals(7,+setPlay.size());
    }

    @Test
    void deleteSet(){
        setPlay.remove("SuperSport 51");

        System.out.println("Set after remove: "+setPlay);
        System.out.println("Set Size: "+setPlay.size()+" Channels"+"\n");

        assertEquals(6,+setPlay.size());
    }

    @Test
    void findSet(){
        Boolean data = setPlay.contains("SuperSport 4");

        System.out.println("Does the set contain the channel 'SuperSport 4'?: "+data+"\n"+"Set: "+setPlay+"\n");

        assertNotNull(setPlay,"Lets watch some sport");
    }
}