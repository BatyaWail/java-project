package com.example.bootspring.entities;

import java.util.ArrayList;
import java.util.List;

public class TempDB {
    public  static List<Product> productlist=new ArrayList<>();
static {
    productlist.add((new Product(1,"milk")));
    productlist.add((new Product(2,"cheese")));
    productlist.add((new Product(3,"eggs")));
    productlist.add((new Product(4,"chocolate")));

}
}
