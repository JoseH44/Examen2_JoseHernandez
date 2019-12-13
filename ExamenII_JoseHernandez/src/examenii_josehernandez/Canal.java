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
public class Canal {

    private int num_suscriptores;
    private String nombre;
    private String categoria;
    private int num_videos;
    private int cant_likes;
    private ArrayList<Video> videos_propios = new ArrayList();

    public Canal() {
    }

    public Canal(int num_suscriptores, String nombre, String categoria, int num_videos, int cant_likes) {
        this.num_suscriptores = num_suscriptores;
        this.nombre = nombre;
        this.categoria = categoria;
        this.num_videos = num_videos;
        this.cant_likes = cant_likes;
    }

    public int getNum_suscriptores() {
        return num_suscriptores;
    }

    public void setNum_suscriptores(int num_suscriptores) {
        this.num_suscriptores = num_suscriptores;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getNum_videos() {
        return num_videos;
    }

    public void setNum_videos(int num_videos) {
        this.num_videos = num_videos;
    }

    public int getCant_likes() {
        return cant_likes;
    }

    public void setCant_likes(int cant_likes) {
        this.cant_likes = cant_likes;
    }

    public ArrayList<Video> getVideos_propios() {
        return videos_propios;
    }

    public void setVideos_propios(ArrayList<Video> videos_propios) {
        this.videos_propios = videos_propios;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
