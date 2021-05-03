package idv.liucheyu.dataservice.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

@Data
public class ProductInfo {
    private String productID;
    private String productName;
    private String currencyCode;
    private String mainClass;
    private String lastClass;
    private String tradeName;
    private String sizeUnit;
    private String weightUnit;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date productCreateTime;
}