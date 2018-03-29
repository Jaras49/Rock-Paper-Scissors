package com.rps.utils;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputReader {

    private Scanner sc;

    public InputReader() {
        sc = new Scanner(System.in);
    }

    public int getInt() throws InputMismatchException {

        boolean proceed = true;
        int read = 999;

        while(proceed) {
            try {
                read = sc.nextInt();
                sc.nextLine();
                proceed = false;
            } catch (InputMismatchException e){
                System.err.println("Wrong input, try again");
                sc.nextLine();
            }
        }
        return read;
    }

    public String getInput() {

        return sc.nextLine();
    }

    public void close() {

        sc.close();
    }
}
