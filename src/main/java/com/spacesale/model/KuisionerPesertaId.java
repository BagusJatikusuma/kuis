package com.spacesale.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by bagus on 02/03/18.
 */
@Embeddable
public class KuisionerPesertaId implements Serializable {
    @Column(name = "id_peserta")
    private String idPeserta;
    @Column(name = "id_kuisioner")
    private String idKuisioner;

    public KuisionerPesertaId() {
    }

    public KuisionerPesertaId(String idPeserta, String idKuisioner) {
        this.idPeserta = idPeserta;
        this.idKuisioner = idKuisioner;
    }

    public String getIdPeserta() {
        return idPeserta;
    }

    public void setIdPeserta(String idPeserta) {
        this.idPeserta = idPeserta;
    }

    public String getIdKuisioner() {
        return idKuisioner;
    }

    public void setIdKuisioner(String idKuisioner) {
        this.idKuisioner = idKuisioner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        KuisionerPesertaId that = (KuisionerPesertaId) o;

        if (!idPeserta.equals(that.idPeserta)) return false;
        return idKuisioner.equals(that.idKuisioner);
    }

    @Override
    public int hashCode() {
        int result = idPeserta.hashCode();
        result = 31 * result + idKuisioner.hashCode();
        return result;
    }
}
