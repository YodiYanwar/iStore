package com.yodiyanwar.controller.transaksi;

import com.yodiyanwar.model.transaksi.Transaksi;
import com.yodiyanwar.service.transaksi.TransaksiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Yodi Yanwar on 07/03/2015.
 */
@Controller
@RequestMapping("/transaksi")
public class TransaksiController {
    
    @Autowired
    TransaksiService transService;

    @ResponseBody
    @RequestMapping(value = "transaksi.json", method = RequestMethod.GET)
    public List<Transaksi> getAll(){
        return transService.getAll();
    }

    @ResponseBody
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void add(@RequestBody Transaksi trans){
        transService.add(trans);
    }

    @ResponseBody
    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public void edit(@RequestBody Transaksi trans){
        transService.edit(trans);
    }

    @ResponseBody
    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer idTrans){
        transService.delete(idTrans);
    }
}
