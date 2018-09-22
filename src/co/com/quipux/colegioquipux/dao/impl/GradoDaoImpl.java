/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.GradoDAO;
import co.com.quipux.colegioquipux.models.entity.GradoEntity;
import java.util.ArrayList;

/**
 *
 * @author camil
 */
public class GradoDaoImpl implements GradoDAO{
    
     private ArrayList<GradoEntity> listagrados = new ArrayList<GradoEntity>();

    @Override
    public void registrarGrado(GradoEntity grado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GradoEntity consultarGrado(int idgrado) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
