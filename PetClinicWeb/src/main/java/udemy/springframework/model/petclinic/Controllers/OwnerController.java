package udemy.springframework.model.petclinic.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping({"/owners"})
public class OwnerController {

    @RequestMapping({"","/","/index","/index.html"})
    public String listOwner(){
        return "owners/index";
    }
}
