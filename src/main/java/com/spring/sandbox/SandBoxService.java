package com.spring.sandbox;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class SandBoxService {

    @Autowired
    private Repo repo;

    public SandBoxResponse getUser(Long userId) {
        Optional<Model> model = repo.findByUserId(userId);

        return new SandBoxResponse(model.get());
    }

    public SandBoxResponse addUser(SandBoxRequest sandBoxRequest) {
        Model model = new Model();

        model.setDescription(sandBoxRequest.description);
        model.setFirstName(sandBoxRequest.firstName);
        model.setLastName(sandBoxRequest.lastName);
        repo.save(model);

        return new SandBoxResponse(model);
    }

    public SandBoxResponse updateUser(Long userId, Request request) {
        Optional<Model> model = repo.findByUserId(userId);
        Model modelRecord = model.get();

        modelRecord.setLastName(request.lastName);
        modelRecord.setFirstName(request.firstName);
        modelRecord.setDescription(request.description);
        repo.save(model.get());

        return new SandBoxResponse(model.get());
    }

    public Integer deleteUser(Long userId) {
        Optional<Model> model = repo.findByUserId(userId);
        repo.delete(model.get());
        return HttpStatus.OK.value();
    }
}
