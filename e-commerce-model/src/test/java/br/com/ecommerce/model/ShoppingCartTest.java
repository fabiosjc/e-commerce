package br.com.ecommerce.model;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

/**
 * Teste unitário do carrinho de compras
 *
 */
public class ShoppingCartTest {

    private Product springBook, angularBook;
    private ShoppingCart cart;

    @Before
    public void setUp() throws Exception {
        springBook = new Product("Spring Book", 198.50);
        angularBook = new Product("Angular Book", 40.00);
        cart = new ShoppingCart();
    }

    /**
     * Teste para garantir que o valor do carrinho seja 0 quanto ele estiver vazio
     */
    @Test
    public void checkAmountZeroWhenCartIsEmpty() throws Exception {
        assertThat(cart.getItems()).isEmpty();
        assertThat(cart.getAmount()).isEqualTo(0.0).withFailMessage("Valor total diferente do esperado");
    }

    /**
     * Teste para garantir que o calculo do valor total está correto.
     */
    @Test
    public void checkAmount() throws Exception {
        cart.addItem(new Item(springBook, 1));
        cart.addItem(new Item(angularBook, 1));

        assertThat(cart.getAmount()).isEqualTo(238.50).withFailMessage("Valor total diferente do esperado");
    }


}