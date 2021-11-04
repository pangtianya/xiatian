package cn.gson.xiatian.model.pojos;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Guanxi {
    private Integer guanxiId;
    private String guanxiName;

    @Id
    @Column(name = "guanxi_id")
    public Integer getGuanxiId() {
        return guanxiId;
    }

    public void setGuanxiId(Integer guanxiId) {
        this.guanxiId = guanxiId;
    }

    @Basic
    @Column(name = "guanxi_name")
    public String getGuanxiName() {
        return guanxiName;
    }

    public void setGuanxiName(String guanxiName) {
        this.guanxiName = guanxiName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Guanxi guanxi = (Guanxi) o;
        return Objects.equals(guanxiId, guanxi.guanxiId) && Objects.equals(guanxiName, guanxi.guanxiName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(guanxiId, guanxiName);
    }
}
