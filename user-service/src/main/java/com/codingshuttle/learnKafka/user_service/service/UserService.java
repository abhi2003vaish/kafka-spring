package com.codingshuttle.learnKafka.user_service.service;

import com.codingshuttle.learnKafka.user_service.dto.CreateUserRequestDto;
import com.codingshuttle.learnKafka.user_service.entity.User;
import com.codingshuttle.learnKafka.user_service.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;
    private final ModelMapper modelMapper;

    public void createUser(CreateUserRequestDto createUserRequestDto) {

        User user = modelMapper.map(createUserRequestDto, User.class);
        userRepository.save(user);


    }

}
