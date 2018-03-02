package com.spacesale.service.impl;

import com.spacesale.model.KuisionerPeserta;
import com.spacesale.repository.KuisionerPesertaDao;
import com.spacesale.service.KuisionerPesertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

/**
 * Created by bagus on 02/03/18.
 */
@Service("KuisionerPesertaService")
@Transactional
public class KuisionerPesertaServiceImpl implements KuisionerPesertaService {
    @Autowired private KuisionerPesertaDao kuisionerPesertaDao;

    @Override
    public void create(KuisionerPeserta kuisionerPeserta) {
        kuisionerPesertaDao.save(kuisionerPeserta);
    }

}
