package com.yodiyanwar.controller.barang;

import com.yodiyanwar.model.barang.Barang;
import com.yodiyanwar.service.barang.BarangService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Yodi Yanwar on 01/03/2015.
 */
@Controller
@RequestMapping("/barang")
public class BarangController {

    @Autowired
    BarangService brgService;

    private int n = 1;

    @ResponseBody
    @RequestMapping(value = "barang.json", method = RequestMethod.GET)
    public List<Barang> getAllBrg(){

        for (Barang brg : brgService.getAll()){
            System.out.println("\n============= Barang ke-"+n+" =====================");
            System.out.println("Id Barang   : "+brg.getIdBarang());
            System.out.println("Nama Barang : "+brg.getNamaBrg());
            System.out.println("Satuan      : "+brg.getSatuan());
            System.out.println("Kategori    : "+brg.getKategori());
            System.out.println("Stok        : "+brg.getStok());
            System.out.println("Harga       : Rp."+brg.getHarga());
            System.out.println("Tgl Input   : "+brg.getTglInput());
            System.out.println("Tgl Update  : "+brg.getTglUpdate());

            n++;
        }

        return brgService.getAll();
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(@RequestBody Barang brg){
        System.out.println("Di Controller");
        System.out.println("Id Barang   : "+brg.getIdBarang());
        System.out.println("Nama Barang : "+brg.getNamaBrg());
        System.out.println("Satuan      : "+brg.getSatuan());
        System.out.println("Kategori    : "+brg.getKategori());
        System.out.println("Stok        : "+brg.getStok());
        System.out.println("Harga       : Rp."+brg.getHarga());
        System.out.println("Tgl Input   : "+brg.getTglInput());
        System.out.println("Tgl Update  : "+brg.getTglUpdate());

        brgService.add(brg);
    }

    @ResponseBody
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public void edit(@RequestBody Barang brg){
        System.out.println("Di Controller");
        System.out.println("Id Barang   : "+brg.getIdBarang());
        System.out.println("Nama Barang : "+brg.getNamaBrg());
        System.out.println("Satuan      : "+brg.getSatuan());
        System.out.println("Kategori    : "+brg.getKategori());
        System.out.println("Stok        : "+brg.getStok());
        System.out.println("Harga       : Rp."+brg.getHarga());
        System.out.println("Tgl Input   : "+brg.getTglInput());
        System.out.println("Tgl Update  : "+brg.getTglUpdate());

        brgService.edit(brg);
    }

    @ResponseBody
    @RequestMapping(value = "delete/{idBarang}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("idBarang") String idBarang){
        brgService.delete(idBarang);
    }
}
