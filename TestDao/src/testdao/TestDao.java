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
        
        //LOS CAMPOS SON DE LONGITUD FIJA /VIN (17)/MARCA(5)/MODELO(5)/FECHA(CALENDAR)/ESTADO(5)
        
        /*
        //ESCRIBE
        fechaX = new MiCalendario(10, 3, 2009);
        fiat = new Auto("123456G7891234567", "chevy","cheto","4646",fechaX);
        
        try {
            dao.insertar(fiat);
        } catch (DAOExeption ex) {
            Logger.getLogger(TestDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        /*
        //MODIFICA
        fechaX = new MiCalendario(9, 1, 2022);
        fiat = new Auto("323456G323456G789", "Chevr", "Fuego", "4850", fechaX);

        try {
            dao.modificar(fiat);
        } catch (DAOExeption ex) {
            Logger.getLogger(TestDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        */
        
        //ELIMINA 
        // La key es el vim
        fechaX = new MiCalendario(12, 8, 2012);
        fiat = new Auto("3234888323456G789", "Ford#", "model", "4850", fechaX);

        try {
            dao.eliminar(fiat.getVin());
        } catch (DAOExeption ex) {
            Logger.getLogger(TestDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
}

//gaston.distilio@gmail.com <---- pasar parcial