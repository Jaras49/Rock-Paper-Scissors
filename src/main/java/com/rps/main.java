package com.rps;

import com.rps.controls.AppControls;

public class main {

    private static final String APP_NAME = "Rock Paper and Scissors by Jaras";
    private static final String APP_VERSION = "Version 0.1";

    public static void main (String[] args){


        System.out.println(APP_NAME + "\n" + APP_VERSION);

        AppControls appControls = new AppControls();
        appControls.run();
    }
}