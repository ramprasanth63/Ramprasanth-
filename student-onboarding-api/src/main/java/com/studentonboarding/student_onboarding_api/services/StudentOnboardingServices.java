package com.studentonboarding.student_onboarding_api.services;

import com.studentonboarding.student_onboarding_api.entities.StudentOnboardingEntities;
import com.studentonboarding.student_onboarding_api.model.StudentDTO;
import com.studentonboarding.student_onboarding_api.repository.StudentOnboardingRepository;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class StudentOnboardingServices {

    private final StudentOnboardingRepository studentOnboardingRepository;

    public  StudentDTO studentPost(StudentDTO studentDTO) {
        StudentOnboardingEntities studentOnboardingEntities = StudentOnboardingEntities.builder()
                .firstName(studentDTO.getFirstName())
                .degree(studentDTO.getDegree())
                .institution(studentDTO.getInstitution())
                .specialization(studentDTO.getSpecialization())
                .cgpa(studentDTO.getCgpa())
                .year(studentDTO.getYear())
                .location(studentDTO.getLocation())
                .build();

        StudentOnboardingEntities savedEntity = studentOnboardingRepository.save(studentOnboardingEntities);

        StudentDTO savedDTO = new StudentDTO();
        savedDTO.setFirstName(savedEntity.getFirstName());
        savedDTO.setDegree(savedEntity.getDegree());
        savedDTO.setInstitution(savedEntity.getInstitution());
        savedDTO.setSpecialization(savedEntity.getSpecialization());
        savedDTO.setCgpa(savedEntity.getCgpa());
        savedDTO.setYear(savedEntity.getYear());
        savedDTO.setLocation(savedEntity.getLocation());

        return savedDTO;



    }}
