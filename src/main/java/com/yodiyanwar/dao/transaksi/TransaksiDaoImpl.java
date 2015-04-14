package com.yodiyanwar.dao.transaksi;

import com.yodiyanwar.model.transaksi.Transaksi;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Yodi Yanwar on 06/03/2015.
 */
@Repository
public class TransaksiDaoImpl implements TransaksiDao{

    @Autowired
    SessionFactory sessionFactory;

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Transaksi> getAll(){
        return getCurrentSession().createQuery("from Transaksi").list();
    }

    @Override
    public void add(Transaksi transaksi){
        getCurrentSession().save(transaksi);
    }

    @Override
    public void edit(Transaksi transaksi){
        Transaksi transToEdit = getTransaksi(transaksi.getIdTransaksi());

        transToEdit.setBarang(transaksi.getBarang());
        transToEdit.setKuantitas(transaksi.getKuantitas());
        transToEdit.setPelanggan(transaksi.getPelanggan());
        transToEdit.setTglTransaksi(transaksi.getTglTransaksi());
    }

    @Override
    public void delete(Integer idTransaksi){
        getCurrentSession().delete(idTransaksi);
    }

    @Override
    public Transaksi getTransaksi(Integer idTransaksi){
        Transaksi trans = (Transaksi) getCurrentSession().get(Transaksi.class, idTransaksi);
        return trans;
    }

}
