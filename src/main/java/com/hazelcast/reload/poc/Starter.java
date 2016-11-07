package com.hazelcast.reload.poc;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import java.util.*;

public class Starter {
    public static void main(String[] args) {

        HazelcastInstance hz = Hazelcast.newHazelcastInstance();

//        IMap<Long, Person> personMap = hz.getMap("personMap");
//
//        System.out.println("Before Map size: " + personMap.size());
//
//        Set<Long> newKeys = new HashSet<>();
//        newKeys.add(4L);
//        personMap.loadAll(newKeys, true);
//
//        personMap.loadAll(true);
//
//        System.out.println("After Map size: " + personMap.size());

    }
}
