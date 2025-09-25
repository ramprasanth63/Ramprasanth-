package com.studentonboarding.student_onboarding_api.repository;

import com.studentonboarding.student_onboarding_api.entities.StudentOnboardingEntities;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentOnboardingRepository extends MongoRepository<StudentOnboardingEntities, String> {
}
