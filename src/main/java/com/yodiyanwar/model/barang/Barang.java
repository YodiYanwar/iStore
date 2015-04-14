package com.yodiyanwar.model.barang;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Yodi Yanwar on 01/03/2015.
 */
@Entity
@Table(name = "barang")
public class Barang implements Serializable {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "idBarang")
    private String idBarang;

    @Column(name = "namaBrg", length = 100, nullable = false)
    private String namaBrg;

    @Column(name = "satuan", length = 100, nullable = false)
    private String satuan;

    @Column(name = "stok", nullable = false)
    private Integer stok;

    @Column(name = "kategori", length = 100, nullable = false)
    private String kategori;

    @Column(name = "harga")
    private Integer harga;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "tglInput", updatable = false)
    private Date tglInput;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "tglUpdate", insertable = false)
    private Date tglUpdate;

    public String getIdBarang() {
        return idBarang;
    }

    public void setIdBarang(String idBarang) {
        this.idBarang = idBarang;
    }

    public String getNamaBrg() {
        return namaBrg;
    }

    public void setNamaBrg(String namaBrg) {
        this.namaBrg = namaBrg;
    }

    public String getSatuan() {
        return satuan;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public Integer getStok() {
        return stok;
    }

    public void setStok(Integer stok) {
        this.stok = stok;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public Integer getHarga() {
        return harga;
    }

    public void setHarga(Integer harga) {
        this.harga = harga;
    }

    public Date getTglInput() {
        return tglInput;
    }

    public void setTglInput(Date tglInput) {
        this.tglInput = tglInput;
    }

    public Date getTglUpdate() {
        return tglUpdate;
    }

    public void setTglUpdate(Date tglUpdate) {
        this.tglUpdate = tglUpdate;
    }
}
