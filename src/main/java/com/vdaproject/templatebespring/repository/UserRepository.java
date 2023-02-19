package com.vdaproject.templatebespring.repository;

import com.vdaproject.templatebespring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findFirstByUsernameOrderByRegistrationDateDesc(String username);
}


// EXAMPLE - join fetch
// https://stackoverflow.com/questions/15359306/how-to-fetch-fetchtype-lazy-associations-with-jpa-and-hibernate-in-a-spring-cont
//
//public interface PersonRepository extends JpaRepository<Person, Long> {
//
//    @Query("SELECT p FROM Person p JOIN FETCH p.roles WHERE p.id = (:id)")
//    public Person findByIdAndFetchRolesEagerly(@Param("id") Long id);
//
//}