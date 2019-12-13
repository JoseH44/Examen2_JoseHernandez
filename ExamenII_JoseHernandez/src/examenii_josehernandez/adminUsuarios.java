/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenii_josehernandez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author jrdjh
 */
public class adminUsuarios {

    private File archivo = null;
    private ArrayList<Usuario> lista_usuarios = new ArrayList();

    public adminUsuarios(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Usuario> getLista_usuarios() {
        return lista_usuarios;
    }

    public void setLista_usuarios(ArrayList<Usuario> lista_usuarios) {
        this.lista_usuarios = lista_usuarios;
    }

    @Override
    public String toString() {
        return "adminUsuarios{" + "archivo=" + archivo + ", lista_usuarios=" + lista_usuarios + '}';
    }

    public void cargarArchivo() {
        try {
            lista_usuarios = new ArrayList();
            Usuario temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Usuario) objeto.readObject()) != null) {
                        lista_usuarios.add(temp);
                    }
                } catch (EOFException e) {
                }
                objeto.close();
                entrada.close();

            }
        } catch (Exception e) {
        }
    }

    public void escribirArchivo() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Usuario t : lista_usuarios) {
                bw.writeObject(t);
            }
            bw.flush();

        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }

    }

}
