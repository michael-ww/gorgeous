package gorgeous.test.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/hello")
public class HelloController {

    @GetMapping(path = { "/" })
    public ResponseEntity<String> Index() {
        return ResponseEntity.ok("Hello World!");
    }
}
