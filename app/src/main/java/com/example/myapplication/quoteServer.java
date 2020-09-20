package com.example.myapplication;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class quoteServer {

    String[] getQuote(){
        String[] quotes = new String[]{
                "That's All You've to Decide, To Live A Life With No Regrets!",
                "Everyone Should Learn How To Code, It Teaches You How To Think!"
        };
        return quotes;
    }

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    String getRandomQuote(){
        String quote;
        int quoteArrayLength = getQuote().length;
        System.out.println(quoteArrayLength + "");
        int RandomNumber = ThreadLocalRandom.current().nextInt(quoteArrayLength);
        quote = getQuote()[RandomNumber];
        return quote;
    }
}
