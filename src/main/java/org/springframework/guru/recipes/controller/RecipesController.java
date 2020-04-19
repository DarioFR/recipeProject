package org.springframework.guru.recipes.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipesController {

    @GetMapping(path = "/message",produces = "application/json")
    public ResponseEntity<MessageBean> getMessage() {
        MessageBean msg = new MessageBean();
        msg.setMessage("TEST");
        return new ResponseEntity<>(msg,null, HttpStatus.OK);
    }
}
