package cl.duoc.ms_sales_bff.controller;

import org.springframework.web.bind.annotation.RestController;

import cl.duoc.ms_sales_bff.model.dto.SaleDTO;
import cl.duoc.ms_sales_bff.model.dto.WebPayTransacionDTO;
import cl.duoc.ms_sales_bff.model.dto.WebPayTransactionQueryResponseDTO;
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
        System.out.println("Este es un system.out.println");
        log.info("El llamado pasó por aqui!!!!!");
        log.error("Aqui hubo un error");
        log.info("SaleDTO: {}", saleDTO);
        return saleService.createSale(saleDTO);
    }

    @PostMapping("/sale/transaction/confirm")
    public String confirmTransaction(@RequestBody WebPayTransacionDTO webPayTransacionDTO) {
        log.info("WebPayTransacionDTO: {}", webPayTransacionDTO);
        return saleService.confirmTransaction(webPayTransacionDTO);
    }
    

    @PostMapping("/sale/transaction/query")
    public WebPayTransactionQueryResponseDTO queryTransaction(@RequestBody WebPayTransacionDTO webPayTransacionDTO) {
        log.info("WebPayTransacionDTO: {}", webPayTransacionDTO);
        return saleService.queryTransaction(webPayTransacionDTO);
    }
    

}
