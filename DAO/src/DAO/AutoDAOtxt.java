/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Auto.Auto;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo
 */
public class AutoDAOtxt extends DAO<Auto, String> {

    private RandomAccessFile raf;

    public AutoDAOtxt(String path) throws DAOExeption {
        File file = new File(path);
        try {
            raf = new RandomAccessFile(file, "rws");  //sincronisa S
        } catch (FileNotFoundException ex) {
            throw new DAOExeption("El archivo no existe! //==> " + ex);
        }
    }

    @Override
    public void insertar(Auto entidad) throws DAOExeption {
        try {
            // Busca la entidad
            String vinLeido; // Almacena el contenido del txt linea por linea
            String campos[];
            String linea;
            int seekaux = 0;

            raf.seek(seekaux);
            while ((linea = raf.readLine()) != null) {
                if (linea.length() > 16) {
                    vinLeido = linea.substring(0, 17);
                   /* System.out.println(vin);
                    System.out.println(vinLeido);*/
                    if (vinLeido.equals(entidad.getVin())) {
                        System.out.print("Ya existe el objeto a insertar. VIN = " + entidad.getVin());
                        raf.close();
                        return;
                    }
                }
            }
            raf.seek(raf.length());
            raf.writeBytes(entidad.getVin() + " " + entidad.getMarca() + " " + entidad.getModelo() + " " + entidad.getFechaFab() + " NUEVO\n");
            raf.close();
        } catch (IOException ex) {
            Logger.getLogger(AutoDAOtxt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(Auto entidad) throws DAOExeption {
        try {
            // busca la entidad
            String vin; // Almacena el contenido del txt linea por linea
            String campos[];
            String linea;
            int seekaux = 0;

            raf.seek(seekaux);
            while ((linea = raf.readLine()) != null) {
                if (linea.length() > 16) {
                    vin = linea.substring(0, 17);
                    if (vin.equals(entidad.getVin())) {
                        raf.seek(raf.getFilePointer() - linea.length() - 1);
                        raf.writeBytes(entidad.getVin() + " " + entidad.getMarca() + " " + entidad.getModelo() + " " + entidad.getFechaFab() + " MODIF\n");
                        break;
                    }
                }
            }
            raf.close();
        } catch (IOException ex) {
            Logger.getLogger(AutoDAOtxt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void eliminar(String vin) throws DAOExeption {
        
        //////
        try {
            // busca la entidad
            String vinLeido; // Almacena el contenido del txt linea por linea
            String campos[];
            String linea;
            int seekaux = 0;

            raf.seek(seekaux);
            while ((linea = raf.readLine()) != null) {
                if (linea.length() > 16) {
                    vinLeido = linea.substring(0, 17);
                   /* System.out.println(vin);
                    System.out.println(vinLeido);*/
                    if (vinLeido.equals(vin)) {

                        raf.seek(raf.getFilePointer() - 7); //SE POSISIONA EN ESTADO Y LO CAMBIA POR ELIMI
                        raf.writeBytes(" ELIMI");

                        break;
                    }

                }
            }
            raf.close();
        } catch (IOException ex) {
            Logger.getLogger(AutoDAOtxt.class.getName()).log(Level.SEVERE, null, ex);
        }

        ////////
    }

    @Override
    public Auto buscar(String clave) throws DAOExeption {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Auto> listar() throws DAOExeption {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
