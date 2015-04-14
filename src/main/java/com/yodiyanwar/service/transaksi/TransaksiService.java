package com.yodiyanwar.service.transaksi;

import com.yodiyanwar.model.transaksi.Transaksi;

import java.util.List;

/**
 * Created by Yodi Yanwar on 06/03/2015.
 */
public interface TransaksiService {

    public List<Transaksi> getAll();
    public void add(Transaksi transaksi);
    public void edit(Transaksi transaksi);
    public void delete(Integer idTransaksi);
    public Transaksi getTransaksi(Integer idTransaksi);
}
