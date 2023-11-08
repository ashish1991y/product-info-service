package io.bank.productinfoservice.resource;

import io.bank.productinfoservice.module.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

@RestController
@RequestMapping("/products")
public class ProductResource {

    List<Product> products= Arrays.asList(new Product("pr1","product 1","product description 1"),
            new Product("pr2","product 2","product description 2"),
            new Product("pr3","product 3","product description 3"),
            new Product("pr4","product 4","product description 4"),
            new Product("pr5","product 5","product description 5"),
            new Product("pr6","product 6","product description 6"));

    @RequestMapping("/{productId}")
    public Product getProductDetails(@PathVariable("productId") String productId)
    {
    Product productValue = products.stream().filter(product -> product.getProductId().equalsIgnoreCase(productId)).findFirst().orElse(new Product(productId,"No Product found","No description"));
    return productValue;
    }

    @RequestMapping("/all")
    public List<Product> getAllProducts()
    {
        return products;
    }
}
