package com.example.dailyquotes;

import android.graphics.Color;

import java.util.Random;

public class PicturePicker {

    private String Pictures[] = {
            "yoda1",
            "yoda2",
            "yoda3",
            "yoda4",
            "yoda5",
    };

    public String getRandomPicture(){
        Random randomGen = new Random();
        int randomNo = randomGen.nextInt(Pictures.length);

        return Pictures[randomNo];
    }
}
