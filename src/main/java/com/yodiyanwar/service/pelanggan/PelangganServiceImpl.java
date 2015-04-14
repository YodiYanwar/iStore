package com.yodiyanwar.service.pelanggan;

import com.yodiyanwar.dao.pelanggan.PelangganDao;
import com.yodiyanwar.model.pelanggan.Pelanggan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Yodi Yanwar on 01/03/2015.
 */
@Service
@Transactional
public class PelangganServiceImpl implements PelangganService{

    @Autowired
    PelangganDao plgDao;

    @Override
    public List<Pelanggan> getAll(){
        return plgDao.getAll();
    }

    @Override
    public void add(Pelanggan pelanggan){
        plgDao.add(pelanggan);
    }

    @Override
    public void edit(Pelanggan pelanggan){
        plgDao.edit(pelanggan);
    }

    @Override
    public void delete(String idPelanggan){
        plgDao.delete(idPelanggan);
    }

    @Override
    public Pelanggan getPelanggan(String idPelanggan){
        return plgDao.getPelanggan(idPelanggan);
    }
}
