package br.com.ecommerce.service;

import br.com.ecommerce.model.Product;
import br.com.ecommerce.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.math.BigDecimal;

/**
 * Created by fabio on 04/04/17.
 */


//@SpringBootApplication

@Controller
@SpringBootApplication(scanBasePackages = "br.com.ecommerce")
@EnableJpaRepositories("br.com.ecommerce.repository")
@EntityScan("br.com.ecommerce.model")
@EnableTransactionManagement
public class SpringBootWebApplication extends SpringBootServletInitializer {

    @Autowired
    private ProdutoRepository repository;

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringBootWebApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootWebApplication.class);
    }

    @PostConstruct
    @Transactional
    public void onLoad(){
        repository.save(new Product("Spring in Action",  new BigDecimal(198.50)));
        repository.save(new Product("Pro AngularJs", new BigDecimal(183.80)));
        repository.save(new Product("Clean Code: A Handbook of Agile Software Craftsmanship", new BigDecimal(78.49)));
        repository.save(new Product("Design Patterns: Elements of Reusable Object-Oriented Software", new BigDecimal(227.26)));
    }
}
