package com.yodiyanwar.dao.barang;

import com.yodiyanwar.model.barang.Barang;

import java.util.List;

/**
 * Created by Yodi Yanwar on 01/03/2015.
 */
public interface BarangDao {

    public List<Barang> getAll();
    public void add(Barang barang);
    public void edit(Barang barang);
    public void delete(String idBarang);
    public Barang getBarang(String idBarang);
}
