package cl.duoc.ms_sales_bff.controller;

import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_sales_bff.model.dto.SaleDTO;
import lombok.extern.log4j.Log4j2;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/sales")
@CrossOrigin("*")
@Log4j2
public class SaleController {

    @PostMapping("/sale")
    public String createSale(@RequestBody SaleDTO saleDTO) {
        //TODO: process POST request
        log.info("SaleDTO: {}", saleDTO);
        return "hola";
    }
    

}
