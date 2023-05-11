package com.comercialmanagement.Controllers;

import com.comercialmanagement.Models.Contract;
import com.comercialmanagement.Services.ContractService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
@RestController
@AllArgsConstructor
@RequestMapping("contracts")
public class ContractController {

    ContractService contractService;

    @GetMapping("/findAll")
    public List<Contract> findAll(){
        return contractService.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<Contract> create(@RequestBody Contract contract){
        return new ResponseEntity(contractService.create(contract), HttpStatus.OK);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Contract> update(@PathVariable Long id, @RequestBody Contract contract){
        return new ResponseEntity(contractService.update(id,contract),HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Map<String,Boolean>> delete(@PathVariable Long id){
        return new ResponseEntity(contractService.delete(id),HttpStatus.OK);
    }
}
