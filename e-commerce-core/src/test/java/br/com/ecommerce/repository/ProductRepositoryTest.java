package br.com.ecommerce.repository;

import br.com.ecommerce.model.Product;
import br.com.ecommerce.service.SpringBootWebApplication;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by fabio on 04/04/17.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SpringBootWebApplication.class)
public class ProductRepositoryTest {

    private Product springBook, angularBook;

    @Autowired
    ProdutoRepository repository;

    @Before
    public void setUp() throws Exception {
        this.repository.deleteAll();

        this.springBook = repository.save(new Product("Spring Book", new BigDecimal(198.50)));
        this.angularBook = repository.save(new Product("Angular Book", new BigDecimal(40.00)));
    }

    @Test
    public void findAll() throws Exception {
        List<Product> products = (List<Product>) repository.findAll();

        assertEquals("Número de registros retornados diferente do esperado", products.size(), 2);
    }

    @Test
    public void findByNameContaining() throws Exception {
        Product product = repository.findByNameContaining("Spri");

        assertNotNull("Deveria ter retornado o product", product);
    }

}