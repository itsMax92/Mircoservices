package com.banking.accounts.controller;

import com.banking.accounts.constants.AccountsConstants;
import com.banking.accounts.dto.CustomerDto;
import com.banking.accounts.dto.ResponseDto;
import com.banking.accounts.repository.CustomersRepository;
import com.banking.accounts.service.AccountService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api", produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class AccountsController {

    private AccountService accountService;
    private final CustomersRepository customersRepository;

    @PostMapping("/create")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {
        accountService.createAccount(customerDto);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
    }

    @GetMapping("/fetch")
    public ResponseEntity<CustomerDto> fetchAccountDetails(@RequestParam String mobileNumber) {
        CustomerDto customerDto = accountService.fetchAccountDetails(mobileNumber);
        return ResponseEntity.status(HttpStatus.OK)
                .body(customerDto);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDto> updateAccountDetails(@RequestBody CustomerDto customerDto) {
        boolean accountDetailsUpdated = accountService.updateAccountDetails(customerDto);
        if (accountDetailsUpdated) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.STATUS_200));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ResponseDto(AccountsConstants.STATUS_500,AccountsConstants.MESSAGE_500));
        }
    }

    @DeleteMapping("/delete")
    public ResponseEntity<ResponseDto> deleteAccount(@RequestParam String mobileNumber) {
        boolean accountDeleted = accountService.deleteAccount(mobileNumber);
        if (accountDeleted) {
            return ResponseEntity.status(HttpStatus.OK)
                    .body(new ResponseDto(AccountsConstants.STATUS_201, "Account has been successfully deleted"));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body(new ResponseDto(AccountsConstants.STATUS_500, AccountsConstants.MESSAGE_500));
        }
    }

}
