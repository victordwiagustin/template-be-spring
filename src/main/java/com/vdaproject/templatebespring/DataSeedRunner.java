package com.vdaproject.templatebespring;

import com.vdaproject.templatebespring.model.UserAccess;
import com.vdaproject.templatebespring.model.UserRole;
import com.vdaproject.templatebespring.repository.UserAccessRepository;
import com.vdaproject.templatebespring.repository.UserRoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;

@Component
public class DataSeedRunner implements CommandLineRunner {
    private final Logger logger = LoggerFactory.getLogger(DataSeedRunner.class);
    @Autowired
    private UserRoleRepository userRoleRepository;
    @Autowired
    private UserAccessRepository userAccessRepository;

    @Override
    public void run(String... args) throws Exception {
        // TODO: it can be used not only for date seeding, (e.g. build OR copy web-app built project)
        seedData();
    }

    private void seedData() {
        logger.info("Seed Initial Data");

        long accessCount = userAccessRepository.count();
        if (accessCount == 0) {
            var userAccess1 = new UserAccess("UserManagement");
            var userAccess2 = new UserAccess("Transaction");
            var userRole1 = new UserRole("Admin", Arrays.asList(userAccess1, userAccess2));

            var savedUserAccess1 = userAccessRepository.save(userAccess1);
            var savedUserAccess2 = userAccessRepository.save(userAccess2);
            var savedUserRole1 = userRoleRepository.save(userRole1);

            System.out.println("savedUserAccess1: "+ savedUserAccess1.getId());
            System.out.println("savedUserAccess2: "+ savedUserAccess2.getId());
            System.out.println("savedUserRole1: "+ savedUserRole1.getId());
        }

        logger.info("Finish Seed Data");
    }

}
