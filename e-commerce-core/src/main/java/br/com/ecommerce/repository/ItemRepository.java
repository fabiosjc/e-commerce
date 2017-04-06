package br.com.ecommerce.repository;

import br.com.ecommerce.model.Item;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by fabio on 06/04/17.
 */
interface ItemRepository extends CrudRepository<Item, Long> {


}
