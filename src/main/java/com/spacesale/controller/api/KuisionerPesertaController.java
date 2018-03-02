package com.spacesale.controller.api;

import com.spacesale.model.*;
import com.spacesale.repository.KuisionerPesertaDao;
import com.spacesale.service.KuisionerPesertaService;
import com.spacesale.wrapper.KuisionerPesertaWrapper;
import com.spacesale.wrapper.NilaiKuisionerWrapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by bagus on 02/03/18.
 */
@RestController
@RequestMapping(value = "/api")
public class KuisionerPesertaController {
    public static final Logger LOGGER = LoggerFactory.getLogger(PesertaCotroller.class);

    @Autowired private KuisionerPesertaService kuisionerPesertaService;

    @RequestMapping(value = "/create-kuisioner-peserta", method = RequestMethod.POST)
    ResponseEntity<?> createKuisionerPeserat(@RequestBody KuisionerPesertaWrapper inputWrapper) {

        for (NilaiKuisionerWrapper nilaiKuisionerWrapper
                : inputWrapper.getNilaiKuisionerWrappers()) {
            KuisionerPesertaId id
                    = new KuisionerPesertaId(inputWrapper.getIdPeserta(), nilaiKuisionerWrapper.getIdKuisioner());
            KuisionerPeserta p = new KuisionerPeserta();

            p.setKuisionerPesertaId(id);
            p.setTglPenilaianMilis(new Date().getTime());
            p.setNilaiKuisionerEnum(changeIntInputIntoEnum(nilaiKuisionerWrapper.getNilaiKuisioner()));

            kuisionerPesertaService.create(p);
        }

        return new ResponseEntity<Object>("success create kuisioner", HttpStatus.OK);
    }

    private NilaiKuisionerEnum changeIntInputIntoEnum(int value) {
        switch (value) {
            case 1 :
                return NilaiKuisionerEnum.SATU;
            case 2 :
                return NilaiKuisionerEnum.DUA;
            case 3 :
                return NilaiKuisionerEnum.TIGA;
            case 4 :
                return NilaiKuisionerEnum.EMPAT;
        }
        //default value
        return NilaiKuisionerEnum.SATU;
    }
}
