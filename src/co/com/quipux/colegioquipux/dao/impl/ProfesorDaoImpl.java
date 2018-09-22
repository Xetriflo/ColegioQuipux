/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.ProfesorDAO;
import co.com.quipux.colegioquipux.models.entity.ProfesorEntity;
import java.util.ArrayList;

/**
 *
 * @author salim.castellanos
 */
public class ProfesorDaoImpl implements ProfesorDAO{

    private ArrayList<ProfesorEntity> listaProfesores = new ArrayList<ProfesorEntity>();
    
    
    public void registrarProfesor(ProfesorEntity profesor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    public ProfesorEntity consultarProfesor(int idProfesor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void registroPlanEvalucion(ProfesorEntity profesor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ProfesorEntity consultarPlan(int idprofesor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
