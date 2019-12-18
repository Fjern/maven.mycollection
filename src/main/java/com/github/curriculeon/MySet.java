package com.github.curriculeon;

import java.util.Iterator;

public class MySet<SomeType> implements MyCollectionInterface<SomeType> {
    private MyArrayList<SomeType> list = new MyArrayList<>();
    
    public MySet() {
    }

    public MySet(SomeType[] valuesToBePopulatedWith) {
        for (SomeType elem : valuesToBePopulatedWith) {
            if (!this.list.contains(elem)) {
                this.list.add(elem);
            }
        }
    }


    @Override
    public void add(SomeType objectToAdd) {
        if(!this.list.contains(objectToAdd)){
            this.list.add(objectToAdd);
        }
    }

    @Override
    public void remove(SomeType objectToRemove) {
        this.list.remove(objectToRemove);
    }

    @Override
    public void remove(int indexOfObjectToRemove) {
        this.list.remove(indexOfObjectToRemove);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return this.list.get(indexOfElement);
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        return this.list.contains(objectToCheckFor);
    }

    @Override
    public Integer size() {
        return this.list.size();
    }

    @Override
    public Iterator<SomeType> iterator() {
        return this.list.iterator();
    }
}
