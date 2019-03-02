package com.example.event.pojo;

public class Venues
{
    private String name;

    private String venue_id;

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getVenue_id ()
    {
        return venue_id;
    }

    public void setVenue_id (String venue_id)
    {
        this.venue_id = venue_id;
    }

    @Override
    public String toString()
    {
        return "Venues [name = "+name+", venue_id = "+venue_id+"]";
    }
}