package ddareunging.ddareunging_server.controller;

import ddareunging.ddareunging_server.service.MyPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component("MyPageBean") // web.controller 내에도 MyPageController가 있어서 빈 문제 발생. 이를 해결하기 위함
@RequiredArgsConstructor
@RequestMapping("/mypage")
public class MyPageController {

    private final MyPageService myPageService;

    @GetMapping("/notice")
    public ResponseEntity<?> getNotice() {
        try {
            return ResponseEntity.ok(myPageService.getNotice());
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("공지사항 조회 중 오류가 발생했습니다: " + e.getMessage());
        }
    }
}
