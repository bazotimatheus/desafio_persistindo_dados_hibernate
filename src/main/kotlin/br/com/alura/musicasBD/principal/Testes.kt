package br.com.alura.musicasBD.principal

import br.com.alura.musicasBD.dados.AlbumDAO
import br.com.alura.musicasBD.dados.Banco
import br.com.alura.musicasBD.dados.BandaDAO
import br.com.alura.musicasBD.modelos.Album
import br.com.alura.musicasBD.modelos.Banda

fun main(){

    val manager = Banco.getEntityManager()

    val bandaDAO = BandaDAO(manager)
    val albumDAO = AlbumDAO(manager)

//    val titas = Banda("Titãs")
    val titas = bandaDAO.recuperarPeloId(1)

//    val goBack = Album("Go Back", titas)
//    val cabecaDinossauro = Album("Cabeça Dinossauro", titas)
    val goBack = albumDAO.recuperarPeloId(1)
    val cabecaDinossauro = albumDAO.recuperarPeloId(2)

//    bandaDAO.adicionar(titas)

//    albumDAO.adicionar(cabecaDinossauro)
//    albumDAO.adicionar(goBack)

    val listaBandas = bandaDAO.getLista()
    val listaAlbuns = albumDAO.getLista()

    println(listaBandas)
    println(listaAlbuns)

    manager.close()

//
//    println(titas)
//    println(goBack)
//    println(cabecaDinossauro)
}
