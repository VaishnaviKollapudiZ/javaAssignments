package com.assignment11;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    public static void main(String[] args){

        String fileName = args[0];
        try{

            File file = new File("/home/vaisk/Downloads/"+fileName);
            BufferedReader bufferedReader =  new BufferedReader(new FileReader(file));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("OutputCharacterCount.txt"));

            HashMap<Character,Integer> countChars = new HashMap<>();

            int index;

            while((index=bufferedReader.read()) != -1){
                 if(!countChars.containsKey((char)index))
                    countChars.put((char)index,1);
                else
                    countChars.put((char)index,countChars.get((char)index)+1);
            }

            bufferedReader.close();

            for(Map.Entry<Character,Integer> entry : countChars.entrySet()){
                bufferedWriter.write(entry.getKey() +" -> "+entry.getValue()+"\n");
            }

            bufferedWriter.close();
        }
        catch (FileNotFoundException exception){
            exception.printStackTrace();
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
