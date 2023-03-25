package com.example.LoggerApp.mapper;

import com.example.LoggerApp.dto.ChangeDto;
import com.example.LoggerApp.model.Change;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ChangeDtoMapper {

    Change changeDtoToChange(ChangeDto dto);

    ChangeDto changeToChangeDto(Change change);
}
