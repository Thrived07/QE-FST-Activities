package com.example;

class Custom extends Exception{
    private String message;
    public Custom(String message){
        this.message=message;
    }
    @Override
    public String getMessage(){
        return message;
    }
}
public class Activity8 {
    public static void exceptionTest(String value) throws Custom{
        if(value==null){
            throw new Custom("Custom Exception: String value is null");
        }else{
            System.out.println(value);
        }
    }
    public static void main(String args[]){
        try{
            Activity8.exceptionTest("Will print");
            Activity8.exceptionTest(null);
        }catch(Custom e){
            System.out.println(e.getMessage());
        }
    }
}
