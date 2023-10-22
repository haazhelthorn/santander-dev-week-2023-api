package me.dio.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import me.dio.domain.model.User;
import me.dio.domain.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserServiceTest {

    @InjectMocks
    private UserServiceImpl userService;

    @Mock
    private UserRepository userRepository;

    @Test
    void testCreateUser() {
        User testUser = new User();
        testUser.setName("Test User");

        when(userRepository.save(any(User.class))).thenReturn(testUser);

        User createdUser = userService.create(testUser);

        assertEquals(testUser, createdUser);
    }
}
