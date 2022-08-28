package com.codewithmosh.structural.composite_done;

import java.util.ArrayList;
import java.util.List;

public class Team implements Resource{
    private final List<Resource> resources = new ArrayList<>();

    public void add(Resource resource) {
        resources.add(resource);
    }

    public void deploy() {
        resources.forEach(Resource::deploy);
    }
}
