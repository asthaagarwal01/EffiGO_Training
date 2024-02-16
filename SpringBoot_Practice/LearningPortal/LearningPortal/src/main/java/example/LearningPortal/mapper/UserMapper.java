package example.LearningPortal.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import example.LearningPortal.dto.UserDto;
import example.LearningPortal.entity.UserEntity;

@Mapper(componentModel = "spring")
public interface UserMapper {
	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	@Mapping(source = "user.role", target = "role")
	abstract UserDto userToUserDto(UserEntity user);

	UserEntity userDtoToUserEntity(UserDto userDTO);
}
