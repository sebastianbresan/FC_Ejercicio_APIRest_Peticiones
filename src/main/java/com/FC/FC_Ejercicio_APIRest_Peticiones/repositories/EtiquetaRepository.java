package com.FC.FC_Ejercicio_APIRest_Peticiones.repositories;

import com.FC.FC_Ejercicio_APIRest_Peticiones.entities.Etiqueta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  EtiquetaRepository extends JpaRepository<Etiqueta, Long> {

}
