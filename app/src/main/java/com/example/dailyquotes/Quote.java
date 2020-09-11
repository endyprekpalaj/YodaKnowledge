package com.example.dailyquotes;

public class Quote {

    private String Quote;
    private String Author;

    public Quote(String Quote, String Author) {
        this.Quote = Quote;
        this.Author = Author;
    }


    public String getQuote() {
        return Quote;
    }
    public void setQuote(String Quote) {
        this.Quote = Quote;
    }

    public String getAuthor() {
        return Author;
    }
    public void setAuthor(String Author) {
        this.Author = Author;
    }
}
