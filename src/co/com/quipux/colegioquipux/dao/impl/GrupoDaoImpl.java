/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.GrupoDAO;
import co.com.quipux.colegioquipux.models.entity.GrupoEntity;
import java.util.ArrayList;

/**
 *
 * @author camil
 */
public class GrupoDaoImpl implements GrupoDAO{
    
     private ArrayList<GrupoEntity> listagrupo = new ArrayList<GrupoEntity>();
    @Override
    public void registrarGrupo(GrupoEntity grupo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GrupoEntity consultarGrupo(int idgrupo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
