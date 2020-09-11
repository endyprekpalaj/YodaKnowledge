package com.example.dailyquotes;

import java.util.Random;

public class Motivational {

    private Quote[] Quotes;

    public Motivational(){
        Quotes = new Quote[8];

        Quotes[0] = new Quote("Fear is the path to the dark side. Fear leads to anger. Anger leads to hate. Hate leads to suffering.", "―  Master Yoda");
        Quotes[1] = new Quote("Death is a natural part of life. Rejoice for those around you who transform into the Force. Mourn them do not. Miss them do not. Attachment leads to jealously. The shadow of greed, that is.","―  Master Yoda");
        Quotes[2] = new Quote("Control, control, you must learn control!","― Master Yoda");
        Quotes[3] = new Quote("Many of the truths that we cling to depend on our point of view.","― Master Yoda");
        Quotes[4] = new Quote("Do not assume anything Obi-Wan. Clear your mind must be if you are to discover the real villains behind this plot.","― Master Yoda");
        Quotes[5] = new Quote("Adventure. Excitement. A Jedi craves not these things.","- Master Yoda");
        Quotes[6] = new Quote("To answer power with power, the Jedi way this is not. In this war, a danger there is, of losing who we are.","― Master Yoda");

    }

    public Quote getARandomQuote(){
        Random randomGen = new Random();
        int randomNo = randomGen.nextInt(Quotes.length);

        return Quotes[randomNo];
    }
}
