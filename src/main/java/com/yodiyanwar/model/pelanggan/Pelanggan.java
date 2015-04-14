package com.yodiyanwar.model.pelanggan;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by Yodi Yanwar on 01/03/2015.
 */
@Entity
@Table(name = "pelanggan")
public class Pelanggan implements Serializable {

    @Id
    @GeneratedValue(generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid2")
    @Column(name = "idPelanggan")
    private String idPelanggan;

    @Column(name = "namaPelanggan", length = 100, nullable = false)
    private String namaPelanggan;

    @Column(name = "alamat", length = 200, nullable = false)
    private String alamat;

    @Column(name = "noTelp", length = 12, nullable = true)
    private String noTelp;

    @Enumerated(EnumType.STRING)
    @Column(name = "jenisKelamin", nullable = false)
    private JenisKelamin jenisKelamin;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "tglInput", updatable = false)
    private Date tglInput;

    public String getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNamaPelanggan() {
        return namaPelanggan;
    }

    public void setNamaPelanggan(String namaPelanggan) {
        this.namaPelanggan = namaPelanggan;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNoTelp() {
        return noTelp;
    }

    public void setNoTelp(String noTelp) {
        this.noTelp = noTelp;
    }

    public JenisKelamin getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(JenisKelamin jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public Date getTglInput() {
        return tglInput;
    }

    public void setTglInput(Date tglInput) {
        this.tglInput = tglInput;
    }
}
