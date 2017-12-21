package com.stu.entity;

import javax.persistence.*;

/**
 * Created by xiu on 2017/12/20.
 */
@Entity
@Table(name = "t_stu")
public class Stu {
    private int sno;  //编号
    private String sname;  //姓名
    private int sage;  //年龄
    private String ssex;  //性别
    private String shobby;  //爱好

    public Stu() {
    }

    public Stu(int sno, String sname, int sage, String ssex, String shobby) {
        this.sno = sno;
        this.sname = sname;
        this.sage = sage;
        this.ssex = ssex;
        this.shobby = shobby;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public String getShobby() {
        return shobby;
    }

    public void setShobby(String shobby) {
        this.shobby = shobby;
    }
}
