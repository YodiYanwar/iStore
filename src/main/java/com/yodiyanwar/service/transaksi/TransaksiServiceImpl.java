package com.yodiyanwar.service.transaksi;

import com.yodiyanwar.dao.transaksi.TransaksiDao;
import com.yodiyanwar.model.transaksi.Transaksi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Yodi Yanwar on 06/03/2015.
 */
@Service
@Transactional
public class TransaksiServiceImpl implements TransaksiService {

    @Autowired
    TransaksiDao transaksiDao;

    @Override
    public List<Transaksi> getAll(){
        return transaksiDao.getAll();
    }

    @Override
    public void add(Transaksi transaksi){
        transaksiDao.add(transaksi);
    }

    @Override
    public void edit(Transaksi transaksi){
        transaksiDao.edit(transaksi);
    }

    @Override
    public void delete(Integer idTransaksi){
        transaksiDao.delete(idTransaksi);
    }

    @Override
    public Transaksi getTransaksi(Integer idTransaksi){
        return transaksiDao.getTransaksi(idTransaksi);
    }
}
