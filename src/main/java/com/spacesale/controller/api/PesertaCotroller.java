package com.spacesale.controller.api;

import com.spacesale.model.Peserta;
import com.spacesale.repository.PesertaDao;
import com.spacesale.service.PesertaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by bagus on 02/03/18.
 */
@RestController
@RequestMapping(value = "/api")
public class PesertaCotroller {
    public static final Logger LOGGER = LoggerFactory.getLogger(PesertaCotroller.class);

    @Autowired private PesertaService pesertaService;

    @RequestMapping(value = "/get-peserta", method = RequestMethod.GET)
    ResponseEntity<?> getPeserta() {
        return new ResponseEntity<Object>(pesertaService.getAllPeserta(), HttpStatus.OK);
    }
 }
