package org.example;

import java.util.HashMap;

public class MapandSetCollection


{
    public void hash_map()
    {


        HashMap<String, Integer> worldMap = new HashMap<>();
        String[] words = new String[]{"apple", "banana", "apple", "table", "cat"};

        for (String word: words){
            if (worldMap.containsKey(word)){
                worldMap.put(word, worldMap.get(word) + 1);
            } else {
                worldMap.put(word,1);
            }
        }



    }
}
