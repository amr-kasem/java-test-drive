package com.auk;

import java.util.ArrayList;
import java.util.List;

public class Catalog {
    private List<Category> categories;
    public Category[] getCategories(){
        return categories.toArray(new Category[categories.size()]);
    }
    public void addCategory(Category c){
        categories.add(c);
    }
    public Catalog(){
        categories = new ArrayList<Category>();
    }
}
