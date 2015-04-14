package com.yodiyanwar.controller.pelanggan;

import com.yodiyanwar.model.pelanggan.Pelanggan;
import com.yodiyanwar.service.pelanggan.PelangganService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Yodi Yanwar on 07/03/2015.
 */
@Controller
@RequestMapping("/pelanggan")
public class PelangganController {

    @Autowired
    PelangganService plgService;

    @ResponseBody
    @RequestMapping(value = "/pelanggan.json", method = RequestMethod.GET)
    public List<Pelanggan> getAll(){
        return plgService.getAll();
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(@RequestBody Pelanggan plg){
        plgService.add(plg);
    }

    @ResponseBody
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public void edit(@RequestBody Pelanggan plg){
        plgService.edit(plg);
    }

    @ResponseBody
    @RequestMapping(value = "/delete/{idPelanggan}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("idPelanggan") String idPelanggan){
        plgService.delete(idPelanggan);
    }
}
