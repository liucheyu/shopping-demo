package idv.liucheyu.dataservice.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;

@Configuration
@MapperScan(basePackages = "idv.liucheyu.dataservice.mapper",
        annotationClass = Repository.class)
public class MyBatisConfig {
}
