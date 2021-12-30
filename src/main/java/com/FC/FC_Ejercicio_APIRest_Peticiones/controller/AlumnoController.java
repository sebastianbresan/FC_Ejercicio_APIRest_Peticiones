package com.FC.FC_Ejercicio_APIRest_Peticiones.controller;

import com.FC.FC_Ejercicio_APIRest_Peticiones.entities.Alumno;
import com.FC.FC_Ejercicio_APIRest_Peticiones.services.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AlumnoController {

    @Autowired
    AlumnoService alumnoService;

    @GetMapping("api/alumno/find/findbyid/{id}")
    public Optional<Alumno> findAlumno(@PathVariable("id") Long id) {
        return alumnoService.findById(id);
    }

    @GetMapping("api/alumno/find/findall")
    public List<Alumno> findAlumnos() {
        return alumnoService.findAll();
    }

    @PostMapping("api/alumno/save")
    public Alumno saveAlumno(@RequestBody Alumno alumno) {
        alumnoService.saveAlumno(alumno);
        return alumno;

    }

    @PutMapping("api/alumno/update")
    public Alumno updateAlumno(@RequestBody Alumno alumno) {
        alumnoService.update(alumno);
        return alumno;
    }

    @DeleteMapping("api/alumno/delete/deletebyid/{id}")
    public void deleteAlumno(@PathVariable("id") Long id) {
        alumnoService.deleteById(id);
    }

    @DeleteMapping("api/alumno/delete/deleteall")
    public void deleteAlumnos() {
        alumnoService.deleteAll();
    }
}