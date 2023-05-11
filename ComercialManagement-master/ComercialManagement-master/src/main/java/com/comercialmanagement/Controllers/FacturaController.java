package com.comercialmanagement.Controllers;

import com.comercialmanagement.Models.Factura;
import com.comercialmanagement.Services.FacturaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@AllArgsConstructor
@RequestMapping("facturas")
public class FacturaController {

    FacturaService facturaService;

    @GetMapping("/findAll")
    public List<Factura> findAll(){
        return facturaService.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<Factura> create(@RequestBody Factura factura){
        return new ResponseEntity(facturaService.create(factura), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Factura> update(@PathVariable Long id,@RequestBody Factura factura){
        return new ResponseEntity(facturaService.update(id,factura),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete(@PathVariable Long id){
        return new ResponseEntity(facturaService.delete(id),HttpStatus.OK);
    }
}
