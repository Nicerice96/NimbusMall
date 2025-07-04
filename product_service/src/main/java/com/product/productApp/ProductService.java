package com.product.productApp;
import java.util.List;


public class ProductService {


    private List<Product> products;
    ProductDB productDB = new ProductDB();


    public ProductService(){

    }

    public void addProduct(Product product){
        
        productDB.save(product);
    }

    public Product findProduct(Product product){
        for (Product p : products){
            if (p.getProductTitle().equalsIgnoreCase(product.getProductTitle())){
                return p;
            }
        }
        return null;
    }

    public List<Product> getAllProducts(){
        return this.products;
    }
    
}
