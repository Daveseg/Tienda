package com.tienda.service;

import com.tienda.entity.Pais;
import com.tienda.repository.PaisRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author david
 */
@Service
public class PaisService implements IPaisService {

    @Autowired
    private PaisRepository paisRespository;
    
    @Override
    public List<Pais> listCountry() {
        return (List<Pais>) paisRespository.findAll();
    }

}
