package com.beeva.hashcode.beevateam;

import com.beeva.hashcode.beevateam.delivery.io.InputScenary;

public class App {

    public static void main( String[] args ){
        String pathStaticFiles = "src/static/scenaries/";
        String busyDay = pathStaticFiles + "busy_day.in";

        InputScenary inputScenary = new InputScenary(busyDay);
        System.out.println(inputScenary.toString());

    }
}
