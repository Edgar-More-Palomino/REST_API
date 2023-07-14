package com.example.crudV2.Product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long > {
    //creacion de metodo


    Optional<Product> findProductByNombre(String nombre);
}
