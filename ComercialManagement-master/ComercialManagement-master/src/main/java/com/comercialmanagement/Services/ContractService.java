package com.comercialmanagement.Services;

import com.comercialmanagement.Models.Contract;
import com.comercialmanagement.Repository.ContractRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
@AllArgsConstructor
public class ContractService {

    final ContractRepository contractRepository;


    public List<Contract> findAll(){
        return contractRepository.findAll();
    }

    public Contract create(Contract contract){
        return contractRepository.save(contract);
    }

    public Contract update(long id,Contract newContract){
       Contract oldContract=contractRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
        newContract.setId(oldContract.getId());
        return contractRepository.save(newContract);

    }

    public Map<String,Boolean> delete(long id){
       Contract contract=contractRepository.findById(id).orElseThrow(()->new RuntimeException("not found"));
        contractRepository.delete(contract);
        HashMap myMap=new HashMap();
        myMap.put("deleted",true);
        return  myMap;

    }
}
