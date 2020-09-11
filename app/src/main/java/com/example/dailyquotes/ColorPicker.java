package com.example.dailyquotes;

import android.graphics.Color;

import java.util.Random;

public class ColorPicker {

    private String Colors[] = {
            "#03FF24",    //Light green
            "#0360FF",    //Dark blue
            "#EAFF00",    //Yellow
            "#FFD900",    //Orange
            "#FF00F7",    //Purple
            "#FF33B5E5",  //Light blue
            "#FF2F00",    //Red
            "#04C414"     //Dark green
    };

    public int getRandomColor(){
        Random randomGen = new Random();
        int randomNo = randomGen.nextInt(Colors.length);

        String color = Colors[randomNo];
        int colorInInt = Color.parseColor(color);

        return colorInInt;
    }
}
