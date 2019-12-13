/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenii_josehernandez;

/**
 *
 * @author jrdjh
 */
public class Video {

    private String nombre;
    private int tiempo_duracion;
    private int num_likes;
    private int num_dislikes;
    private String comentarios;
    private String subtitulos;

    public Video() {
    }

    public Video(String nombre, int tiempo_duracion, String subtitulos) {
        this.nombre = nombre;
        this.tiempo_duracion = tiempo_duracion;
        this.num_likes = 0;
        this.num_dislikes = 0;
        this.comentarios = comentarios;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTiempo_duracion() {
        return tiempo_duracion;
    }

    public void setTiempo_duracion(int tiempo_duracion) {
        this.tiempo_duracion = tiempo_duracion;
    }

    public int getNum_likes() {
        return num_likes;
    }

    public void setNum_likes(int num_likes) {
        this.num_likes = num_likes;
    }

    public int getNum_dislikes() {
        return num_dislikes;
    }

    public void setNum_dislikes(int num_dislikes) {
        this.num_dislikes = num_dislikes;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getSubtitulos() {
        return subtitulos;
    }

    public void setSubtitulos(String subtitulos) {
        this.subtitulos = subtitulos;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
