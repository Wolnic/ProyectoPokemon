/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyectoeddpokemon;
//CAMBIO DE PRUEBA

/**
 *
 * @author  *
 * Ocampo Pantoja José Mario  *
 * Sánchez Venegas Manuel Antonio  *
 * Delgado Jiménez Alexander  *
 * Cordoba Hernandez Giovanny Josue  *
 * Pérez Rodríguez Carlos Roberto  *
 */
public class Entrenador {
    private String Nombre;
    private ListaPokemon ListaPokemon;
    
    public void CrearEntrenador(String Nombre,ListaPokemon Lista){
        this.Nombre=Nombre;
        this.ListaPokemon=Lista;
    }
    
    public void SeleccionarPokemon(){
        ListaPokemon.MostrarLista();
    }
    
    public void CambiarPokemon(){
        
    }
    
    public void Atacar(Pokemon Enemigo){
        
    }
}
