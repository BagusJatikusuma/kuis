package com.spacesale.controller.api;

import com.spacesale.PosApplication;
import com.spacesale.model.Kuisioner;
import com.spacesale.repository.KuisionerDao;
import com.spacesale.service.KuisionerService;
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
public class KuisionerController {
    public static final Logger LOGGER = LoggerFactory.getLogger(KuisionerController.class);

    @Autowired private KuisionerService kuisionerService;

    @RequestMapping(value = "/get-kuisioner", method = RequestMethod.GET)
    ResponseEntity<?> getKuisioner() {
        return new ResponseEntity<Object>(kuisionerService.getAllKuisioners(), HttpStatus.OK);
    }

}
