/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.maffra.crudgp;

import com.maffra.crudgp.entities.Artist;
import com.maffra.crudgp.entities.Music;

/**
 *
 * @author heitormaffra
 */
public class Main {

    public static void main(String[] args) {

        try {
            
            Artist artist = new Artist();
            artist.setArtistName("Avantasia");
            artist.save();

            Music music = new Music();
            music.setIdArtista(artist);
            music.setSongName("Farewell");
            music.save();
        } catch (Exception ex) {
            System.out.println("Erro ao fazer a persistência do objeto" + ex.getMessage());
        }
    }
}
