package com.spacesale.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by bagus on 02/03/18.
 */
@Entity
@Table(name = "peserta")
public class Peserta {
    @Id
    @Column(name = "id_peserta")
    private String idPeserta;
    @Column(name = "password")
    private String password;
    @Column(name = "nama_peserta")
    private String namaPeserta;
    @Column(name = "alamat_peserta")
    private String alamatPeserta;
    @Column(name = "email_peserta")
    private String emailPeserta;

    @OneToMany(mappedBy = "peserta")
    private List<KuisionerPeserta> kuisionerPesertaList;

    public String getIdPeserta() {
        return idPeserta;
    }

    public void setIdPeserta(String idPeserta) {
        this.idPeserta = idPeserta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNamaPeserta() {
        return namaPeserta;
    }

    public void setNamaPeserta(String namaPeserta) {
        this.namaPeserta = namaPeserta;
    }

    public String getAlamatPeserta() {
        return alamatPeserta;
    }

    public void setAlamatPeserta(String alamatPeserta) {
        this.alamatPeserta = alamatPeserta;
    }

    public String getEmailPeserta() {
        return emailPeserta;
    }

    public void setEmailPeserta(String emailPeserta) {
        this.emailPeserta = emailPeserta;
    }

    public List<KuisionerPeserta> getKuisionerPesertaList() {
        return kuisionerPesertaList;
    }

    public void setKuisionerPesertaList(List<KuisionerPeserta> kuisionerPesertaList) {
        this.kuisionerPesertaList = kuisionerPesertaList;
    }
}
