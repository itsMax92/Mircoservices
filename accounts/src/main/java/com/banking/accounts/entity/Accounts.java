package com.banking.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Accounts extends BaseEntity {

    @Column
    private Long customerID;
    @Id
    @Column
    private Long accountNumber;
    @Column
    private String accountType;
    @Column
    private String branchAddress;
}
