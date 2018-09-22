/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.dao;

import co.com.quipux.colegioquipux.models.entity.PlanEvaluacionEntity;

/**
 *
 * @author camil
 */
public interface PlanEvaluacionDAO {
    public void registroPlanEvalucion(PlanEvaluacionEntity planevalucion);
    
    public PlanEvaluacionEntity consultarPlan(int idplan);
    
}
