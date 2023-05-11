package com.comercialmanagement.Services;

import com.comercialmanagement.Models.Factura;
import com.comercialmanagement.Repository.FacturaRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@AllArgsConstructor
public class FacturaService {

    FacturaRepository facturaRepository;


    public List<Factura> findAll(){
        return facturaRepository.findAll();
    }

    public Factura create(Factura factura){
       return facturaRepository.save(factura);
    }

    public Factura update(long id,Factura newFactura){
        Factura oldFactura=facturaRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
        newFactura.setId(oldFactura.getId());
       return facturaRepository.save(newFactura);

    }

    public Map<String,Boolean> delete(long id){
        Factura factura=facturaRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
        facturaRepository.delete(factura);
         HashMap myMap=new HashMap();
         myMap.put("deleted",true);
         return  myMap;

    }

}
