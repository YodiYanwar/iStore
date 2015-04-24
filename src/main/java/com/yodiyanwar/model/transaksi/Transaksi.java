package com.yodiyanwar.model.transaksi;

import com.yodiyanwar.model.barang.Barang;
import com.yodiyanwar.model.pelanggan.Pelanggan;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Yodi Yanwar on 01/03/2015.
 */
@Entity
@Table(name = "transaksi")
public class Transaksi {

    @Id
    @GeneratedValue
    @Column(name = "id_transaksi")
    private Integer idTransaksi;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_pelanggan", nullable = false)
    private Pelanggan pelanggan;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "id_barang", nullable = false)
    private Barang barang;

    @Column(name = "qty", nullable = false)
    private Integer qty;
    
    @Enumerated(EnumType.STRING)
    @Column(name = "tipeBayar", nullable = false)
    private TipeBayar tipeBayar;

    @Temporal(TemporalType.DATE)
    @Column(name = "tglTransaksi", nullable = false)
    private Date tglTransaksi;


    public Integer getIdTransaksi() {
        return idTransaksi;
    }

    public void setIdTransaksi(Integer idTransaksi) {
        this.idTransaksi = idTransaksi;
    }

    public Pelanggan getPelanggan() {
        return pelanggan;
    }

    public void setPelanggan(Pelanggan pelanggan) {
        this.pelanggan = pelanggan;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public Integer getKuantitas() {
        return qty;
    }

    public void setKuantitas(Integer kuantitas) {
        this.qty = qty;
    }

    public Date getTglTransaksi() {
        return tglTransaksi;
    }

    public void setTglTransaksi(Date tglTransaksi) {
        this.tglTransaksi = tglTransaksi;
    }

    public TipeBayar getTipeBayar() {
        return tipeBayar;
    }

    public void setTipeBayar(TipeBayar tipeBayar) {
        this.tipeBayar = tipeBayar;
    }

}
