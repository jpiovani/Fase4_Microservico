package com.fiap.lavanderia.service;

import com.fiap.lavanderia.dto.LavanderiaDTO;
import com.fiap.lavanderia.entity.Lavanderia;
import com.fiap.lavanderia.repository.LavanderiaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LavanderiaServiceImpl implements LavanderiaService {

    private final LavanderiaRepository lavanderiaRepository;

    public LavanderiaServiceImpl(LavanderiaRepository lavanderiaRepository) {
        this.lavanderiaRepository = lavanderiaRepository;
    }

    @Override
    public List<LavanderiaDTO> buscaByBairro(String bairro) {
        List<Lavanderia> lista;
        if(bairro != null){
            lista = lavanderiaRepository.findAllByBairroLavanderiaLike("%" + bairro + "%");
        }else{
            lista = lavanderiaRepository.findAll();
        }

        return lista.stream().map(lavanderia -> new LavanderiaDTO(lavanderia)).collect(Collectors.toList());
    }

    @Override
    public LavanderiaDTO criarLavanderia(LavanderiaDTO nova) {
        Lavanderia lavanderia = new Lavanderia(nova);
        Lavanderia savedLavanderia = lavanderiaRepository.save(lavanderia);
        return new LavanderiaDTO(savedLavanderia);
    }

}
