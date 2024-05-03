package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearch implements ISearch<Book>{
    @Override
    public int search(List<Book> objectList, Book object) {
        ArrayList<Book> sortedList = new ArrayList<>(objectList);
        Collections.sort(sortedList);
        int left = 0, right = sortedList.size()-1;
        while(left <= right){
            int mid = (left + right) / 2;
            int result = object.compareTo(sortedList.get(mid));
            if(result == 0) return mid;
            if(result > 0) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }
}
