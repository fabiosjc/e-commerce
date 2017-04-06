package br.com.ecommerce.repository;

import br.com.ecommerce.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


/**
 * Created by fabio on 04/04/17.
 */
@Repository
public interface ProdutoRepository extends CrudRepository<Product, Long> {

    Product findByNameContaining(final String nome);
}
