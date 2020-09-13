package vy.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vy.app.Exception.Exceptions;
import vy.app.model.Designation;
import vy.app.repository.DesignationRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class DesignationService {
    @Autowired
    private DesignationRepository designationRepository;

    @Transactional
    public Designation createDesignation(Designation designation) throws Exception {
        if (designationRepository.existsByDesignationName(designation.getDesignationName())) {
            throw Exceptions.DesignationNameAlreadyExistException;
        }

        return designationRepository.save(designation);
    }

    public List<Designation> getDesignations() {
        return designationRepository.findAll();
    }

    public Designation getDesignation(Long id) throws Exception {
        if (!designationRepository.existsById(id)) {
            throw Exceptions.DesignationIDDoesNotExistException;
        }
        Optional<Designation> designationOptional = designationRepository.findById(id);
        return designationOptional.get();
    }

    @Transactional
    public Designation updateDesignation(Long id, Designation designation) throws Exception {
        if (!designationRepository.existsById(id)) {
            throw Exceptions.DesignationIDDoesNotExistException;
        }
        Designation designationFromDB = designationRepository.findById(id).get();
        designationFromDB.setDesignationName(designation.getDesignationName());
        return designationRepository.save(designationFromDB);
    }

    @Transactional
    public void deleteDesignation(Long id) throws Exception {
        if (!designationRepository.existsById(id)) {
            throw Exceptions.DesignationIDDoesNotExistException;
        }
        designationRepository.deleteById(id);
    }
}
