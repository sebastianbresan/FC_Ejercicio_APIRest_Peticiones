package com.FC.FC_Ejercicio_APIRest_Peticiones.services;

import com.FC.FC_Ejercicio_APIRest_Peticiones.entities.Alumno;
import com.FC.FC_Ejercicio_APIRest_Peticiones.repositories.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlumnoService {

    @Autowired
    AlumnoRepository alumnoRepository;

    public void saveAlumno(Alumno alumno) {
        alumnoRepository.save(alumno);
    }

    public void deleteById(Long id) {
        alumnoRepository.deleteById(id);
    }

    public void deleteAll() {
        alumnoRepository.deleteAll();
    }

    public List<Alumno> findAll() {
        return alumnoRepository.findAll();
    }

    public Optional<Alumno> findById(Long id) {
        return alumnoRepository.findById(id);
    }

    public void update(Alumno alumno) {
        alumnoRepository.save(alumno);
    }

}
