package com.pagination.resource;

import java.time.LocalDateTime;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pagination.Dao.HttpResponse;
import com.pagination.service.UserService;

@RestController
@RequestMapping("/")
public class UserController {

    @Autowired
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    
    @GetMapping("/users")

    public ResponseEntity<HttpResponse> getUsers(@RequestParam Optional<String> name,
            @RequestParam Optional<Integer> page,
            @RequestParam Optional<Integer> size) {

        HttpResponse response = new HttpResponse.Builder()
                .timeStamp(LocalDateTime.now().toString())
                .statusCode(HttpStatus.OK.value())
                .status(HttpStatus.OK)
                .message("Users Retrieved")
                .data(Map.of("page", userService.getUsers(name.orElse(""), page.orElse(0), size.orElse(10))))
                .build();

        return ResponseEntity.ok().body(response);
    }
}
