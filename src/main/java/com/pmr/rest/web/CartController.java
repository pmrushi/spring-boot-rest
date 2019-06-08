package com.pmr.rest.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/")
public class CartController {

    @GetMapping("cart")
    public String getCart() {
        return "cart";
    }
}
