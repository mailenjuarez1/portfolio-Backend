
package com.portfolio.miapp.Interface;

import com.portfolio.miapp.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    public List <Persona> getPersona();
    
    public void savePersona (Persona persona);
    
    public void deletePersona (Long id);
    
    public Persona findPersona (Long id);
}
