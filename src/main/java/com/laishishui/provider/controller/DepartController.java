package com.laishishui.provider.controller;

import com.laishishui.provider.po.Depart;
import com.laishishui.provider.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Create by tachai on 2020-09-29 17:20
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
@RequestMapping("/provider")
@RestController
public class DepartController {

    @Autowired
    private DepartService service;


    @PatchMapping("/save")
    public boolean saveHandle(@RequestBody Depart depart){
        return service.saveDepart(depart);
    }

    @DeleteMapping("/del/{id}")
    public boolean deleteHandle(@PathVariable("id")int id){
        return service.removeDepart(id);
    }

    @PutMapping("/update")
    public boolean modifyHandle(@RequestBody Depart depart){
        return service.modifyDepart(depart);
    }

    @GetMapping("/get/{id}")
    public Depart getHandle(@PathVariable("id")int id){
        return service.getDepartById(id);
    }

    @GetMapping("/list")
    public List<Depart> listHandle(){
        return service.listAllDeparts();
    }
}
