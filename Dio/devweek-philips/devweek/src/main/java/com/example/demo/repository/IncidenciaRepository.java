package com.example.demo.repository;

import com.example.demo.entity.Incidencia;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenciaRepository extends JpaRepository<Incidencia,Long> {
}
