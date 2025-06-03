package com.ilearn.springboot.mapper;

import com.ilearn.springboot.Dto.SoftwareEngineerDto;
import com.ilearn.springboot.Dto.SoftwareEngineerRequestDto;
import com.ilearn.springboot.model.SoftwareEngineer;

public class softwareEngineeringMapper {

    public static SoftwareEngineerDto toDto(SoftwareEngineer softwareEngineer)
    {
        SoftwareEngineerDto softwareEngineerDto = new SoftwareEngineerDto();
        softwareEngineerDto.setName(softwareEngineer.getName());
        softwareEngineerDto.setTechStacks(softwareEngineer.getTechStacks());

        return softwareEngineerDto;
    }

    public static SoftwareEngineer toModel(SoftwareEngineerRequestDto softwareEngineerRequestDto)
    {
        SoftwareEngineer softwareEngineer = new SoftwareEngineer();
        softwareEngineer.setName(softwareEngineerRequestDto.getName());
        softwareEngineer.setTechStacks(softwareEngineerRequestDto.getTechStacks());
        return softwareEngineer;
    }
}
