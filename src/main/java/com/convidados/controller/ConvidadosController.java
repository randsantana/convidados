package com.convidados.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/convidados")
@Controller
public class ConvidadosController {
    @GetMapping("/listar")
    public String listar(){
        return "Lista de convidados.";
    }
}
