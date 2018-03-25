package com.rps.utils;

import java.util.Scanner;

public class InputReader {

    private Scanner sc;

    public InputReader(){
        sc = new Scanner(System.in);
    }

    public int getInt(){

        int i = sc.nextInt();
        sc.nextLine();
        return i;
    }

    public String getInput(){

        return sc.nextLine();
    }

    public void close(){

        sc.close();
    }
}
