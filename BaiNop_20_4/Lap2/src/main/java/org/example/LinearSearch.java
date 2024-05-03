package org.example;

import java.util.List;

public class LinearSearch implements ISearch<Book>{
    @Override
    public int search(List<Book> objectList, Book object){
        for(int i = 0; i<objectList.size(); i++){
            if(object.equals(objectList.get(i)))
                return i;
        }
        return -1;
    }
}
