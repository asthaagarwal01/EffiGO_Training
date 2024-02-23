package example.learningportal.dto;

import java.sql.Timestamp;

import example.learningportal.entity.UserRole;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {	
private Long userId;
private String username;
private String password;
private UserRole role;
private Timestamp createdOn;
private Timestamp updatedOn;
}
