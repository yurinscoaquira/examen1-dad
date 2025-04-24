package com.mycj.student.mycjstudentservice.util;

import com.mycj.student.mycjstudentservice.entity.Estudiante;
import com.mycj.student.mycjstudentservice.repository.EstudianteRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EstudianteSeeder implements CommandLineRunner {

    private final EstudianteRepository estudianteRepository;

    public EstudianteSeeder(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    @Override
    public void run(String... args) {
        // Verificamos si ya existen datos para no duplicar
        if (estudianteRepository.count() == 0) {
            Estudiante est1 = new Estudiante(null, "Ana Torres", "12345678", "Ingeniería Electrónica", "Activo", 4);
            Estudiante est2 = new Estudiante(null, "Luis Pérez", "87654321", "Ingeniería de Sistemas", "Inactivo", 2);
            Estudiante est3 = new Estudiante(null, "María López", "11223344", "Administración", "Activo", 6);
            Estudiante est4 = new Estudiante(null, "Carlos Ruiz", "44332211", "Contabilidad", "Suspendido", 3);

            estudianteRepository.save(est1);
            estudianteRepository.save(est2);
            estudianteRepository.save(est3);
            estudianteRepository.save(est4);


            System.out.println("Datos de categorías insertados correctamente.");
        } else {
            System.out.println("Las categorías ya existen, no se insertaron datos.");
        }
    }
}