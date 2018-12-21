package com.company;

public class Main {

//    Write a code fragment that prints the contents of a two-dimensional boolean
//    array, using * to represent true and a space to represent false. Include row and column
//    numbers.

    public static void main(String[] args) {
	// write your code here
        boolean[][] a = {{true}, {false}, {true}, {true}, {false}, {true}};
        for(int i = 0; i < a.length; i++){
            if(a[i][0]){
                System.out.println("0" + i + " *");
            }else{
                System.out.println("0" + i + "  ");
            }
        }
    }
}
