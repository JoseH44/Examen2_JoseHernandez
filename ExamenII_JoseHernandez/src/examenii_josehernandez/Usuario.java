/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenii_josehernandez;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author jrdjh
 */
public class Usuario implements Serializable {

    private String nombre;
    private int edad;
    private String correo;
    private String nom_usuario;
    private Canal canal;
    private String contrasena;
    private ArrayList<Canal> canales_suscritos = new ArrayList();
    private ArrayList<Video> videos_favoritos = new ArrayList();
    private static final long SerialVersionUID = 777L;

    public Usuario() {
    }

    public Usuario(String nombre, int edad, String correo, String nom_usuario, Canal canal, String contrasena) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
        this.nom_usuario = nom_usuario;
        this.canal = canal;
        this.contrasena = contrasena;
        this.videos_favoritos = videos_favoritos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNom_usuario() {
        return nom_usuario;
    }

    public void setNom_usuario(String nom_usuario) {
        this.nom_usuario = nom_usuario;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList<Canal> getCanales_suscritos() {
        return canales_suscritos;
    }

    public void setCanales_suscritos(ArrayList<Canal> canales_suscritos) {
        this.canales_suscritos = canales_suscritos;
    }

    public ArrayList<Video> getVideos_favoritos() {
        return videos_favoritos;
    }

    public void setVideos_favoritos(ArrayList<Video> videos_favoritos) {
        this.videos_favoritos = videos_favoritos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", edad=" + edad + ", correo=" + correo + ", nom_usuario=" + nom_usuario + ", canal=" + canal + ", contrasena=" + contrasena + ", canales_suscritos=" + canales_suscritos + ", videos_favoritos=" + videos_favoritos + '}';
    }

}
