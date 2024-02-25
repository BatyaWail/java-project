package com.example.bootspring.entities;

import java.util.Objects;

public class Product {
    private  int id;
    private  String Name;

    public Product(int id, String name) {
        this.id = id;
        Name = name;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(Name, product.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Name);
    }
}
