package ddareunging.ddareunging_server.dto;

import ddareunging.ddareunging_server.domain.Course;
import ddareunging.ddareunging_server.domain.User;
import lombok.Builder;

import java.util.List;

@Builder
public record FindAnotherUserCoursesReponseDTO(User user, List<Course> courses, String message) {
}
// 조회하는 사용자의 프로필과 해당 사용자가 제작한 코스를 불러옴