package com.example.LoggerApp.service.impl;

import com.example.LoggerApp.document.ChangeDocument;
import com.example.LoggerApp.mapper.ChangeMapper;
import com.example.LoggerApp.model.Change;
import com.example.LoggerApp.repository.ChangeRepository;
import com.example.LoggerApp.service.ChangeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ChangeServiceImpl implements ChangeService {

    private final ChangeRepository changeRepository;
    private final ChangeMapper changeMapper;

    @Override
    public List<Change> getAll(UUID id) {
        return changeRepository.findAll()
                .stream().map(changeMapper::changeDocumentToChange).toList();
    }

    @Override
    public Change create(Change newChange) {
        ChangeDocument document = changeMapper.changeToChangeDocument(newChange);
        return changeMapper.changeDocumentToChange(changeRepository.save(document));
    }
}
