package com.devsuperior.myfirstproject.entities;

import java.io.Serializable;
import java.util.Objects;

public final class Product implements Serializable {

    private static final long serialVersionUID=1L;

    private Long id;
    private String name;
    private Double price;

    private Category categoy;

    public Product(){

    }

    public Product(Long id, String name, Double price, Category categoy) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.categoy = categoy;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategoy() {
        return categoy;
    }

    public void setCategoy(Category categoy) {
        this.categoy = categoy;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
