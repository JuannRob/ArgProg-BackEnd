package com.argprog.portfolio.controller;

import com.argprog.portfolio.model.Extra;
import com.argprog.portfolio.service.IExtraService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExtraController {
    
    @Autowired
    private IExtraService extraServ;
    
    @GetMapping ("/extras")
    @ResponseBody
    public List<Extra> getExtras () {
        return extraServ.getExtras();
    }
    
    @GetMapping ("/extras/{id}")
    @ResponseBody
    public Extra getExtra (@PathVariable Long id) {
        return extraServ.getExtra(id);
    }
    
    @GetMapping ("/personas/{id}/extras")
    @ResponseBody
    public List<Extra> getExtraByPersonaId (@PathVariable Long id) {
        return extraServ.getExtraByPersonaId(id);
    }
    
    @PostMapping ("/personas/{id}/extras")
    public void saveExtra (@RequestBody Extra extra, @PathVariable Long id) {
        extraServ.saveExtra(extra, id);
    }
    
    @DeleteMapping ("/extras/{id}")
    public void deleteExtra (@PathVariable Long id) {
        extraServ.deleteExtra(id);
    }
    
}
