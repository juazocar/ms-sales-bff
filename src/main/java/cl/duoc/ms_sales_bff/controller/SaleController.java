package cl.duoc.ms_sales_bff.controller;

import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_sales_bff.model.dto.SaleDTO;
import cl.duoc.ms_sales_bff.model.dto.WebPayTransactionResponseDTO;
import cl.duoc.ms_sales_bff.service.SaleService;
import lombok.extern.log4j.Log4j2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/sales")
@CrossOrigin("*")
@Log4j2
public class SaleController {

    @Autowired
    SaleService saleService;

    @PostMapping("/sale")
    public WebPayTransactionResponseDTO createSale(@RequestBody SaleDTO saleDTO) {
        log.info("SaleDTO: {}", saleDTO);
        return saleService.createSale(saleDTO);
    }
    

}
