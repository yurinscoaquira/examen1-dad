package com.mycj.student.mycjstudentservice.service.impl;

import com.mycj.student.mycjstudentservice.entity.Estudiante;
import com.mycj.student.mycjstudentservice.repository.EstudianteRepository;
import com.mycj.student.mycjstudentservice.service.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;


import java.util.List;
import java.util.Optional;

@Service
@Validated
public class EstudianteServiceImpl implements EstudianteService {
    @Autowired
    private EstudianteRepository estudianteRepository;

    @Override
    public List<Estudiante> listar() {
        return estudianteRepository.findAll();
    }

    @Override
    public Optional<Estudiante> buscar(Integer id) {
        return estudianteRepository.findById(id);

    }

    @Override
    public Estudiante guardar(Estudiante estudiante) {


        return estudianteRepository.save(estudiante);
    }

    @Override
    public Estudiante actualizar(Integer id, Estudiante estudiante) {


        estudiante.setId(id);
        return estudianteRepository.save(estudiante);
    }

    @Override
    public void eliminar(Integer id) {

        estudianteRepository.deleteById(id);
    }
}
