package com.convidados.controller;

import com.convidados.model.Convidado;
import com.convidados.repository.ConvidadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/convidados")
@Controller
public class ConvidadosController {
    //localhost:8080/convidados/listar
    @Autowired //para nao precisar criar um objeto
    private ConvidadoRepository convidadoRepository;
    @GetMapping("/convidados")
    public ModelAndView listar(){
        //cria o objeto mv e insere uma lista de convidados
        ModelAndView mv = new ModelAndView("ListaConvidados");
        //envia um objeto convidado para o mv
        mv.addObject(new Convidado());
        //envia uma lista "convidados" da tabela convidados
        mv.addObject("convidados",
                convidadoRepository.findAll());
        return mv;
    }
}
