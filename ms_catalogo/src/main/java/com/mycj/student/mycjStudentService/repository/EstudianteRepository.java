package com.mycj.student.mycjStudentService.repository;

import com.mycj.student.mycjStudentService.entity.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer> {
}
