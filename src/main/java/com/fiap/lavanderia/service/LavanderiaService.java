package com.fiap.lavanderia.service;

import com.fiap.lavanderia.dto.LavanderiaDTO;

import java.util.List;

public interface LavanderiaService {

    List<LavanderiaDTO> buscaByBairro(String bairro);

    LavanderiaDTO criarLavanderia(LavanderiaDTO nova);

}
