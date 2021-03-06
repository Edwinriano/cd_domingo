/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reto3_Do.Reto3;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author PQ727LW
 */
@Repository
public class RepositorioBike {
    
    @Autowired
    private InterfaceBike crud;
    
    public List<Bike> getAll(){
        return (List<Bike>) crud.findAll();
    }
    
    public Optional<Bike> getBike(int id){
        return crud.findById(id);
    }
      
    public Bike save(Bike bike){
        return crud.save(bike);
    }
    public void delete(Bike bike){
        crud.delete(bike);
    }
}
