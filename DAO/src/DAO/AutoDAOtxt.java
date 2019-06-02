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
public class AutoDAOtxt extends DAO<Auto,String>{

    private RandomAccessFile raf;
    
    public AutoDAOtxt(String path) throws DAOExeption {
        File file = new File(path);
        try {
            raf = new RandomAccessFile(file, "rws");  //sincronisa S
        } catch (FileNotFoundException ex) {
           throw new DAOExeption("El archivo no existe! //==> "+ex);
        }
    }

    
    
    @Override
    public void insertar(Auto entidad) throws DAOExeption {
        try {
            // se posiciona al final del archivo
            raf.seek(raf.length());
            raf.writeBytes( entidad.getVin() +"  "+ entidad.getMarca() +"  "+ entidad.getModelo() +"  "+ entidad.getFechaFab());
            
        } catch (IOException ex) {
            Logger.getLogger(AutoDAOtxt.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void modificar(Auto entidad) throws DAOExeption {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eliminar(String vin) throws DAOExeption {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
