package com.sch.sprintboot.controller;

import com.sch.sprintboot.entity.Dwitter;
import com.sch.sprintboot.service.DwitterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3003")
public class RestDwitterController {
    private DwitterService dwitterService;

    @Autowired
    public RestDwitterController(DwitterService dwitterService) {
        this.dwitterService = dwitterService;
    }

    @PostMapping("/dwitters/delete")
    public String deleteDwitter(@RequestBody Dwitter dwitter) {
        return dwitterService.delete(Long.valueOf(dwitter.getId()));
    }

    @GetMapping("/dwitters")
    public List<Dwitter> list() {
        return dwitterService.selectAll();
    }

    @PostMapping("/dwitters/register")
    public String save(@RequestBody Dwitter diwtter) {
        return dwitterService.save(diwtter);
    }

}
