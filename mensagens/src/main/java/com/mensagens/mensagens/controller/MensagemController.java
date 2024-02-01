package com.mensagens.mensagens.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MensagemController {

    @GetMapping
    public String getMensagem(){
        return "oi";
    }
}
