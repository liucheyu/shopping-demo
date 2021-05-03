package idv.liucheyu.productapi.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Configuration
@MapperScan(basePackages = "idv.liucheyu.productapi.mapper",
        annotationClass = Repository.class)
public class MyBatisConfig {
}
