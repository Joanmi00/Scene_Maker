@file:JvmName("Circulo")

package com.ieseljust.kscenemaker

import java.awt.Color
import java.awt.Graphics

class Circulo: Figura {

    // Inicialitzem les variables en la delcaració mateix
    // No utilitzarem cap constructor primari
    var radi: Int=100

    // Constructors secundaris
    constructor():super() //Sense arguments

    constructor(x: Int, y:Int, radi:Int = 100,  color: Color = Color.BLACK): super(x, y, color) {

        this.radi  = radi
    }

    override fun describeMe() {
        /*
        * Mètode que mostra en mode text una descripció de la figura per la consola.
        * S'utilitzarà per al mètode llista de la CLI.
        */
        println("circulo " + x + " " + y + " " + radi + " " + color)
    }

    override fun render(g: Graphics) {

        g.setColor(color)             // Establim el color interior
        g.fillOval(x-radi, y-radi, radi*2, radi*2)
    }
}