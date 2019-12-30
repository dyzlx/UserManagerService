package com.dyz.userservice.domain.repository;

import com.dyz.userservice.domain.entity.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleRepositoryTest {

    @Autowired
    private RoleRepository roleRepository;

    @Test
    public void addRoleTest() {
        Role role = Role.builder().name("ADMIN").build();
        //roleRepository.save(role);
    }
}
