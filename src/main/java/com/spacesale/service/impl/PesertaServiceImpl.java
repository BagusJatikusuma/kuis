package com.spacesale.service.impl;

import com.spacesale.model.Peserta;
import com.spacesale.repository.PesertaDao;
import com.spacesale.service.PesertaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by bagus on 02/03/18.
 */
@Service("PesertaService")
@Transactional
public class PesertaServiceImpl implements PesertaService {
    @Autowired private PesertaDao pesertaDao;

    @Override
    public List<Peserta> getAllPeserta() {
        return pesertaDao.findAll();
    }
}
