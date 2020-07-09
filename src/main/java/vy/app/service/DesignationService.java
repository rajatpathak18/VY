package vy.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vy.app.model.Designation;
import vy.app.repository.DesignationRepository;
import vy.app.repository.DesignationRepository;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
public class DesignationService {
    @Autowired
    private DesignationRepository designationRepository;

    @Transactional
    public Designation createDesignation(Designation designation) {
        return designationRepository.save(designation);
    }

    public List<Designation> getDesignations() {
        return designationRepository.findAll();
    }

    public Designation getDesignation(Long id) {
        Optional<Designation> designationOptional = designationRepository.findById(id);
        return designationOptional.get();
    }

    @Transactional
    public Designation updateDesignation(Long id, Designation designation) {
        designation.setDesignationID(id);
        designationRepository.save(designation);
        return designationRepository.findById(id).get();
    }

    @Transactional
    public void deleteDesignation(Long id) {
        designationRepository.deleteById(id);
    }
}
