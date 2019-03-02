package com.example.event.pojo;

public class Nav
{
    private String url;

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "Nav [url = "+url+"]";
    }
}