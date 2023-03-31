
package com.tienda.repository;
import com.tienda.entity.Persona;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface PersonaRepository extends CrudRepository<Persona,Long>,JpaRepository<Persona, Long>  {
    
    List<Persona> findByApellido1(String apellido1);
    Persona findByNombre (String nombre);
}

