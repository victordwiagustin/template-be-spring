package com.vdaproject.templatebespring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.vdaproject.templatebespring.model.UserAccess;

@Repository
public interface UserAccessRepository extends JpaRepository<UserAccess, Integer> {
}
