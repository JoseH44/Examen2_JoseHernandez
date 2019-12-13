/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenii_josehernandez;

import java.util.ArrayList;

/**
 *
 * @author jrdjh
 */
public class PlayList {

    private ArrayList<Video> lista_videos = new ArrayList();
    private int tiempo_duracion;

    public PlayList() {
    }

    public ArrayList<Video> getLista_videos() {
        return lista_videos;
    }

    public void setLista_videos(ArrayList<Video> lista_videos) {
        this.lista_videos = lista_videos;
    }

    public int getTiempo_duracion() {
        return tiempo_duracion;
    }

    public void setTiempo_duracion(int tiempo_duracion) {
        this.tiempo_duracion = tiempo_duracion;
    }

    @Override
    public String toString() {
        return "PlayList{" + "lista_videos=" + lista_videos + ", tiempo_duracion=" + tiempo_duracion + '}';
    }

}
