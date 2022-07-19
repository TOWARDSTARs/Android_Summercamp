package com.example.task_1;

public class Sort1 {

    public static Integer[] sort1(Integer[] array){
        int temp=0;
        for (int i = 0; i < array.length-1 ; i++) {
            boolean flag=false;
            for (int j = 0; j < array.length-1-i ; j++) {
                if(array[j+1]>array[j]){
                    temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                    flag=true;
                }
            }
            if (flag==false){
                break;
            }
        }
        return array;

    }
}