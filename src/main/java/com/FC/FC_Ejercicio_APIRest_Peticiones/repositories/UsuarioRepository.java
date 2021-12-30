package com.FC.FC_Ejercicio_APIRest_Peticiones.repositories;

import com.FC.FC_Ejercicio_APIRest_Peticiones.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  UsuarioRepository extends JpaRepository<Usuario, Long> {

}
