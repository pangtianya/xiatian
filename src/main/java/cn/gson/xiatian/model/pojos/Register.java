package cn.gson.xiatian.model.pojos;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
public class Register {
    private Integer reId;
    private String reName;
    private String reSex;
    private Integer reAge;
    private String reMake;
    private String reDanwei;
    private String rePhone;
    private String reZhuzhi;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    private Timestamp reData;
    private String reZhenduan;
    private String reNumber;
    private String rePeople;
    private String guanxiId;
    private String reTianbiao;
    private String re;
    private String reJinguo;


    @Id
    @Column(name = "re_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getReId() {
        return reId;
    }

    public void setReId(Integer reId) {
        this.reId = reId;
    }

    @Basic
    @Column(name = "re_name")
    public String getReName() {
        return reName;
    }

    public void setReName(String reName) {
        this.reName = reName;
    }

    @Basic
    @Column(name = "re_sex")
    public String getReSex() {
        return reSex;
    }

    public void setReSex(String reSex) {
        this.reSex = reSex;
    }

    @Basic
    @Column(name = "re_age")
    public Integer getReAge() {
        return reAge;
    }

    public void setReAge(Integer reAge) {
        this.reAge = reAge;
    }

    @Basic
    @Column(name = "re_make")
    public String getReMake() {
        return reMake;
    }

    public void setReMake(String reMake) {
        this.reMake = reMake;
    }

    @Basic
    @Column(name = "re_danwei")
    public String getReDanwei() {
        return reDanwei;
    }

    public void setReDanwei(String reDanwei) {
        this.reDanwei = reDanwei;
    }

    @Basic
    @Column(name = "re_phone")
    public String getRePhone() {
        return rePhone;
    }

    public void setRePhone(String rePhone) {
        this.rePhone = rePhone;
    }

    @Basic
    @Column(name = "re_zhuzhi")
    public String getReZhuzhi() {
        return reZhuzhi;
    }

    public void setReZhuzhi(String reZhuzhi) {
        this.reZhuzhi = reZhuzhi;
    }

    @Basic
    @Column(name = "re_data")
    public Timestamp getReData() {
        return reData;
    }

    public void setReData(Timestamp reData) {
        this.reData = reData;
    }

    @Basic
    @Column(name = "re_zhenduan")
    public String getReZhenduan() {
        return reZhenduan;
    }

    public void setReZhenduan(String reZhenduan) {
        this.reZhenduan = reZhenduan;
    }

    @Basic
    @Column(name = "re_number")
    public String getReNumber() {
        return reNumber;
    }

    public void setReNumber(String reNumber) {
        this.reNumber = reNumber;
    }

    @Basic
    @Column(name = "re_people")
    public String getRePeople() {
        return rePeople;
    }

    public void setRePeople(String rePeople) {
        this.rePeople = rePeople;
    }

    @Basic
    @Column(name = "guanxi_id")
    public String getGuanxiId() {
        return guanxiId;
    }

    public void setGuanxiId(String guanxiId) {
        this.guanxiId = guanxiId;
    }

    @Basic
    @Column(name = "re_tianbiao")
    public String getReTianbiao() {
        return reTianbiao;
    }

    public void setReTianbiao(String reTianbiao) {
        this.reTianbiao = reTianbiao;
    }

    @Basic
    @Column(name = "re")
    public String getRe() {
        return re;
    }

    public void setRe(String re) {
        this.re = re;
    }

    @Basic
    @Column(name = "re_jinguo")
    public String getReJinguo() {
        return reJinguo;
    }

    public void setReJinguo(String reJinguo) {
        this.reJinguo = reJinguo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Register register = (Register) o;
        return Objects.equals(reId, register.reId) && Objects.equals(reName, register.reName) && Objects.equals(reSex, register.reSex) && Objects.equals(reAge, register.reAge) && Objects.equals(reMake, register.reMake) && Objects.equals(reDanwei, register.reDanwei) && Objects.equals(rePhone, register.rePhone) && Objects.equals(reZhuzhi, register.reZhuzhi) && Objects.equals(reData, register.reData) && Objects.equals(reZhenduan, register.reZhenduan) && Objects.equals(reNumber, register.reNumber) && Objects.equals(rePeople, register.rePeople) && Objects.equals(guanxiId, register.guanxiId) && Objects.equals(reTianbiao, register.reTianbiao) && Objects.equals(re, register.re) && Objects.equals(reJinguo, register.reJinguo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(reId, reName, reSex, reAge, reMake, reDanwei, rePhone, reZhuzhi, reData, reZhenduan, reNumber, rePeople, guanxiId, reTianbiao, re, reJinguo);
    }

    @Override
    public String toString() {
        return "Register{" +
                "reId=" + reId +
                ", reName='" + reName + '\'' +
                ", reSex='" + reSex + '\'' +
                ", reAge=" + reAge +
                ", reMake='" + reMake + '\'' +
                ", reDanwei='" + reDanwei + '\'' +
                ", rePhone='" + rePhone + '\'' +
                ", reZhuzhi='" + reZhuzhi + '\'' +
                ", reData=" + reData +
                ", reZhenduan='" + reZhenduan + '\'' +
                ", reNumber='" + reNumber + '\'' +
                ", rePeople='" + rePeople + '\'' +
                ", guanxiId=" + guanxiId +
                ", reTianbiao='" + reTianbiao + '\'' +
                ", re='" + re + '\'' +
                ", reJinguo='" + reJinguo + '\'' +
                '}';
    }
}
