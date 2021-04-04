package udemy.spring.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

    @RequestMapping({"/vets", "/vets/vet-list", "/vets/vet-list.html"})
    public String listVets() {
        return "vets/vet-list";
    }
}
