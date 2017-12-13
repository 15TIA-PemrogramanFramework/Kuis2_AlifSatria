/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.kuis_1007.controller;
import com.example.kuis_1007.entity.Ipk;
import com.example.kuis_1007.service.IpkService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author PC-25-320
 */
@RestController
@RequestMapping("/ipk_1007")

public class IpkController {

    @Autowired
    private IpkService ipkService;

    @RequestMapping(method = RequestMethod.POST)
    public Ipk insert(@RequestBody Ipk ipk) {
        return ipkService.insert(ipk);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Ipk update(@RequestBody Ipk ipk) {
        return ipkService.update(ipk);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return ipkService.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Ipk getById(@PathVariable("id") Long id){
        return ipkService.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Ipk> getAll(){
        return ipkService.getAll();
    }
}

