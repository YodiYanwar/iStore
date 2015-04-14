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
    private Integer kuantitas;

    @Temporal(TemporalType.DATE)
    @Column(name = "tgl_transaksi", nullable = false)
    private Date tglTransaksi;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipePembayaran", nullable = false, length = 35)
    private tipeBayar tipePembayaran;


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
        return kuantitas;
    }

    public void setKuantitas(Integer kuantitas) {
        this.kuantitas = kuantitas;
    }

    public Date getTglTransaksi() {
        return tglTransaksi;
    }

    public void setTglTransaksi(Date tglTransaksi) {
        this.tglTransaksi = tglTransaksi;
    }

    public enum tipeBayar{
        CASH, CEK, GIRO
    }

}
