package com.example.LoggerApp.repository;

import com.example.LoggerApp.document.ChangeDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface ChangeRepository extends MongoRepository<ChangeDocument, UUID> {
}
