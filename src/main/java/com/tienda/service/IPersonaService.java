/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.Persona;
import java.util.List;

/**
 *
 * @author david
 */
public interface IPersonaService {
    public List<Persona> getAllPersona();
    public Persona gePersonaById (Long id);
    public void savePersona (Persona persona);
    public void delete (Long id);
    public Persona findByNombre (String username);
}
