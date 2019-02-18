package cinepolis.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = {"cinepolis.*"})
@PropertySource({"classpath:application-dev.properties"})
public class AppConfiguration {

}

