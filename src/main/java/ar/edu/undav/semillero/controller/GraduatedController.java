package ar.edu.undav.semillero.controller;

import ar.edu.undav.semillero.domain.entity.Graduated;
import ar.edu.undav.semillero.service.GraduatedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/******************************************************
 * Al runnear esto, si entro a localhost:8080/saveGraduated guardo un graduado en la DB semillero
 *****************************************************/

@RestController
@RequestMapping("/graduado")
public class GraduatedController {

    @Autowired 
    private GraduatedService graduatedService;

	@RequestMapping(value="", method = RequestMethod.POST)
    public Long saveGraduated() {
    	Graduated graduated = new Graduated("Peron");
        graduatedService.save(graduated);
        return graduated.getId();
    }


    @RequestMapping(value="", method = RequestMethod.GET)
    public Collection<Graduated> getAllGraduated() {
        Collection<Graduated> graduateds = graduatedService.findAll();
        return graduateds;
    }

}