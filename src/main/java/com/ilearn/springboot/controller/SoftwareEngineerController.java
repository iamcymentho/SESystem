package com.ilearn.springboot.controller;

import com.ilearn.springboot.Dto.SoftwareEngineerDto;
import com.ilearn.springboot.Dto.SoftwareEngineerRequestDto;
import com.ilearn.springboot.model.SoftwareEngineer;
import com.ilearn.springboot.service.SoftwareEngineerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/software-engineers")
public class SoftwareEngineerController {

    private final SoftwareEngineerService softwareEngineerService;

    public SoftwareEngineerController(SoftwareEngineerService softwareEngineerService) {
        this.softwareEngineerService = softwareEngineerService;
    }

    @GetMapping("get-engineers")
    public List<SoftwareEngineer> getEngineers()
    {
        return List.of(
                new SoftwareEngineer(
                        1,
                        "Matthew Cymentho",
                        List.of("Js, taiwind, react")
                ),
                new SoftwareEngineer(
                        2,
                        "Michael Blaque",
                        List.of("Java, Spring, Springboot")
                )
        );
    }

    @GetMapping("/get-all")
    public List<SoftwareEngineer> getall()
    {
        return softwareEngineerService.getAllSoftwareEngineers();
    }

    @PostMapping("/create")
    public SoftwareEngineerDto createEngineers
            (@RequestBody SoftwareEngineerRequestDto softwareEngineerRequestDto)
    {
        return softwareEngineerService.CreateEngineer
                (softwareEngineerRequestDto);
    }

    @GetMapping("get-by-id/{id}")
    public SoftwareEngineer getById(@PathVariable Integer id)
    {
        return softwareEngineerService.getById(id);
    }
}
