package mksya.org.dto;

import lombok.Data;
import mksya.org.entities.enums.OperationType;

import java.util.Date;

@Data
public class AccountOperationDTO {

    private Long id;
    private Date operationDate;
    private double amount;
    private OperationType type;
    private String description;
}
