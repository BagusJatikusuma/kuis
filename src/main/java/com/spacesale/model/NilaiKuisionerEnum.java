package com.spacesale.model;

/**
 * Created by bagus on 02/03/18.
 */
public enum NilaiKuisionerEnum {
    SATU(1), DUA(2), TIGA(3), EMPAT(4);

    private final int value;

    NilaiKuisionerEnum(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}