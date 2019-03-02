package com.example.event.pojo;

public class Pages
{
    private String text;

    public String getText ()
    {
        return text;
    }

    public void setText (String text)
    {
        this.text = text;
    }

    @Override
    public String toString()
    {
        return "Pages [text = "+text+"]";
    }
}
	
