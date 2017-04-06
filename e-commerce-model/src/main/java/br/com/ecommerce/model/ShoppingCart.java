package br.com.ecommerce.model;

import org.springframework.stereotype.Component;

import javax.persistence.Transient;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

/**
 * Entidade carrinho de compras da nossa loja virtual.
 *
 *
 * Created by fabio on 04/04/17.
 */
@Component
public class ShoppingCart {

    private List<Item> items = new ArrayList<>();

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    @Transient
    public Double getAmount() {
        Double amount = new Double(0);
        for (Item item : items) {
            amount += item.getQuantity() * item.getProduct().getUnitaryPrice();
        }

        return new BigDecimal(amount).setScale(4, RoundingMode.HALF_EVEN).doubleValue();
    }

    public void addItem(Item item) {
        this.getItems().add(item);
    }

    public void clearCart() {
        this.getItems().clear();
    }    
}
