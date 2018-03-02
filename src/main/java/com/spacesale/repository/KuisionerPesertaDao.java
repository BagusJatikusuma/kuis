package com.spacesale.repository;

import com.spacesale.model.KuisionerPeserta;
import com.spacesale.model.KuisionerPesertaId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by bagus on 02/03/18.
 */
@Repository
public interface KuisionerPesertaDao extends JpaRepository<KuisionerPeserta, KuisionerPesertaId>{
}
