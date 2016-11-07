package com.hazelcast.reload.poc;

import com.hazelcast.client.HazelcastClient;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import java.util.HashSet;
import java.util.Set;

public class Client {
    public static void main(String[] args) {

        HazelcastInstance hz = HazelcastClient.newHazelcastClient();

        IMap<Long, Person> personMap = hz.getMap("personMap");

        System.out.println("Before Map size: " + personMap.size());

        Set<Long> newKeys = new HashSet<>();
        newKeys.add(4L);
        personMap.loadAll(newKeys, true);


        System.out.println("\n\n\n\n\n\n");

        personMap.loadAll(true);

        System.out.println("After Map size: " + personMap.size());

        HazelcastClient.shutdownAll();
    }
}
