/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdao;

import Auto.Auto;
import Auto.MotorizadoExeption;
import DAO.AutoDAOtxt;
import DAO.DAO;
import DAO.DAOExeption;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rodrigo
 */
public class TestDao {

    /**
     * @param args the command line arguments
     * @throws Auto.MotorizadoExeption
     * @throws testdao.MiCalendarioException
     */
    public static void main(String[] args) throws MotorizadoExeption, MiCalendarioException {
        DAO dao;
        try {
            
            dao = new AutoDAOtxt("auto.txt");
           
            
        } catch (DAOExeption ex) {
            Logger.getLogger(TestDao.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        Calendar fechaX;
        Auto fiat;
        fechaX = new MiCalendario(11, 10, 1313);
   
        fiat = new Auto(
                "8724888323456G786", // VIN
                "TOYOTA", // Marca
                "SUPPRA", // Modelo
                "BSB206", //Patente
                fechaX); // Fecha de fabricacion
        
        insertar(fiat, dao);
        //Modificar(fiat, dao);
        //Eliminar(fiat, dao);
        
       
    }
    
    public static void insertar(Auto auto, DAO dao)
    {
        try {
            dao.insertar(auto);
        } catch (DAOExeption ex) {
            Logger.getLogger(TestDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void Modificar(Auto auto, DAO dao)
    {
        try {
            dao.modificar(auto);
        } catch (DAOExeption ex) {
            Logger.getLogger(TestDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void Eliminar(Auto auto, DAO dao)
    {
        try {
            dao.eliminar(auto.getVin());
        } catch (DAOExeption ex) {
            Logger.getLogger(TestDao.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
}

//gaston.distilio@gmail.com <---- pasar parcial