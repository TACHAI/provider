package com.laishishui.provider.service;

import com.laishishui.provider.po.Depart;

import java.util.List;

/**
 * Create by tachai on 2020-09-29 16:45
 * gitHub https://github.com/TACHAI
 * Email tc1206966083@gmail.com
 */
public interface DepartService {
    boolean saveDepart(Depart depart);
    boolean removeDepart(Integer id);
    boolean modifyDepart(Depart depart);
    Depart getDepartById(Integer id);
    List<Depart> listAllDeparts();
}
