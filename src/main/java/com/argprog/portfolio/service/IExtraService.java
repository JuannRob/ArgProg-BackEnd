package com.argprog.portfolio.service;

import com.argprog.portfolio.model.Extra;
import java.util.List;


public interface IExtraService {
    
    public List<Extra> getExtras();
    
    public void saveExtra (Extra extra, Long persona_id);
    
    public void deleteExtra (Long id);
    
    public Extra getExtra (Long id);
    
    public List<Extra> getExtraByPersonaId (Long persona_id);
    
}
