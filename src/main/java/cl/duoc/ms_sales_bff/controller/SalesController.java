package cl.duoc.ms_sales_bff.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_sales_bff.model.dto.SalesDTO;
import cl.duoc.ms_sales_bff.services.SalesServices;

@RestController
@RequestMapping("/api/bff/sales")
public class SalesController {

    @Autowired
    SalesServices salesServices;

     @GetMapping("/{id}")
    public ResponseEntity<SalesDTO> findSalesById(@PathVariable("id") Long id) {
        SalesDTO salesDTO = salesServices.getSalesById(id);
        return (salesDTO != null)?  new ResponseEntity<>(salesDTO, HttpStatus.OK) :
                                     new ResponseEntity<>(HttpStatus.NOT_FOUND); 
    }
}
