package com.spacesale.repository;

import com.spacesale.model.Peserta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by bagus on 02/03/18.
 */
@Repository
public interface PesertaDao extends JpaRepository<Peserta, String> {
}
