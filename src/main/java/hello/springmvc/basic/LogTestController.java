package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogTestController {

    //@Slf4j 로 대체 가능
//    private final Logger log = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/log-test", method = RequestMethod.GET)
    public String logTest(){
        String name = "Spring";

        log.trace(" trace log = {} ", name);
        log.debug(" debug log = {} ", name);
        log.info(" info log = {} ", name);
        log.warn(" warn log = {} ", name);
        log.error(" error log = {} ", name);

        return "ok";
    }
}
