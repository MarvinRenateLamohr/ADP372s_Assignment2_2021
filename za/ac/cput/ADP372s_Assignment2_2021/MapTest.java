package za.ac.cput.ADP372s_Assignment2_2021;

/**
 * Student Name: MARVIN RENATE LAMOHR
 * Student Number: 214273830
 **/

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {
    Map <String,String> mapProvince = new LinkedHashMap<>();

    @BeforeEach
    void setUp(){
        mapProvince.put("k1","WESTERN CAPE");
        mapProvince.put("k2","EASTERN CAPE");
        mapProvince.put("k3","KWAZULUNATAL");
        mapProvince.put("k4","FREE STATE");
        mapProvince.put("k5","MAPUMALANGA");
        mapProvince.put("k6","LIMPOPO");
        mapProvince.put("k7","GAUTENG");
        mapProvince.put("k8","NORTH WEST");
        mapProvince.put("k9","NORTHERN CAPE");
        mapProvince.put("k10","Cape Peninsula University of Technology");
    }

    @Test
    void addMap(){
        System.out.println("Map: "+mapProvince);
        System.out.println("Map Size: "+mapProvince.size()+" Provinces"+"\n");

        assertEquals(10,+mapProvince.size());
    }

    @Test
    void deleteMap(){
        mapProvince.remove("k10");

        System.out.println("Map after remove: "+mapProvince);
        System.out.println("Map Size: "+mapProvince.size()+" Provinces"+"\n");

        assertNotSame("k2","k7");
    }

    @Test
    void findMap(){
        Boolean data = mapProvince.containsKey("k6");

        System.out.println("Does the map contain the key 'k6'?: "+data+"\n"+"Key k6 is equal to: "+mapProvince.get("k6")+"\n");

        assertNotNull(mapProvince,"Welcome To South Africa");
    }
}