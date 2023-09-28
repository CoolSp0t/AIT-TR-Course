package homework_53;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Homework_53 {
    public static void main(String[] args) {
        System.out.println(returnString("bufferedEx.txt"));
    }
    public static String returnString(String fileName){
        String result = "";
        if(fileName != null){
            try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
                String str;
                while ((str = bufferedReader.readLine()) != null){
                     result = result+str+"\n";
                }

            }catch (
                    IOException e){
                System.out.println(e.getMessage());
            }
        }



        return result;
    }

}
