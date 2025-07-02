package main.java.com.product.product_service;


public class ProductService {


    private List<Products> products;
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
    }

    public List<Product> getAllProducts(){
        return this.products;
    }
    
}
