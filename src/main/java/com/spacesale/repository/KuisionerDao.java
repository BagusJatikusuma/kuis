package com.spacesale.repository;

import com.spacesale.model.Kuisioner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

/**
 * Created by bagus on 02/03/18.
 */
@Repository
public interface KuisionerDao extends JpaRepository<Kuisioner, String> {
}
