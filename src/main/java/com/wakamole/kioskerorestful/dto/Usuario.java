/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wakamole.kioskerorestful.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Max
 */

@Entity
public class Usuario {
    @Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	private String nombre;
        private String apellidos;
        private String email;
        private String password;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
	
        
        

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

   
        
  
}
