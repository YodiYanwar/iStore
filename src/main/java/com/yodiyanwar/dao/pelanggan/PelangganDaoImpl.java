package com.yodiyanwar.dao.pelanggan;

import com.yodiyanwar.model.pelanggan.Pelanggan;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * Created by Yodi Yanwar on 01/03/2015.
 */
@Repository
public class PelangganDaoImpl implements PelangganDao{

    @Autowired
    SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Pelanggan> getAll(){
        return getCurrentSession().createQuery("from Pelanggan").list();
    }

    @Override
    public void add(Pelanggan pelanggan){

        Date date = new Date();
        pelanggan.setTglInput(date);

        getCurrentSession().save(pelanggan);
    }

    @Override
    public void edit(Pelanggan pelanggan){
        Pelanggan plgToEdit = getPelanggan(pelanggan.getIdPelanggan());

        plgToEdit.setNamaPelanggan(pelanggan.getNamaPelanggan());
        plgToEdit.setAlamat(pelanggan.getAlamat());
        plgToEdit.setNoTelp(pelanggan.getNoTelp());
        plgToEdit.setJenisKelamin(pelanggan.getJenisKelamin());
    }

    @Override
    public void delete(String idPelanggan){
        Pelanggan foundPlg = getPelanggan(idPelanggan);

        getCurrentSession().delete(foundPlg);
    }

    @Override
    public Pelanggan getPelanggan(String idPelanggan){
        Pelanggan plg = (Pelanggan) getCurrentSession().get(Pelanggan.class, idPelanggan);
        return plg;
    }
}
