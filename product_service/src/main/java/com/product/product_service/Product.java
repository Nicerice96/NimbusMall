package main.java.com.product.product_service;

public class Product {
    private enum ProductType{
        TECHNOLOGY,
        FOOD,
        CLOTHING,
        JEWLERY,
        LITERATURE,
        MUSIC,
        ALTERNATIVE,
    }
  
    private String productTitle;

    private ProductType productType;
    private int productPrice;

    public String getProductTitle() {
        return this.productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public ProductType getProductType() {
        return this.productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public int getProductPrice() {
        return this.productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public Product(){}

    public Product(String productTitle, ProductType productType, int productPrice){
        this.productTitle = productTitle;
        this.productType = productType;
        this.price = price;
    }


    
    
}
