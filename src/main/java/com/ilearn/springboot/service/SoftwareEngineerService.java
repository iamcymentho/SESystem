package com.ilearn.springboot.service;

import com.ilearn.springboot.Dto.SoftwareEngineerDto;
import com.ilearn.springboot.Dto.SoftwareEngineerRequestDto;
import com.ilearn.springboot.Repository.SoftwareEngineerRepository;
import com.ilearn.springboot.mapper.softwareEngineeringMapper;
import com.ilearn.springboot.model.SoftwareEngineer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;


    public SoftwareEngineerService(SoftwareEngineerRepository softwareEngineerRepository) {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers()
    {
        return softwareEngineerRepository.findAll();
    }

    public SoftwareEngineerDto CreateEngineer(SoftwareEngineerRequestDto requestDto)
    {

        SoftwareEngineer newsoftwareEngineer = softwareEngineerRepository
                .save(softwareEngineeringMapper
                        .toModel(requestDto));

        return softwareEngineeringMapper.toDto(newsoftwareEngineer);
    }


        public SoftwareEngineer getById(Integer id)
        {
            return softwareEngineerRepository.findById(id)
                    .orElseThrow(() -> new IllegalStateException(id + "not found"));
        }
}
