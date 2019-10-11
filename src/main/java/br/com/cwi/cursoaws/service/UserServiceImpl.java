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
                User.builder().id(1L).name("Enrique Thompson").age(23).build(),
                User.builder().id(2L).name("Eric Duncan").age(26).build(),
                User.builder().id(3L).name("Tanya Sutton").age(24).build(),
                User.builder().id(4L).name("Isabel Fisher").age(21).build(),
                User.builder().id(5L).name("Brandon Jones").age(25).build()
        );
    }
}
