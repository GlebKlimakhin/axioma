package com.axioma.axiomatrainee.mapper;

import com.axioma.axiomatrainee.model.User;
import com.axioma.axiomatrainee.model.dto.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.axioma.axiomatrainee.configuration.BeanConfiguration;

@Component
public class UserMapper implements Mapper<User, UserDto> {
    private ModelMapper modelMapper;

    @Autowired
    public void setModelMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    @Override
    public User toEntity(UserDto dto) {
        return modelMapper.map(dto, User.class);
    }

    @Override
    public UserDto toDto(User entity) {
        return modelMapper.map(entity, UserDto.class);
    }


}
