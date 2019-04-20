package day63_DataStructor_Akbar_03;

import java.util.*;
import java.util.Map.Entry; 

public class HashMapDemo {
    public static void main(String[] args) {
        
         String [] namesArr = {"Adam", "John", "Tim", "Donald", "Jessica", "Anthony", 
                "Zack", "Mike", "Sam", "Tony", "Jakob", "Samantha", "Adam"};
 
         Map<String, Integer> mapOfNames = new HashMap<>();
         
         for(String name : namesArr) {
             mapOfNames.put(name, name.length());
         }
         
         Set<String> nameKeys = mapOfNames.keySet();
         Iterator<String> nameKeysIterator = nameKeys.iterator();
         
         for( ; nameKeysIterator.hasNext() ; ) {
             nameKeys.removeIf((String name) -> name.startsWith("P"));
         }
         
         Collection<Integer> namesLength = mapOfNames.values();
         Iterator<Integer> valuesIterator = namesLength.iterator();
         while(valuesIterator.hasNext()) {
             if(valuesIterator.next() >= 6) {
                 namesLength.remove(valuesIterator.next());
             }
         }
         
         Set<Entry<String, Integer> > mapEntry = mapOfNames.entrySet();
         
         for(Entry<String, Integer> entry : mapEntry) {
             entry.setValue( ( entry.getValue() > 10 ) ? 0 : entry.getValue() );
         }
         
    }
}
