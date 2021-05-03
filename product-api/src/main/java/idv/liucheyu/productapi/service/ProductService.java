package idv.liucheyu.productapi.service;

import idv.liucheyu.productapi.dto.ProductInfo;

import java.util.List;

/**
 * @author liucheyu
 */
public interface ProductService {
    /**
     * get product list by classification
     * @return
     */
    public List<ProductInfo> getProductListByClass(String classification);

    /**
     * get product by id
     * @return
     */
    public ProductInfo getProductById(long id);


}
