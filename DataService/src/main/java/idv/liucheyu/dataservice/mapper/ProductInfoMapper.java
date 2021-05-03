package idv.liucheyu.dataservice.mapper;

import idv.liucheyu.dataservice.entity.ProductInfo;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductInfoMapper {
    List<ProductInfo> getProductInfoListByMainClass(String mainClass);
}
