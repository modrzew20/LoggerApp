package com.example.LoggerApp.service;

import com.example.LoggerApp.model.Change;

import java.util.List;
import java.util.UUID;

public interface ChangeService {

    /**
     *
     * @param id id of shape
     * @return
     */
    List<Change> getAll(UUID id);

    Change create(Change newChange);
}
