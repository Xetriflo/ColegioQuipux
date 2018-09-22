/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.NotasDAO;
import co.com.quipux.colegioquipux.models.entity.NotasEntity;
import java.util.ArrayList;

/**
 *
 * @author camil
 */
public class NotaDaoImpl implements NotasDAO{
     private ArrayList<NotasEntity> listanotas = new ArrayList<NotasEntity>();

    @Override
    public void registrarNota(NotasEntity nota) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public NotasEntity consultarNota(int idnota) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
