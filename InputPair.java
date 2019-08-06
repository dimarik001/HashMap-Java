/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gpshash;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 *
 * @author cstuser
 */
public class InputPair {
    public void inputPair(int key, String value, Map<Integer, List<String>> map){
        if(map.containsKey(key)){
            map.get(key).add(value);
        }
        else{
            map.getOrDefault(key, Arrays.asList(value));
        }
    }
}
