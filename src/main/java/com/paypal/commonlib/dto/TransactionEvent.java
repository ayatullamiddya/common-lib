package com.paypal.commonlib.dto;




import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class TransactionEvent{
    private Long id;
    private Long senderId;
    private Long receiverId;
    private Double amount;
    private LocalDateTime timestamp;
    private String status;


}
