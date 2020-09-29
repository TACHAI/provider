package com.laishishui.provider.service.impl;

import com.laishishui.provider.dao.DepartRepository;
import com.laishishui.provider.po.Depart;
import com.laishishui.provider.service.DepartService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Create by tachai on 2020-09-29 17:10
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public class DepartServiceImpl implements DepartService {

    @Autowired
    private DepartRepository repository;

    @Override
    public boolean saveDepart(Depart depart) {
        Depart obj = repository.save(depart);
        if(obj != null){
            return true;
        }
        return false;
    }

    @Override
    public boolean remoteDepart(Integer id) {
        // 指定id的实体不存在，deleteById()
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public boolean modifyDepart(Depart depart) {
        Depart obj = repository.save(depart);
        if(obj!=null){
            return true;
        }
        return false;
    }

    @Override
    public Depart getDepartById(Integer id) {
        // 指定id的实体不存在，getOne()方法会抛异常
        if(repository.existsById(id)){
            return repository.getOne(id);
        }
        Depart depart = new Depart();
        depart.setName("no this depart");
        return depart;
    }

    @Override
    public List<Depart> listAllDeparts() {
        return repository.findAll();
    }
}
