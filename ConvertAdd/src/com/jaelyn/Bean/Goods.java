package com.jaelyn.Bean;

import java.util.Date;

/**
 * Created by Jaelyn on 07/10/2016.
 */
public class Goods {
    private String product;
    private Double bid;
    private Integer mount;
    private Date date;

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getBid() {
        return bid;
    }

    public void setBid(Double bid) {
        this.bid = bid;
    }

    public Integer getMount() {
        return mount;
    }

    public void setMount(Integer mount) {
        this.mount = mount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
