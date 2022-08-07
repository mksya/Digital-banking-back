package mksya.org.dto;

import lombok.Data;
import mksya.org.entities.AccountOperation;
import mksya.org.entities.enums.AccountStatus;

import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;
import java.util.List;

@Data
public class SavingBankAccountDTO {
    @Id
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    @OneToMany(mappedBy = "bankAccount", fetch=FetchType.LAZY)
    private List<AccountOperation> accountOperations;

}
