package br.com.ecommerce.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Produto utilizado pelo carrinho de compras
 *
 * Created by fabio on 04/04/17.
 */
@Entity
public class Product implements Serializable {

    private Long id;
    private String name;
    private String description;
    private Double unitaryPrice;

    public Product() {
    }

    public Product(String name, Double unitaryPrice) {
        this.name = name;
        this.unitaryPrice = unitaryPrice;
    }

    @Id
    @GeneratedValue
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getUnitaryPrice() {
        return unitaryPrice;
    }

    public void setUnitaryPrice(Double unitaryPrice) {
        this.unitaryPrice = unitaryPrice;
    }


}
