package example.learningportal.dto;

import java.sql.Timestamp;

import example.learningportal.entity.CourseEntity;
import example.learningportal.entity.UserEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class FavoriteDto {
	private long favoriteId;
	private UserEntity learnerId;
    private CourseEntity courseId;
    private Timestamp createdOn;
    private Timestamp updatedOn;
}
