package com.thagul.testcbr4j.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;

@FeignClient(name = "test-service", fallbackFactory = TestClientFallback.class)
public interface TestClient {
    @RequestMapping(method = RequestMethod.GET, value = "/find")
    Map<String, Object> find(@RequestParam Integer id);
}
