/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mc.concesionaria.persistencia;

import com.mc.concesionaria.logica.Automovil;

public class ControladoraPersistencia {
    
    AutomovilJpaController jpa = new AutomovilJpaController();

    public void agregar(Automovil auto) {
        jpa.create(auto);
    }
    
}
