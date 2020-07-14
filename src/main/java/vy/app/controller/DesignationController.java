package vy.app.controller;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vy.app.model.Designation;
import vy.app.pojo.DesignationDto;
import vy.app.service.DesignationService;
import vy.app.validation.Validation;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class DesignationController {

    @Autowired
    private DesignationService designationService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping(value = "/designation/")
    @ResponseStatus(HttpStatus.CREATED)
    public DesignationDto createDesignation(@RequestBody DesignationDto designationDto) throws Exception {
        return convertToDto(designationService.createDesignation(convertToEntity(designationDto)));
    }

    @GetMapping(value = "/designation/")
    @ResponseStatus(HttpStatus.OK)
    public List<DesignationDto> getDesignations() {
        List<Designation> designations = designationService.getDesignations();
        return designations.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @GetMapping(value = "/designation/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public DesignationDto getDesignation(@PathVariable Long id) {
        return convertToDto(designationService.getDesignation(id));
    }

    @PutMapping(value = "/designation/{id}/")
    @ResponseStatus(HttpStatus.OK)
    DesignationDto updateDesignation(@RequestBody DesignationDto designationDto, @PathVariable Long id) {
        return convertToDto(designationService.updateDesignation(id, convertToEntity(designationDto)));
    }

    @DeleteMapping(value = "/designation/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public void deleteDesignation(@PathVariable Long id) {
        designationService.deleteDesignation(id);
    }

    private DesignationDto convertToDto(Designation designation) {
        DesignationDto DesignationDto = modelMapper.map(designation, DesignationDto.class);
        return DesignationDto;
    }

    private Designation convertToEntity(DesignationDto designationDto) {
        Designation designation = modelMapper.map(designationDto, Designation.class);
        return designation;
    }
}
