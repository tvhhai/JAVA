package com.example.demo.dataseed;

import com.example.demo.entity.Role;
import com.example.demo.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class RoleSeed  implements CommandLineRunner {

    @Autowired
    RoleRepository roleRepository;


    @Override
    public void run(String... args) throws Exception {
        loadUserData();
    }

    private void loadUserData() {
        if (roleRepository.count() == 0) {
            Role user1 = new Role("ROLE_USER");
            Role user2 = new Role("ROLE_ADMIN");
            Role user3 = new Role("ROLE_MODERATOR");

            roleRepository.save(user1);
            roleRepository.save(user2);
            roleRepository.save(user3);
        }
    }
}
