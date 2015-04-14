package com.yodiyanwar.service.barang;

import com.yodiyanwar.dao.barang.BarangDao;
import com.yodiyanwar.model.barang.Barang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

import java.util.List;

/**
 * Created by Yodi Yanwar on 01/03/2015.
 */
@Service
@Transactional
public class BarangServiceImpl implements BarangService{

    @Autowired
    private BarangDao brgDao;

    @Override
    public List<Barang> getAll(){
        return brgDao.getAll();
    }

    @Override
    public void add(Barang barang){
        brgDao.add(barang);
    }

    @Override
    public void edit(Barang barang){

        System.out.println("Di Service");
        System.out.println("Id Barang   : "+barang.getIdBarang());
        System.out.println("Nama Barang : "+barang.getNamaBrg());
        System.out.println("Satuan      : "+barang.getSatuan());
        System.out.println("Kategori    : "+barang.getKategori());
        System.out.println("Stok        : "+barang.getStok());
        System.out.println("Harga       : Rp."+barang.getHarga());
        System.out.println("Tgl Input   : "+barang.getTglInput());
        System.out.println("Tgl Update  : "+barang.getTglUpdate());

        brgDao.edit(barang);
    }

    @Override
    public void delete(String idBarang){
        brgDao.delete(idBarang);
    }

    @Override
    public Barang getBarang(String idBarang){
        return brgDao.getBarang(idBarang);
    }
}
