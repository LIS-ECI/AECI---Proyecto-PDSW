/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.pdsw.aeci.entities;

/**
 *
 * @author 2095498
 */
public class Benefit {
    
    private int id;
    private String description;
    
    public Benefit( int Id,String Description){
        id=Id;
        description=Description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}