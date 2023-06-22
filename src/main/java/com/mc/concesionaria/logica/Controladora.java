/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mc.concesionaria.logica;

import com.mc.concesionaria.persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPer = new ControladoraPersistencia();

    public void agregar(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        Automovil auto = new Automovil();
        
        auto.setCantPuertas(cantPuertas);
        auto.setColor(color);
        auto.setMarca(marca);
        auto.setModelo(modelo);
        auto.setMotor(motor);
        auto.setPatente(patente);
        
        controlPer.agregar(auto);
    }
    
}
