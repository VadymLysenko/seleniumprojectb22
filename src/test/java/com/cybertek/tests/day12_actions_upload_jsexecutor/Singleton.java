package com.cybertek.tests.day12_actions_upload_jsexecutor;

public class Singleton {
    // creating private constructor
    private Singleton(){}

    //by making the String word private
    //we will ensure we create access only through our getter method
    private static String word;
    // we allow user to access to 'word' in the way we want team to have
    public static String getWord(){

        if(word==null){
            System.out.println("First time call. Word object is null." +
                    "Assigning value to it now");
            word = "something";
        }else{
            System.out.println("Word already has a value");
        }
        return word;

    }


}
