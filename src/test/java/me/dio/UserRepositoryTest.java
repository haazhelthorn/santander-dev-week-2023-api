package me.dio.domain.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserRepositoryTest {

    @InjectMocks
    private UserRepository userRepository;

    @Test
    void testExistsByAccountNumber() {
        // Configure o mock do repositório para retornar verdadeiro quando o método existsByAccountNumber() for chamado com um número de conta específico
        when(userRepository.existsByAccountNumber("123456")).thenReturn(true);

        // Chame o método existsByAccountNumber() do repositório
        boolean exists = userRepository.existsByAccountNumber("123456");

        // Verifique se o resultado é verdadeiro
        assertTrue(exists);
    }
}
