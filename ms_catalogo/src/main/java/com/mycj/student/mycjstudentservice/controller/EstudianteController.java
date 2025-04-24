package com.mycj.student.mycjstudentservice.controller;

import com.mycj.student.mycjstudentservice.entity.Estudiante;
import com.mycj.student.mycjstudentservice.service.EstudianteService;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteService estudianteService;

    @RequestMapping
    public List<Estudiante> listar() {
        return estudianteService.listar();
    }

    @RequestMapping("/{id}")
    public Optional<Estudiante> buscar(@PathVariable Integer id) {
        return estudianteService.buscar(id);
    }

    @PostMapping
    public Estudiante guardar(@Valid @RequestBody Estudiante estudiante) {
        System.out.println(estudiante);
        return estudianteService.guardar(estudiante);
    }

    @PutMapping("/{id}")
    public Estudiante actualizar(@PathVariable Integer id, @Valid @RequestBody Estudiante estudiante) {
        return estudianteService.actualizar(id, estudiante);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Integer id) {
        estudianteService.eliminar(id);
    }
}

