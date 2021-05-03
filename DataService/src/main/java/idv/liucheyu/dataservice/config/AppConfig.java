package idv.liucheyu.dataservice.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"idv.liucheyu.dataservice.controller",
        "idv.liucheyu.dataservice.mapper",
        "idv.liucheyu.commonservice"})
public class AppConfig {
}
