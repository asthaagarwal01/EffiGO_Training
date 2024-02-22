//package example.LearningPortal.mapper;
//
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.factory.Mappers;
//
//import example.LearningPortal.dto.UserDto;
//import example.LearningPortal.entity.UserEntity;
//
//@Mapper(componentModel = "spring")
//public interface UserMapper {
//	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
//
//	@Mapping(source = "user.role", target = "role")
//	UserDto userToUserDto(UserEntity user);
//
//	UserEntity userDtoToUserEntity(UserDto userDTO);
//}
package example.learningportal.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import example.learningportal.dto.UserDto;
import example.learningportal.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDto, UserEntity> {
	UserDto toDto(UserEntity e);

	UserEntity toEntity(UserDto d);

	List<UserDto> toDto(List<UserEntity> elist);

	List<UserEntity> toEntity(List<UserDto> dlist);
}
