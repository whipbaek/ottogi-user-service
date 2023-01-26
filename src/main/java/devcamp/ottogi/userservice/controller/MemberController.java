package devcamp.ottogi.userservice.controller;

import devcamp.ottogi.userservice.dto.MemberResponseDto;
import devcamp.ottogi.userservice.service.MemberService;
//import devcamp.ottogi.userservice.util.SecurityUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/user/api/member")
public class MemberController {
    private final MemberService memberService;

    @GetMapping("/me")
    public ResponseEntity<MemberResponseDto> findMemberInfoById(HttpServletRequest request) {
        Long id = Long.parseLong(request.getHeader("id"));
        return ResponseEntity.ok(memberService.findMemberInfoById(id));
    }

    @GetMapping("/{email}")
    public ResponseEntity<MemberResponseDto> findMemberInfoByEmail(@PathVariable String email) {
        return ResponseEntity.ok(memberService.findMemberInfoByEmail(email));
    }
}
