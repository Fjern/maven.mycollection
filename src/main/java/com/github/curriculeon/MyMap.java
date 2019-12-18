package com.github.curriculeon;

import java.util.*;

public class MyMap<KeyType, ValueType> implements MyMapInterface<KeyType, ValueType> {
    private Map<KeyType, ValueType> map = new HashMap<>();
    public MyMap() {

    }

    public MyMap(List<KeyValue<KeyType, ValueType>> entries) {
        for (KeyValue<KeyType, ValueType> kv:entries) {
            this.put(kv.getKey(),kv.getValue());
        }
    }


    @Override
    public void put(KeyType key, ValueType value) {
        this.map.put(key, value);
    }

    @Override
    public ValueType get(KeyType key) {
        return this.map.get(key);
    }

    @Override
    public Set<KeyType> getKeySet() {
        return null;
    }

    @Override
    public List<ValueType> getValues() {
        return null;
    }

    @Override
    public Set<KeyValue<KeyType, ValueType>> getKeyValues() {
        return null;
    }

    @Override
    public MyMapInterface<ValueType, KeyType> invert() {
        return null;
    }
}
