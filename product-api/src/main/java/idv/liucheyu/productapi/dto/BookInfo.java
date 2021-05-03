package idv.liucheyu.productapi.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class BookInfo extends ProductInfo {
    private String author;
    private String publisher;
    private Date firstEditionDateTime;
}
