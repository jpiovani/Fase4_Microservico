package com.fiap.lavanderia.controller;

import com.fiap.lavanderia.dto.LavanderiaDTO;
import com.fiap.lavanderia.service.LavanderiaService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("lavanderias/v1")
public class LavanderiaController {

    private LavanderiaService service;

    public LavanderiaController(LavanderiaService service){
        this.service = service;
    }

    @CrossOrigin
    @GetMapping
    public List<LavanderiaDTO> getLavanderiaByBairro(
            @RequestParam(required = false, value = "bairroLavanderia") String bairroLavanderia){

        return service.buscaByBairro(bairroLavanderia);

    }

    @CrossOrigin
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public LavanderiaDTO criar(@RequestBody LavanderiaDTO nova){
        return service.criarLavanderia(nova);
    }


}
