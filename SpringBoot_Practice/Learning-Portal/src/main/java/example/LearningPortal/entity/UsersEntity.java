package example.LearningPortal.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Data
@AllArgsConstructor
public class UsersEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;
    private String password;
    
    @Enumerated(EnumType.STRING)
    private userRole role;

    @OneToMany(mappedBy = "author")
    private List<CourseEntity> authoredCourses;

    @OneToMany(mappedBy = "learner")
    private List<EnrollmentEntity> enrollments;

    @OneToMany(mappedBy = "learner")
    private List<FavouriteEntity> favorites;
}

