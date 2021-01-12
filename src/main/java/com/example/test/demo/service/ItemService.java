package com.example.test.demo.service;

import com.example.test.demo.model.Item;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
    public Item getHardCodedItem() {
        return new Item(2, "Service", 20, 2);
    }
}
