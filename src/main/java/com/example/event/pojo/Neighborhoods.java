package com.example.event.pojo;

public class Neighborhoods
{
    private String neighborhood_id;

    private String name;

    public String getNeighborhood_id ()
    {
        return neighborhood_id;
    }

    public void setNeighborhood_id (String neighborhood_id)
    {
        this.neighborhood_id = neighborhood_id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

	@Override
	public String toString() {
		return "Neighborhoods [neighborhood_id=" + neighborhood_id + ", name=" + name + "]";
	}
    
    
    
}