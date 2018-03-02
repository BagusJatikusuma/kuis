package com.spacesale.wrapper;

import java.util.List;

/**
 * Created by bagus on 02/03/18.
 */
public class KuisionerPesertaWrapper {
    private String idPeserta;
    private List<NilaiKuisionerWrapper> nilaiKuisionerWrappers;

    public String getIdPeserta() {
        return idPeserta;
    }

    public void setIdPeserta(String idPeserta) {
        this.idPeserta = idPeserta;
    }

    public List<NilaiKuisionerWrapper> getNilaiKuisionerWrappers() {
        return nilaiKuisionerWrappers;
    }

    public void setNilaiKuisionerWrappers(List<NilaiKuisionerWrapper> nilaiKuisionerWrappers) {
        this.nilaiKuisionerWrappers = nilaiKuisionerWrappers;
    }
}
