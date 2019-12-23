package com.ls.card.api;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

    @Value("${cardType:test}")
    private String cardType;

    @GetMapping("card-type")
    public String getCardType() {
        return cardType;
    }
}
