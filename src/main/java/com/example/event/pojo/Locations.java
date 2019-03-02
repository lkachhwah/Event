package com.example.event.pojo;

public class Locations
{
    private String location_type;

    private String location_id;

    public String getLocation_type ()
    {
        return location_type;
    }

    public void setLocation_type (String location_type)
    {
        this.location_type = location_type;
    }

    public String getLocation_id ()
    {
        return location_id;
    }

    public void setLocation_id (String location_id)
    {
        this.location_id = location_id;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [location_type = "+location_type+", location_id = "+location_id+"]";
    }
}
			
	
