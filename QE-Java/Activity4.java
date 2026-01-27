package com.example;

public class Activity4 {
    public static void main(String args[]){
        int num[]={4,3,2,10,12,1,5,6};
        for (int i=0;i<num.length;i++){
            int key=num[i];
            int j=i-1;
            while(j>=0 && num[j]>key){
                num[j+1]=num[j];
                j--;
            }
            num[j+1]=key;
        }
        System.out.println("Sorted Array:");
        for(int n:num){
            System.out.print(n+" ");
        }
    }
}
