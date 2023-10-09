package com.skypro.springcore.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BasketService {

    public List<Integer> items = new ArrayList<>();

    public List<Integer> add(List<Integer> ids) {
        items.addAll(ids);
        return ids;
    }

    public List<Integer> get() {
        return items;
    }
}
