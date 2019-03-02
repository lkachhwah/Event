package com.example.event.pojo;

public class Categories
{
    private String ref_id;

    private String parent;

    private String category_id;

    private String name;

    private String alias;

    public String getRef_id ()
    {
        return ref_id;
    }

    public void setRef_id (String ref_id)
    {
        this.ref_id = ref_id;
    }

    public String getParent ()
    {
        return parent;
    }

    public void setParent (String parent)
    {
        this.parent = parent;
    }

    public String getCategory_id ()
    {
        return category_id;
    }

    public void setCategory_id (String category_id)
    {
        this.category_id = category_id;
    }

    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getAlias ()
    {
        return alias;
    }

    public void setAlias (String alias)
    {
        this.alias = alias;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [ref_id = "+ref_id+", parent = "+parent+", category_id = "+category_id+", name = "+name+", alias = "+alias+"]";
    }
}
