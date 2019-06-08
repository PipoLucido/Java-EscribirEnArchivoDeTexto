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
            /*
            DAOfactory factory = DAOfactory.getInstance();
            DAOfactory factory2 = DAOfactory.getInstance();
            Map<String,String> config = new Map<String,String>();
            dao = factory.crearDAO(config);            
            */
            
        } catch (DAOExeption ex) {
            Logger.getLogger(TestDao.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        Calendar fechaX = null;
        try {
            fechaX = new MiCalendario(10, 3, 2009); ///MANDARLE UN CALENDARIO, CREAR MICALENDAR
        } catch (MiCalendarioException ex) {
            Logger.getLogger(TestDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Auto fiat;
        fiat = new Auto("123456G78912345678", "fiat", "modelo", "4646", fechaX);
        
        try {
            dao.insertar(fiat);
        } catch (DAOExeption ex) {
            Logger.getLogger(TestDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

//gaston.distilio@gmail.com <---- pasar parcial