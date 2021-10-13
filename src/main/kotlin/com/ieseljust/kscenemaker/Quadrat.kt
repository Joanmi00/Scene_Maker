@file:JvmName("Quadrat")

package com.ieseljust.kscenemaker

import java.awt.Color
import java.awt.Graphics

class Quadrat : Figura {

    // Inicialitzem les variables en la delcaració mateix
    // No utilitzarem cap constructor primari
    var c: Int = 100

    // Constructors secundaris
    constructor() : super() //Sense arguments

    constructor(x: Int, y: Int, c: Int = 100, color: Color = Color.BLACK) : super(x, y, color) {
        this.c = c
    }

    override fun describeMe() {
        /*
        * Mètode que mostra en mode text una descripció de la figura per la consola.
        * S'utilitzarà per al mètode llista de la CLI.
        */
        println("Quadrat " + x + " " + y + " " + c + " " + color)
    }

    override fun render(g: Graphics) {

        g.setColor(color)             // Establim el color interior
        g.fillRect(x, y, c, c)
    }
}