package cyan.simple.apidoc.configure;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * <p>ApidocSimpleAutoConfigure</p>
 * @author Cyan (snow22314@outlook.com)
 * @version v1.0.0
 */
@Slf4j
@Configuration
@MapperScan(basePackages = {"cyan.simple.apidoc.mapper"})
@ComponentScan(basePackages = {"cyan.simple.apidoc"})
@ImportAutoConfiguration(value = {DatasourceAutoConfigure.class})
public class ApidocSimpleAutoConfigure {
    public ApidocSimpleAutoConfigure() {
        log.debug("================= apidoc-server-auto-configure initiated ！ ===================");
    }
}
