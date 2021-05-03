package idv.liucheyu.productapi.mapper;

import idv.liucheyu.productapi.entity.ProductInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductInfoMapper {
    List<ProductInfo> getProductInfoListByMainClass(String mainClass);



    boolean addProductInfo();
}
