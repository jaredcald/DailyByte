package com.technicalquestions;

/*
Given two strings representing sentences, return the words that are not common to both strings
(i.e. the words that only appear in one of the sentences). You may assume that each sentence is a
sequence of words (without punctuation) correctly separated using space characters.

Ex: given the following strings...

sentence1 = "the quick", sentence2 = "brown fox", return ["the", "quick", "brown", "fox"]
sentence1 = "the tortoise beat the haire", sentence2 = "the tortoise lost to the haire", return ["beat", "to", "lost"]
sentence1 = "copper coffee pot", sentence2 = "hot coffee pot", return ["copper", "hot"]

 PseudoCode
    Given 2 Strings
    Return List of Words
    Create a HashMap
    Create a method to:
        parse though each word in sentence
        if the word exists
            set value in map to -1
        else add word to map with a value of 1
    Create List
    Loop though map
        If the words value is equal to 1
            add word to list
    Return List
 */

import java.util.*;

public class UncommonWords {
    public UncommonWords() { }

    public List<String> uncommonWords(String sentence1, String sentence2){
        //Utilizing a hashMap is easier than a HashSet in this case
        //If there are multiple cases of words then you run into issues
        Map<String, Integer> map = new HashMap<>();
        //It is always best to try and remove redundant code with another method
        //You can pass a Map by reference
        setCount(sentence1, map);
        setCount(sentence2, map);
        List<String> results = new ArrayList<>();
        for(String word: map.keySet()){
            if(map.get(word) == 1){
                results.add(word);
            }
        }
        return results;
    }

    private void setCount(String s, Map<String, Integer> map){
        String[] words = s.split(" ");
        for(String word : words){
            if(map.containsKey(word)){
                map.put(word, -1);
            }
            else{
                map.put(word, 1);
            }
        }
    }

}
/*
Big-O Analysis
    Runtime: O(N) where N is the total number of elements in sentence1 and sentence2
    Space complexity: O(M) where M is the total number of elements in sentence1 and sentence2
 */
