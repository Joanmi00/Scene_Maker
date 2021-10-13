@file:JvmName("Elipse")

package com.ieseljust.kscenemaker

import java.awt.Color
import java.awt.Graphics

class Elipse : Figura{

    // Inicialitzem les variables en la delcaració mateix
    // No utilitzarem cap constructor primari
    var radi1: Int = 100
    var radi2: Int = 100

    // Constructors secundaris
    constructor() : super() //Sense arguments

    constructor(x: Int, y: Int, radi1: Int = 100, radi2: Int = 100, color: Color = Color.BLACK) : super(x, y, color) {
        this.radi1 = radi1
        this.radi2 = radi2
    }

    override fun describeMe() {
        /*
        * Mètode que mostra en mode text una descripció de la figura per la consola.
        * S'utilitzarà per al mètode llista de la CLI.
        */
        println("elipse " + x + " " + y + " " + radi1 + " " + radi2 + " " + color)
    }

    override fun render(g: Graphics) {

        g.setColor(color)             // Establim el color interior
        g.fillOval(x-radi1, y-radi2, radi1*2, radi2*2)
    }

}