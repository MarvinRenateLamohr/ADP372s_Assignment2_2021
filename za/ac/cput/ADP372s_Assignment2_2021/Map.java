package za.ac.cput.ADP372s_Assignment2_2021;

/**
 * Student Name: MARVIN RENATE LAMOHR
 * Student Number: 214273830
 **/

import java.util.HashMap;

public class Map {
    java.util.Map<String, String> mapProvince = new HashMap<>();

    public void addMap(String map){
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

        System.out.println(map);
    }

    public void deleteMap(String map){
        mapProvince.remove("k10");

        System.out.println("After removing " +map+ " there will be 9 provinces left");
        String data = mapProvince.get(map);

        System.out.println(data);
    }

    public void findMap(){
        String data = mapProvince.get("k6");

        System.out.println(data);
    }
}
