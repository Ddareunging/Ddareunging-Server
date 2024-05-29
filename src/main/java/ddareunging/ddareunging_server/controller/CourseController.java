package ddareunging.ddareunging_server.controller;

import ddareunging.ddareunging_server.dto.FindCoursesResponseDTO;
import ddareunging.ddareunging_server.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/course")
public class CourseController {

    private final CourseService courseService;

    @GetMapping("")
    public ResponseEntity<FindCoursesResponseDTO> getCoursesByTheme(@RequestParam("theme-number") Integer theme) {
        return ResponseEntity.ok(courseService.getCoursesByTheme(theme));
    }
}