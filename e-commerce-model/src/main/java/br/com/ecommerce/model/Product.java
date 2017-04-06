package br.com.ecommerce.model;

import org.springframework.beans.factory.annotation.Required;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by fabio on 04/04/17.
 */
@Entity
public class Product implements Serializable {

    private @Id @GeneratedValue Long id;
    private String name;
    private BigDecimal unitaryPrice;

    public Product() {
    }

    public Product(String name, BigDecimal unitaryPrice) {
        this.name = name;
        this.unitaryPrice = unitaryPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(BigDecimal unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }
}
