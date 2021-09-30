package com.example.tree.avl;

import java.util.List;

public class AvlTree<E extends Comparable<E>> {

    public  <E> E genericMethod(Class<E> tClass)throws InstantiationException ,
            IllegalAccessException{
        E instance = tClass.newInstance();
        return instance;
    }
}
