/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wakamole.kioskerorestful.controller;

import com.sun.jndi.toolkit.url.Uri;
import com.wakamole.kioskerorestful.dto.Usuario;
import com.wakamole.kioskerorestful.utils.UtilsFunctions;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.wakamole.kioskerorestful.repository.UsuarioRepository;

/**
 *
 * @author Max
 */
@RestController
public class UsuarioController {
    
    @Autowired
    UsuarioRepository usuarioRepository;
    
    @GetMapping("/usuarios")
    public List<Usuario> getUsuarios(){
        return usuarioRepository.findAll();
    }
    
    @PostMapping("/usuario")
    public ResponseEntity<Object> createStudent(@RequestBody Usuario usuario){
        
        String pass=usuario.getPassword();
        usuario.setPassword(UtilsFunctions.toSha256(pass));
        
        Usuario usuarioSaved=usuarioRepository.save(usuario);
        
        
        URI loc=ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(usuarioSaved.getId()).toUri();
        
        return ResponseEntity.created(loc).build();
    }
    
    
    
    @DeleteMapping("/usuario/{id}")
    public void deleteUsuario(@PathVariable long id){
        usuarioRepository.deleteById(id);
    }
    
    @PutMapping("usuario/{id}")
    public ResponseEntity<Object> updateUsuario(@RequestBody Usuario usuario,@PathVariable long id){
        
        ResponseEntity response=null;
         Optional<Usuario> u=usuarioRepository.findById(id);
         
         if(!u.isPresent()){
             
            response=ResponseEntity.notFound().build();
            
         }else{
             
             usuario.setId(id);
             usuarioRepository.save(usuario);
              response=ResponseEntity.noContent().build();
         }
        
        
        return response;
    }
    
}
