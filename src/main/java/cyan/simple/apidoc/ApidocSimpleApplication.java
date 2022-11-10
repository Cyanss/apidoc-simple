package cyan.simple.apidoc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(scanBasePackages = {"io.github.nichetoolkit", "cyan.simple.apidoc"})
public class ApidocSimpleApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ApidocSimpleApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ApidocSimpleApplication.class);
    }

}
