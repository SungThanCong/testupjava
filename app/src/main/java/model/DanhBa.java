package model;

import androidx.annotation.NonNull;

public class DanhBa {
    private String name;
    private String sdt;

    public DanhBa() {
    }

    public DanhBa(String name, String sdt) {
        this.name = name;
        this.sdt = sdt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @NonNull
    @Override
    public String toString() {
        return this.name + "\t"+ this.sdt;
    }
}
