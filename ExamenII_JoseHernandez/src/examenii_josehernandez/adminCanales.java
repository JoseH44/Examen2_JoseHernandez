package examenii_josehernandez;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jrdjh
 */
public class adminCanales {

    private File archivo = null;
    private ArrayList<Canal> lista_canales = new ArrayList();

    public adminCanales(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Canal> getLista_canales() {
        return lista_canales;
    }

    public void setLista_canales(ArrayList<Canal> lista_canales) {
        this.lista_canales = lista_canales;
    }

    @Override
    public String toString() {
        return "adminCanales{" + "archivo=" + archivo + ", lista_canales=" + lista_canales + '}';
    }

    public void cargarArchivo() {
        try {
            lista_canales = new ArrayList();
            Canal temp;
            if (archivo.exists()) {
                FileInputStream entrada = new FileInputStream(archivo);
                ObjectInputStream objeto = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Canal) objeto.readObject()) != null) {
                        lista_canales.add(temp);
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
            for (Canal t : lista_canales) {
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
