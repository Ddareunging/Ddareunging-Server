package ddareunging.ddareunging_server.dto;

import ddareunging.ddareunging_server.domain.enums.CourseTheme;

public record CourseDTO(Long courseId, String courseName, String courseImage, Integer courseLike, CourseTheme theme, String userNickname) {
}