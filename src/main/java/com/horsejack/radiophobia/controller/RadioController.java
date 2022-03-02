package com.horsejack.radiophobia.controller;

import com.horsejack.radiophobia.model.Radio;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RadioController {

    @GetMapping("/radios")
    public Radio getAll() {
        return new Radio(1, "teste", "alele");
    }

    @GetMapping("/radio/:id")
    public Radio getRadio(long id) {
        return null;
    }
}
