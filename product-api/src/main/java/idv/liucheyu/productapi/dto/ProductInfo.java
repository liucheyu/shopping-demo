package idv.liucheyu.productapi.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author liucheyu
 * 回覆前端
 */
@Getter
@Setter
@ToString
public class ProductInfo {
    private String productId;
    private String productName;
    private String keyWord;
    private String classification;
    private String tradeName;
    private double price;
    private int unit;
    private int currencyCode;
    private int rank;
}
