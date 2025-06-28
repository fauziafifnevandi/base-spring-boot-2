package base.controller.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
//@RequestMapping("/api")
public class BaseController {


  @GetMapping("/test")
  public ResponseEntity<String> test(){
    return new ResponseEntity<>("hai", HttpStatus.OK);
  }
}
