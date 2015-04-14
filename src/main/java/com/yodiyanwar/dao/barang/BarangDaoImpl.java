package com.yodiyanwar.dao.barang;

import com.yodiyanwar.model.barang.Barang;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Yodi Yanwar on 01/03/2015.
 */
@Repository
public class BarangDaoImpl implements BarangDao{

    @Autowired
    private SessionFactory sessionFactory;

    //private List<Barang> listBrg = new ArrayList<Barang>();

    private Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public List<Barang> getAll(){
        return getCurrentSession().createQuery("from Barang").list();
    }

    @Override
    public void add(Barang barang){

        //DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        barang.setTglInput(date);

        System.out.println("Di Dao");
        System.out.println("Id Barang   : " +barang.getIdBarang());
        System.out.println("Nama Barang : "+barang.getNamaBrg());
        System.out.println("Satuan      : "+barang.getSatuan());
        System.out.println("Kategori    : "+barang.getKategori());
        System.out.println("Stok        : "+barang.getStok());
        System.out.println("Harga       : Rp."+barang.getHarga());
        System.out.println("Tgl Input   : "+barang.getTglInput());
        System.out.println("Tgl Update  : "+barang.getTglUpdate());

        getCurrentSession().save(barang);
    }

    @Override
    public void edit(Barang barang){

        System.out.println("Di Dao");
        System.out.println("Id Barang   : "+barang.getIdBarang());
        System.out.println("Nama Barang : "+barang.getNamaBrg());
        System.out.println("Satuan      : "+barang.getSatuan());
        System.out.println("Kategori    : "+barang.getKategori());

        System.out.println("Stok        : "+barang.getStok());
        System.out.println("Harga       : Rp."+barang.getHarga());
        System.out.println("Tgl Input   : "+barang.getTglInput());
        System.out.println("Tgl Update  : "+barang.getTglUpdate());

        Barang brgToEdit = getBarang(barang.getIdBarang());

        brgToEdit.setNamaBrg(barang.getNamaBrg());
        brgToEdit.setSatuan(barang.getSatuan());
        brgToEdit.setStok(barang.getStok());
        brgToEdit.setKategori(barang.getKategori());
        brgToEdit.setHarga(barang.getHarga());
        brgToEdit.setTglInput((barang.getTglInput()));

        Date date = new Date();
        brgToEdit.setTglUpdate(date);

        //getCurrentSession().update(brgToEdit);

        /*Query query = sessionFactory.getCurrentSession().createQuery("update barang set namaBrg = :namaBrg where idPeminjaman = :idPeminjaman");
        query.setParameter("peminjaman", true);
        query.setParameter("idPeminjaman", idPeminjaman);
        query.executeUpdate();*/
    }

    @Override
    public void delete(String idBarang){
        Barang brg = getBarang(idBarang);
        if (brg != null){
            getCurrentSession().delete(brg);
        }
    }

    public Barang getBarang(String idBarang){
        Barang brg = (Barang) getCurrentSession().get(Barang.class, idBarang);
        return brg;
    }

}
