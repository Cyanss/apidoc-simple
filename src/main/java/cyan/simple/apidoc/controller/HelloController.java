package cyan.simple.apidoc.controller;

import io.github.nichetoolkit.rest.RestException;
import io.github.nichetoolkit.rest.RestResult;
import io.github.nichetoolkit.rice.stereotype.RestSkip;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>HelloController</p>
 * @author Cyan (snow22314@outlook.com)
 * @version v1.0.0
 */
@Slf4j
@RestSkip
@CrossOrigin
@RestController
@RequestMapping("/simple/api/v0.1.0")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<RestResult> sayHello() throws RestException {
        return RestResult.ok("Hello, Welcome to the apidoc simple server !");
    }

}
