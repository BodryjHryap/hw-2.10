package com.skypro.springcore.model;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@SessionScope
public class Basket {

    public Map<Integer, Integer> idsCount = new HashMap<>();

    public List<Integer> add(List<Integer> ids) {
        for (Integer i: ids) {
            if (idsCount.containsKey(i)) {
                idsCount.put(i, idsCount.get(i) + 1);
            } else {
                idsCount.put(i, 1);
            }
        }
        return ids;
    }

    public Map<Integer, Integer> get() {
        return idsCount;
    }
}
