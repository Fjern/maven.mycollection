package com.github.curriculeon;




import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MyArrayList<SomeType> implements MyCollectionInterface<SomeType>{
    List<SomeType> myArrL = new ArrayList<>();

    public MyArrayList() {

    }

    public MyArrayList(SomeType[] valuesToBePopulatedWith) {
        for (SomeType elem:valuesToBePopulatedWith) {
            myArrL.add(elem);
        }
    }

    @Override
    public void add(SomeType objectToAdd) {
        myArrL.add(objectToAdd);
    }

    @Override
    public void remove(SomeType objectToRemove) {
//        this.myArrL.remove(objectToRemove);
       Iterator<SomeType> it= this.iterator();
       while(it.hasNext()){
           if( it.next().equals(objectToRemove)){
              it.remove();
           }
       }

    }

    @Override
    public void remove(int indexOfObjectToRemove) {
                this.myArrL.remove(indexOfObjectToRemove);
    }

    @Override
    public SomeType get(int indexOfElement) {
        return this.myArrL.get(indexOfElement);
    }

    @Override
    public Boolean contains(SomeType objectToCheckFor) {
        return this.myArrL.contains(objectToCheckFor);
    }

    @Override
    public Integer size() {
        return this.myArrL.size();
    }

    @Override
    public Iterator<SomeType> iterator() {

        return this.myArrL.iterator();
    }
}
