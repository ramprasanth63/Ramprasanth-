package com.studentonboarding.student_onboarding_api.controller;

import com.studentonboarding.student_onboarding_api.api.ApiApi;
import com.studentonboarding.student_onboarding_api.model.StudentDTO;
import com.studentonboarding.student_onboarding_api.services.StudentOnboardingServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/studentonboarding")
public class StudentOnboardingController  implements ApiApi {
    private final StudentOnboardingServices studentOnboardingServices;

    @Override
    public ResponseEntity<StudentDTO> apiStudentsEducationDetailsPost(StudentDTO body) {
        return  ResponseEntity.ok(studentOnboardingServices.studentPost(body));
    }


}


