package com.code.jewelleryshop.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "jewellery")
public class Jewellery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;

    private float type;

    private Integer gram;

    public Jewellery()
    {

    }

    public Jewellery(Integer id, String name, float type, Integer gram)
    {
        this.id = id;
        this.name = name;
        this.type = type;
        this.gram = gram;
    }

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public float getType()
    {
        return type;
    }

    public void setType(float type)
    {
        this.type = type;
    }

    public Integer getGram()
    {
        return gram;
    }

    public void setGram(Integer gram)
    {
        this.gram = gram;
    }
}
