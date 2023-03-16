package com.example.LoggerApp.mapper;

import com.example.LoggerApp.document.ChangeDocument;
import com.example.LoggerApp.model.Change;
import org.mapstruct.Mapper;

@Mapper
public interface ChangeMapper {

    Change changeDocumentToChange(ChangeDocument changeDocument);

    ChangeDocument changeToChangeDocument(Change change);

}
