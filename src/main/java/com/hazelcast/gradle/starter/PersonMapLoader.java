package com.hazelcast.gradle.starter;

import com.hazelcast.core.MapLoader;
import com.hazelcast.core.MapStore;

import java.util.*;

/**
 * Created by adpkh on 11/6/2016.
 */
public class PersonMapLoader implements MapStore<Long, Person> {
    @Override
    public Person load(Long key) {
        return new Person(key, key.toString());
    }

    @Override
    public Map<Long, Person> loadAll(Collection<Long> keys) {

        System.out.println(">>>>>>>>>>>>>>loadAll<<<<<<<<<<<<<<<" + keys);
        Map<Long, Person> res = new HashMap<>();
        for (Long key : keys) {
            res.put(key, new Person(key, key.toString()));
        }
        return res;
    }

    @Override
    public Iterable<Long> loadAllKeys() {
        System.out.println(">>>>>>>>>>>>>>loadAllKeys<<<<<<<<<<<<<<<");
        final List<Long> res = new ArrayList<>();
        res.add(1L);
        res.add(2L);
        res.add(3L);
        return res;
    }

    @Override
    public void store(Long key, Person value) {

    }

    @Override
    public void storeAll(Map<Long, Person> map) {

    }

    @Override
    public void delete(Long key) {

    }

    @Override
    public void deleteAll(Collection<Long> keys) {

    }
}
