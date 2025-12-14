package org.example.chapter12.controller;

import org.example.chapter12.model.Account;
import org.example.chapter12.model.TransferRequest;
import org.example.chapter12.service.TransferService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AccountController {

    private final TransferService transferService;

    public AccountController(TransferService transferService) {
        this.transferService = transferService;
    }
//
//    @PostMapping("/transfer")
//    public void transferMoney(
//            @RequestBody TransferRequest request
//    ) {
//        transferService.transferMoney(
//                request.getSenderAccountId(),
//                request.getReceiverAccountId(),
//                request.getAmount());
//    }
//
//    @GetMapping("/accounts")
//    public List<Account> getAllAccounts() {
//        return transferService.getAllAccounts();
//    }


    @PostMapping("/transfer")
    public void transferMoney(
            @RequestBody TransferRequest request
    ) {
        transferService.transferMoney(
                request.getSenderAccountId(),
                request.getReceiverAccountId(),
                request.getAmount());
    }

    @GetMapping("/accounts")
    public Iterable<Account> getAllAccounts(
            @RequestParam(required = false) String name
    ) {
        if (name == null) {
            return transferService.getAllAccounts();
        } else {
            return transferService.findAccountsByName(name);
        }
    }
}
