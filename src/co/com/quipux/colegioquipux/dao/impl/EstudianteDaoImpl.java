/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.EstudianteDAO;
import co.com.quipux.colegioquipux.models.entity.EstudianteEntity;
import java.util.ArrayList;

/**
 *
 * @author camil
 */
public class EstudianteDaoImpl implements EstudianteDAO{
    
     private ArrayList<EstudianteEntity> listaestudiantes = new ArrayList<EstudianteEntity>();

    @Override
    public void registrarEstudiante(EstudianteEntity estudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public EstudianteEntity consultarEstudiante(int idestudiante) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    /**
     * Comentario xD
     */
}
