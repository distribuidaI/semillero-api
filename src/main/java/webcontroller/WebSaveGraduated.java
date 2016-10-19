package webcontroller;
import org.springframework.beans.factory.annotation.Autowired;
/******************************************************
 * Al runnear esto, si entro a localhost:8080/saveGraduated guardo un graduado en la DB semillero
 *****************************************************/
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

import ar.edu.undav.semillero.domain.entity.Graduated;
import ar.edu.undav.semillero.domain.repository.GraduatedRepository;

@RestController
@EnableAutoConfiguration
public class WebSaveGraduated {

    @Autowired 
    private GraduatedRepository graduatedRepository;
	
    
	@RequestMapping("/saveGraduated")
    String saveGraduated() {
    	Graduated graduated = new Graduated("Peron");
        graduatedRepository.save(graduated);
        return "Graduado agregado";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(WebSaveGraduated.class, args);
    }

}