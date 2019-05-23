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
     */
    public static void main(String[] args) throws MotorizadoExeption {
        DAO dao;
        try {
            dao = new AutoDAOtxt("auto.txt");
        } catch (DAOExeption ex) {
            Logger.getLogger(TestDao.class.getName()).log(Level.SEVERE, null, ex);
            return;
        }
        
        Calendar x = null;
        
        Auto fiat;
        fiat = new Auto("12345678912345678", x);
        
        try {
            dao.insertar(fiat);
        } catch (DAOExeption ex) {
            Logger.getLogger(TestDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
