package com.example.test.demo.controller;

import com.example.test.demo.model.Item;
import com.example.test.demo.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @Autowired
    private ItemService service;

    @GetMapping("dummy-item")
    public Item dummyItem() {
        return new Item(1, "Iteming", 10, 100);
    }

    @GetMapping("/service")
    public Item fromService(){
        return service.getHardCodedItem();
    }
}
