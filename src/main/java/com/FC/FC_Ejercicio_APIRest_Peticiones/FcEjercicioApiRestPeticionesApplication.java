package com.FC.FC_Ejercicio_APIRest_Peticiones;

import com.FC.FC_Ejercicio_APIRest_Peticiones.entities.Alumno;
import com.FC.FC_Ejercicio_APIRest_Peticiones.entities.Etiqueta;
import com.FC.FC_Ejercicio_APIRest_Peticiones.entities.Presencialidad;
import com.FC.FC_Ejercicio_APIRest_Peticiones.entities.Usuario;
import com.FC.FC_Ejercicio_APIRest_Peticiones.repositories.AlumnoRepository;
import com.FC.FC_Ejercicio_APIRest_Peticiones.repositories.EtiquetaRepository;
import com.FC.FC_Ejercicio_APIRest_Peticiones.repositories.UsuarioRepository;
import com.FC.FC_Ejercicio_APIRest_Peticiones.services.AlumnoService;
import com.FC.FC_Ejercicio_APIRest_Peticiones.services.UsuarioService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.*;

@SpringBootApplication
public class FcEjercicioApiRestPeticionesApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(FcEjercicioApiRestPeticionesApplication.class, args);

		AlumnoRepository alumnoRepository = context.getBean(AlumnoRepository.class);

		BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        ArrayList<Etiqueta> etiquetas1 = new ArrayList<>();
		ArrayList<Etiqueta> etiquetas2 = new ArrayList<>();

		etiquetas1.add(new Etiqueta(1L, "REACT"));
        etiquetas1.add(new Etiqueta(2L, "SPRING"));
        etiquetas1.add(new Etiqueta(3L, "JAVA"));
        etiquetas1.add(new Etiqueta(4L, "LARAVEL"));
		etiquetas1.add(new Etiqueta(5L, "PYTHON"));
		etiquetas2.add(etiquetas1.get(1));
		etiquetas2.add(etiquetas1.get(2));
		etiquetas2.add(etiquetas1.get(4));

		Usuario usuario = new Usuario(1L,"user@user.com", passwordEncoder.encode("123456"));

		alumnoRepository.save(new Alumno(1L,"asd@asd.asd", "asd","123","asd","asd", Presencialidad.PRESENCIAL,etiquetas1,usuario));
		alumnoRepository.save(new Alumno(2L,"qwe@asd.asd", "qwe","456","qwe","qwe", Presencialidad.REMOTO,etiquetas2,usuario));


    }

}
