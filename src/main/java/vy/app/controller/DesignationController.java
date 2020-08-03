package vy.app.controller;

import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import vy.app.model.Designation;
import vy.app.pojo.DesignationDto;
import vy.app.service.DesignationService;

import java.util.List;
import java.util.stream.Collectors;

@Log4j2
@RestController
public class DesignationController {

    @Autowired
    private DesignationService designationService;

    @Autowired
    private ModelMapper modelMapper;

    @PostMapping(value = "/designation/")
    @ResponseStatus(HttpStatus.CREATED)
    public DesignationDto createDesignation(@RequestBody DesignationDto designationDto) throws Exception {
        log.info("createDesignation: request :" + designationDto.toString());
        return convertToDto(designationService.createDesignation(convertToEntity(designationDto)));
    }

    @GetMapping(value = "/designation/")
    @ResponseStatus(HttpStatus.OK)
    public List<DesignationDto> getDesignations() {
        log.info("getDesignations");
        List<Designation> designations = designationService.getDesignations();
        return designations.stream().map(this::convertToDto).collect(Collectors.toList());
    }

    @GetMapping(value = "/designation/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public DesignationDto getDesignation(@PathVariable Long id) throws Exception {
        log.info("getDesignation: designationID :" + id);
        return convertToDto(designationService.getDesignation(id));
    }

    @PutMapping(value = "/designation/{id}/")
    @ResponseStatus(HttpStatus.OK)
    DesignationDto updateDesignation(@RequestBody DesignationDto designationDto, @PathVariable Long id) throws Exception {
        log.info("updateDesignation: designationID :" + id + " request: " + designationDto.toString());
        return convertToDto(designationService.updateDesignation(id, convertToEntity(designationDto)));
    }

    @DeleteMapping(value = "/designation/{id}/")
    @ResponseStatus(HttpStatus.OK)
    public void deleteDesignation(@PathVariable Long id) throws Exception {
        log.info("deleteDesignation: designationID :" + id);
        designationService.deleteDesignation(id);
    }

    private DesignationDto convertToDto(Designation designation) {
        DesignationDto designationDto = modelMapper.map(designation, DesignationDto.class);
        return designationDto;
    }

    private Designation convertToEntity(DesignationDto designationDto) {
        Designation designation = modelMapper.map(designationDto, Designation.class);
        return designation;
    }
}
