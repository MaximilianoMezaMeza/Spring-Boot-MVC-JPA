/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wakamole.kioskerorestful.repository;

import com.wakamole.kioskerorestful.dto.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Max
 */
//@RepositoryRestResource(collectionResourceRel = "usuario",path = "usuario")
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    
    List<Usuario> findByNombre(@Param("nombre")String nombre);
    
}
