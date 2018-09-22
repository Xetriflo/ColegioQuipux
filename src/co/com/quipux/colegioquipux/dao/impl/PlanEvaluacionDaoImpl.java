/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao.impl;

import co.com.quipux.colegioquipux.dao.PlanEvaluacionDAO;
import co.com.quipux.colegioquipux.models.entity.PlanEvaluacionEntity;
import java.util.ArrayList;

/**
 *
 * @author camil
 */
public class PlanEvaluacionDaoImpl implements PlanEvaluacionDAO{
     private ArrayList<PlanEvaluacionEntity> listaplanes = new ArrayList<PlanEvaluacionEntity>();

    @Override
    public void registroPlanEvalucion(PlanEvaluacionEntity planevalucion) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PlanEvaluacionEntity consultarPlan(int idplan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
