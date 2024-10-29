package com.nerugprogramador.audioapp.modelos;

public class MisFavoriotos {
    public void adiciona(Audio audio) {
        if (audio.getClasificacion() >= 8) {
            System.out.println(audio.getTitulo() + " Este es uno de los favoriotos del momento");
        } else {
            System.out.println(audio.getTitulo() + " Tambien es uno de los favoritos");
        }
    }
}
