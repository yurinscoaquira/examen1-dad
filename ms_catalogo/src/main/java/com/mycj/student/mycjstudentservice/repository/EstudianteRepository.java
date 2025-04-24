package com.mycj.student.mycjstudentservice.repository;

import com.mycj.student.mycjstudentservice.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
