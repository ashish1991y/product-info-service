package io.bank.productinfoservice.resource;

import io.bank.productinfoservice.module.Product;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @RequestMapping("/{productId}")
    public Product getProductDetails(@PathVariable("productId") String productId)
    {
    return new Product(productId, "credit card");
    }
}
