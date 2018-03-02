package com.spacesale.model;

import javax.persistence.*;

/**
 * Created by bagus on 02/03/18.
 */
@Entity
@Table(name = "kuisioner_peserta")
public class KuisionerPeserta {
    @EmbeddedId
    private KuisionerPesertaId kuisionerPesertaId;

    @Column(name = "tgl_penilaian_milis")
    private Long tglPenilaianMilis;
    @Enumerated(EnumType.STRING)
    @Column(name = "nilai_kuisioner")
    private NilaiKuisionerEnum nilaiKuisionerEnum;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_kuisioner",
            insertable = false,
            updatable = false,
            referencedColumnName = "id_kuisioner"
    )
    private Kuisioner kuisioner;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
            name = "id_peserta",
            insertable = false,
            updatable = false,
            referencedColumnName = "id_peserta"
    )
    private Peserta peserta;

    public KuisionerPesertaId getKuisionerPesertaId() {
        return kuisionerPesertaId;
    }

    public void setKuisionerPesertaId(KuisionerPesertaId kuisionerPesertaId) {
        this.kuisionerPesertaId = kuisionerPesertaId;
    }

    public Long getTglPenilaianMilis() {
        return tglPenilaianMilis;
    }

    public void setTglPenilaianMilis(Long tglPenilaianMilis) {
        this.tglPenilaianMilis = tglPenilaianMilis;
    }

    public NilaiKuisionerEnum getNilaiKuisionerEnum() {
        return nilaiKuisionerEnum;
    }

    public String getNilaiKuisioner() {
        return this.nilaiKuisionerEnum.toString();
    }

    public void setNilaiKuisionerEnum(NilaiKuisionerEnum nilaiKuisionerEnum) {
        this.nilaiKuisionerEnum = nilaiKuisionerEnum;
    }

    public Kuisioner getKuisioner() {
        return kuisioner;
    }

    public void setKuisioner(Kuisioner kuisioner) {
        this.kuisioner = kuisioner;
    }

    public Peserta getPeserta() {
        return peserta;
    }

    public void setPeserta(Peserta peserta) {
        this.peserta = peserta;
    }
}
