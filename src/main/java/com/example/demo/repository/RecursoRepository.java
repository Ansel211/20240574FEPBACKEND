package com.example.demo.repository;

import com.example.demo.model.RecursoImpugnatorio;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface RecursoRepository extends JpaRepository<RecursoImpugnatorio, Long> {
    List<RecursoImpugnatorio> findByUsuarioId(Long usuarioId);
}