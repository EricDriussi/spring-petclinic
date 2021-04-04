package udemy.spring.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/owners")
@Controller
public class OwnerController {

    @RequestMapping({"", "/", "/owner-list", "/owner-list.html"})
    public String listOwners() {
        return "owners/owner-list";
    }
}
