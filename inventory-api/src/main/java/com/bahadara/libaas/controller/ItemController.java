package com.bahadara.libaas.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bahadara.libaas.model.Item;

@RestController
public class ItemController {

	@GetMapping(path = "/items", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Item> fetchItems() {
		return Arrays.asList(new Item("1", "Suit"), new Item("2", "Saree"));
	}

	@GetMapping(path = "/items/{itemId}", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Item fetchItems(@PathVariable("itemId") String id) {
		return new Item(id, "name");
	}
}
