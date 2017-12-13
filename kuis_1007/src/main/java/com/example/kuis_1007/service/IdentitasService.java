/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1007.service;
import com.example.kuis_1007.entity.Identitas;
import com.example.kuis_1007.repo.IdentitasRepo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author PC-25-320
 */


/**
 *
 * @author Hendro Steven
 */
@Service("identitasService")
@Transactional
public class IdentitasService {

    @Autowired
    private IdentitasRepo repo;

    public Identitas insert(Identitas identitas) {
        return repo.save(identitas);
    }
    
    public Identitas update(Identitas identitas) {
        return repo.save(identitas);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Identitas getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Identitas> getAll(){
        return repo.findAllIdentitas();
    }
}
