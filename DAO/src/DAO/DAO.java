/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.List;

/**
 *
 * @author Rodrigo
 * @param <T> tIPO DE DATO GENERICO
 * @param <K> tIPO DE DATO KEY
 */
public abstract class DAO<T,K>/*datosGenericos entre <datoGnerico>*/ {
    
    public abstract void insertar(T entidad) throws DAOExeption;
    public abstract void modificar(T entidad) throws DAOExeption;
    public abstract void eliminar(K clave) throws DAOExeption; /*elimina objeto de la clave*/
    public abstract T buscar(K clave) throws DAOExeption; /*buscar objeto clave*/
    public abstract List<T> listar() throws DAOExeption;/*busca todo devuelve una lista de T*/

    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
