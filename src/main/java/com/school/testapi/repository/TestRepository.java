package com.school.testapi.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class TestRepository {

    private List<String> repo;

    public TestRepository() {
        this.repo = new ArrayList<>();
    }

    public void add(String value) {
        repo.add(value);
    }

    public String get(int index) {
        return repo.get(index);
    }

    public void update(int index, String value) {
        repo.set(index, value);
    }

    public void delete(int index) {
        repo.remove(index);
    }

    public List<String> getAll() {
        return repo;
    }
}