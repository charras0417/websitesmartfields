/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import ModeloTienda.Disponibilidad;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jonathan
 */
public interface Interfaz_disp {
  
    public void createDisponibilidad(String l);
    public Disponibilidad getDisponibilidad();
}
