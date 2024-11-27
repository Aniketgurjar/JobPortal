package org.example.jobportal.service;

import org.example.jobportal.entity.RecruiterProfile;
import org.example.jobportal.repositories.RecruiterProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


    @Service
    public class RecruiterProfileService {

        private final RecruiterProfileRepository recruiterRepository;

        @Autowired
        public RecruiterProfileService(RecruiterProfileRepository recruiterProfileRepository) {
            this.recruiterRepository = recruiterProfileRepository;
        }

        public Optional<RecruiterProfile> getOne(Integer id) {
            return recruiterRepository.findById(id);
        }

        public RecruiterProfile addNew(RecruiterProfile recruiterProfile) {
            return recruiterRepository.save(recruiterProfile);
        }
    }
