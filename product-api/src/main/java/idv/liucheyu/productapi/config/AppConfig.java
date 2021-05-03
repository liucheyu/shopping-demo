package idv.liucheyu.productapi.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"idv.liucheyu.productapi.controller",
        "idv.liucheyu.productapi.mapper",
        "idv.liucheyu.commonservice"})
public class AppConfig {
}
