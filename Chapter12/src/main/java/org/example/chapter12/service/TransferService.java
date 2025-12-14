package org.example.chapter12.service;

import org.example.chapter12.exception.AccountNotFoundException;
import org.example.chapter12.model.Account;
import org.example.chapter12.repository.AccountRepo;
import org.example.chapter12.repository.AccountRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Service
@Transactional
public class TransferService {

//    private final AccountRepository accountRepository;
//
//    public TransferService(AccountRepository accountRepository) {
//        this.accountRepository = accountRepository;
//    }

    private final AccountRepo accountRepository;

    public TransferService(AccountRepo accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Transactional
    public void transferMoney(
            long idSender,
            long idReceiver,
            BigDecimal amount) {

        Account sender =
        accountRepository.findById(idSender)
        .orElseThrow(() -> new AccountNotFoundException("OOps"));

        Account receiver =
        accountRepository.findById(idReceiver)
                .orElseThrow(() -> new AccountNotFoundException("OOps"));

        BigDecimal senderNewAmount =
        sender.getAmount().subtract(amount);

        BigDecimal receiverNewAmount =
        receiver.getAmount().add(amount);

        accountRepository
      .changeAmount(idSender, senderNewAmount);

        accountRepository
      .changeAmount(idReceiver, receiverNewAmount);
    }
    public Iterable<Account> getAllAccounts() {
        return accountRepository.findAll();
    }

    public List<Account> findAccountsByName(String name) {
        return accountRepository.findAccountsByName(name);
    }
//
//    public void transferMoney(long idSender, long idReceiver, BigDecimal amount) {
//        Account sender = accountRepository.findAccountById(idSender);
//        Account receiver = accountRepository.findAccountById(idReceiver);
//
//        BigDecimal senderNewAmount = sender.getAmount().subtract(amount);
//        BigDecimal receiverNewAmount = receiver.getAmount().add(amount);
//
//        accountRepository.changeAmount(idSender, senderNewAmount);
//
//        accountRepository.changeAmount(idReceiver, receiverNewAmount);
//
//        throw new RuntimeException("Oh no! Something went wrong!");
//    }
//
//    public List<Account> getAllAccounts() {
//        return accountRepository.findAllAccounts();
//    }
}
