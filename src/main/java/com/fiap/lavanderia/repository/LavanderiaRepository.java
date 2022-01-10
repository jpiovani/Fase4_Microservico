package com.fiap.lavanderia.repository;

import com.fiap.lavanderia.entity.Lavanderia;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LavanderiaRepository extends JpaRepository<Lavanderia, Integer> {

    List<Lavanderia> findAllByBairroLavanderiaLike (String bairro);

}
