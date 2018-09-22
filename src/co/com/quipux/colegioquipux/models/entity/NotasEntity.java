/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.quipux.colegioquipux.models.entity;

/**
 *
 * @author camil
 */
public class NotasEntity {
     String descripcionota;
     String nota;

    public NotasEntity(String descripcionota, String nota, String idnota, String Estudiante) {
        this.descripcionota = descripcionota;
        this.nota = nota;
        this.idnota = idnota;
        this.Estudiante = Estudiante;
    }
    String idnota;
    String Estudiante;

   
    

    public String getDescripcionota() {
        return descripcionota;
    }

    public String getEstudiante() {
        return Estudiante;
    }

    public void setEstudiante(String Estudiante) {
        this.Estudiante = Estudiante;
    }

    public void setDescripcionota(String descripcionota) {
        this.descripcionota = descripcionota;
    }

    public String getNota() {
        return nota;
    }

    public void setNota(String nota) {
        this.nota = nota;
    }

    public String getIdnota() {
        return idnota;
    }

    public void setIdnota(String idnota) {
        this.idnota = idnota;
    }

    public NotasEntity(String descripcionota, String nota) {
        this.descripcionota = descripcionota;
        this.nota = nota;
    }

    
    
    
}
