package com.spacesale.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by bagus on 02/03/18.
 */
@Entity
@Table(name = "kuisioner")
public class Kuisioner {
    @Id
    @Column(name = "id_kuisioner", columnDefinition = "VARCHAR(255)")
    private String idKuisioner;
    @Column(name = "deskripsi_kuisioner", columnDefinition = "TEXT")
    private String deskripsiKuisioner;

    @OneToMany(mappedBy = "kuisioner")
    private List<KuisionerPeserta> kuisionerPesertaList;

    public String getIdKuisioner() {
        return idKuisioner;
    }

    public void setIdKuisioner(String idKuisioner) {
        this.idKuisioner = idKuisioner;
    }

    public String getDeskripsiKuisioner() {
        return deskripsiKuisioner;
    }

    public void setDeskripsiKuisioner(String deskripsiKuisioner) {
        this.deskripsiKuisioner = deskripsiKuisioner;
    }

    public List<KuisionerPeserta> getKuisionerPesertaList() {
        return kuisionerPesertaList;
    }

    public void setKuisionerPesertaList(List<KuisionerPeserta> kuisionerPesertaList) {
        this.kuisionerPesertaList = kuisionerPesertaList;
    }
}
