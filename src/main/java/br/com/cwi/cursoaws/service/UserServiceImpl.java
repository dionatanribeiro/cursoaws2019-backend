package br.com.cwi.cursoaws.service;

import br.com.cwi.cursoaws.model.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public List<User> findAll() {
        return Arrays.asList(
                User.builder().name("Enrique Thompson").age(23).build(),
                User.builder().name("Eric Duncan").age(26).build(),
                User.builder().name("Tanya Sutton").age(24).build(),
                User.builder().name("Isabel Fisher").age(21).build(),
                User.builder().name("Brandon Jones").age(25).build()
        );
    }
}
