package com.spacesale.service.impl;

import com.spacesale.model.Kuisioner;
import com.spacesale.repository.KuisionerDao;
import com.spacesale.service.KuisionerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by bagus on 02/03/18.
 */
@Service("KuisionerService")
@Transactional
public class KuisionerServiceImpl implements KuisionerService {
    @Autowired private KuisionerDao kuisionerDao;

    @Override
    public List<Kuisioner> getAllKuisioners() {
        return kuisionerDao.findAll();
    }


}
