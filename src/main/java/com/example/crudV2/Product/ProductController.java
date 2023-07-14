package com.example.crudV2.Product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }
    @GetMapping
    public List<Product>mostrarProductos(){

        return this.productService.mostrarProductos();
    }
    @PostMapping
    public ResponseEntity<Object> registrarProducto(@RequestBody Product product){
        return this.productService.newProduct(product);
    }

    @PutMapping
    public ResponseEntity<Object> actualizarProducto(@RequestBody Product product){
        return this.productService.newProduct(product);
    }
    @DeleteMapping(path = "{id}")
    public ResponseEntity<Object> eliminarProducto(@PathVariable("id") Long id){
        return this.productService.eliminarProducto(id);
    }


}
