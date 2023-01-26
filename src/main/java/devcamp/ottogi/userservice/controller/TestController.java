package devcamp.ottogi.userservice.controller;

import devcamp.ottogi.userservice.entity.RefreshToken;
import devcamp.ottogi.userservice.repository.RefreshTokenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
@RequiredArgsConstructor
public class TestController {

    private final RefreshTokenRepository refreshTokenRepository;

    @GetMapping("/hello")
    public String test(){
        return "hello user service!";
    }

    @GetMapping("/redisHello")
    public String redisTest(){
        refreshTokenRepository.save(new RefreshToken("testKey", "PW"));
        return "저장완료!";
    }
}
