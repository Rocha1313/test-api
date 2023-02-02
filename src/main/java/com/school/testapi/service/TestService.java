package com.school.testapi.service;

import com.school.testapi.repository.TestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    private final TestRepository testRepository;

    public TestService(TestRepository testRepository) {
        this.testRepository = testRepository;
    }

    public void add(String value) {
        testRepository.add(value);
    }

    public String get(int index) {
        return testRepository.get(index);
    }

    public void update(int index, String value) {
        testRepository.update(index, value);
    }

    public void delete(int index) {
        testRepository.delete(index);
    }

    public List<String> getAll() {
        return testRepository.getAll();
    }
}
