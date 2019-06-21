package com.muditasoft.issuetrackerapp.dto;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class ProjectDto {
    private Long id;

    @NotNull
    private String projectName;

    @NotNull
    private String projectCode;
    private UserDto userDto;
}
