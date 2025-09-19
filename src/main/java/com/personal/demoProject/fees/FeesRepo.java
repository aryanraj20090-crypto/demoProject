package com.personal.demoProject.fees;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FeesRepo extends JpaRepository <FeesEntity, Integer> {
}
