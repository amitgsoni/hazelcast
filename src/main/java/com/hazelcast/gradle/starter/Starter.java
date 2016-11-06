package com.hazelcast.gradle.starter;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import java.util.*;

/**
 * TODO
 *
 * @author Viktor Gamov on 10/5/15.
 *         Twitter: @gamussa
 * @since 0.0.1
 */
public class Starter {
    public static void main(String[] args) {

        HazelcastInstance hz = Hazelcast.newHazelcastInstance();

        IMap<Long, Person> personMap = hz.getMap("personMap");

        System.out.println("Before Map size: " + personMap.size());

        Set<Long> newKeys = new HashSet<>();
        newKeys.add(4L);
        personMap.loadAll(newKeys, true);

        personMap.loadAll(true);

        System.out.println("After Map size: " + personMap.size());

    }
}
