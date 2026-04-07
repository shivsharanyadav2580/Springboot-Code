package com.Shivsharan.entity;

import jakarta.persistence.*;

@Entity

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer pId;
    private String pName;

    public Product( String pName, String pCategory, Double pPrice, Integer pquantity) {
        super();
        this.pName = pName;
        this.pCategory = pCategory;
        this.pPrice = pPrice;
        this.pquantity = pquantity;
    }

    private String pCategory;
    private Double pPrice;
    private Integer pquantity;

    public Product() {
        System.out.println("zero param constructor");
    }


    public Integer getpId() {
        return pId;
    }

    public void setpId(Integer pId) {
        this.pId = pId;
    }

    public String getpName() {
        return pName;
    }

    public void setpName(String pName) {
        this.pName = pName;
    }

    public String getpCategory() {
        return pCategory;
    }

    public void setpCategory(String pCategory) {
        this.pCategory = pCategory;
    }

    public Double getpPrice() {
        return pPrice;
    }

    public void setpPrice(Double pPrice) {
        this.pPrice = pPrice;
    }

    public Integer getPquantity() {
        return pquantity;
    }

    public void setPquantity(Integer pquantity) {
        this.pquantity = pquantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pId=" + pId +
                ", pName='" + pName + '\'' +
                ", pCategory='" + pCategory + '\'' +
                ", pPrice=" + pPrice +
                ", pquantity=" + pquantity +
                '}';
    }
}
