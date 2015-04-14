package com.yodiyanwar.service.pelanggan;

import com.yodiyanwar.model.pelanggan.Pelanggan;

import java.util.List;

/**
 * Created by Yodi Yanwar on 01/03/2015.
 */
public interface PelangganService {

    public List<Pelanggan> getAll();
    public void add(Pelanggan pelanggan);
    public void edit(Pelanggan pelanggan);
    public void delete(String idPelanggan);
    public Pelanggan getPelanggan(String idPelanggan);
}
