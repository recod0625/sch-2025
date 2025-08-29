package com.sch.sprintboot.service;

import com.sch.sprintboot.entity.Dwitter;
import com.sch.sprintboot.repository.JpaDwitterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class DwitterService {
    private JpaDwitterRepository dwitterRepository;

    @Autowired
    public DwitterService(JpaDwitterRepository dwitterRepository) {
        this.dwitterRepository = dwitterRepository;
    }

    public String delete(Long id) {
        return dwitterRepository.delete(id);
    }

    public List<Dwitter> selectAll() {
        return dwitterRepository.findAll();
    }

    public String save(Dwitter dwitter) {
        return dwitterRepository.insert(dwitter);
    }
}
