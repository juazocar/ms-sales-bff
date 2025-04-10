package cl.duoc.ms_sales_bff.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class WebPayTransactionRequestDTO {

    private String buyOrder;
    private String sessionId;
    private int    amount;
    private String returnUrl;
}
