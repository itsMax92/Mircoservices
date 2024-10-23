package com.banking.accounts.mapper;

import com.banking.accounts.dto.AccountsDto;
import com.banking.accounts.entity.Accounts;

public class AccountMapper {

    public static AccountsDto mapToAccountDto(AccountsDto accountsDto, Accounts accounts) {
        accountsDto.setAccountNumber(accounts.getAccountNumber());
        accountsDto.setAccountType(accounts.getAccountType());
        accountsDto.setBranchAddress(accounts.getBranchAddress());
        return accountsDto;
    }

    public static Accounts mapToAccounts(Accounts accounts, AccountsDto accountsDto) {
        accounts.setAccountNumber(accountsDto.getAccountNumber());
        accounts.setAccountType(accountsDto.getAccountType());
        accounts.setBranchAddress(accountsDto.getBranchAddress());
        return accounts;
    }
}
