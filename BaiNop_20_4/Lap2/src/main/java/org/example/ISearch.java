package org.example;

import java.util.List;

public interface ISearch<T extends Object> {
    int search(List<T> objectList, T object);
}
