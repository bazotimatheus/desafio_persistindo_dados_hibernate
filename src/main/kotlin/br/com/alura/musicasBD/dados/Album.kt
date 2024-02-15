package br.com.alura.musicasBD.dados

import br.com.alura.musicasBD.modelos.Banda

class Album(
    val titulo: String = "Título do álbum",
    val banda: Banda = Banda(),
    val id: Int = 0
) {
}