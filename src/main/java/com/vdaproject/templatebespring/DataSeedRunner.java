package com.vdaproject.templatebespring;

import com.vdaproject.templatebespring.model.UserAccess;
import com.vdaproject.templatebespring.repository.UserAccessRepository;
import com.vdaproject.templatebespring.repository.UserRoleRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

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
            var saved1 = userAccessRepository.save(userAccess1);
            var saved2 = userAccessRepository.save(userAccess2);

            System.out.println("userAccess1: "+ userAccess1.getId());
            System.out.println("userAccess2: "+ userAccess2.getId());
            System.out.println("saved1: "+ saved1.getId());
            System.out.println("saved2: "+ saved2.getId());
        }

        logger.info("Finish Seed Data");
    }

}
