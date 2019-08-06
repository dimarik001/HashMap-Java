/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpshash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import jdk.nashorn.internal.codegen.CompilerConstants;

/**
 *
 * @author cstuser
 */
public class GPSHash {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Map<Integer, List<String>> map=new HashMap<>();
        map.put(10,Arrays.asList("Sam"));
//        ArrayList<String> Ar=new ArrayList<String>();
//        Ar.add("sam");
//        map.put(10,Ar);
//        Ar=new ArrayList<String>();
//       Ar.add("kia");
//       map.put(30, Ar);
        map.put(23,Arrays.asList("Sam"));
        map.put(4,Arrays.asList("Ali"));
        map.put(50,Arrays.asList("Natasha"));
        map.put(5,Arrays.asList("Alexander"));
        map.put(49,Arrays.asList("kia"));
        for (Map.Entry<Integer, List<String>> entry:map.entrySet()) {
            System.out.println(entry);
        }
        
//        Scanner scan=new Scanner(System.in);
//        System.out.println("Enter the names, to exit please write \"End\": ");
//        String userNames = scan.nextLine();
//        
//        while(!userNames.equals("End")){

//            userNames = scan.nextLine();
//        }
        InputPair ip=new InputPair();
        ip.inputPair(23, "Fred", map);
        ip.inputPair(50, "Dems", map);
        int keyDel=-1;
        for (Map.Entry<Integer, List<String>> entry:map.entrySet()) {
            if(entry.getValue().contains("Ali")){
                if(entry.getValue().size()>1) entry.getValue().remove("Ali");
                else keyDel=entry.getKey();
            }
        }
        if (keyDel>=0) map.remove(keyDel);
        
    }
    
    
//    public void inputPair(int key, String value, Map<Integer, List<String>> map){
//        if(map.containsKey(key)){
//            map.get(key).add(value);
//        }
//        else{
//            map.getOrDefault(key, Arrays.asList(value));
//        }
//    }
    
}
