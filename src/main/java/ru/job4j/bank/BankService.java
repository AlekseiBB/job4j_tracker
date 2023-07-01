package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BankService {
    private final Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        if (!users.containsKey(user)) {
            users.put(user, new ArrayList<>());
        }
    }

    public boolean deleteUser(String passport) {
        User userToDelete = null;
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                userToDelete = user;
                break;
            }
        }

        if (userToDelete != null) {
            List<Account> accounts = users.remove(userToDelete);
            return true;
        }
        return false;
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);

            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);

        if (user != null) {
            List<Account> accounts = users.get(user);

            for (Account account : accounts) {
                if (account.getRequisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        User srcUser = findByPassport(srcPassport);
        User destUser = findByPassport(destPassport);

        if (srcUser != null && destUser != null) {
            List<Account> srcAccounts = users.get(srcUser);
            List<Account> destAccounts = users.get(destUser);

            Account srcAccount = findByRequisite(srcPassport, srcRequisite);
            Account destAccount = findByRequisite(destPassport, destRequisite);

            if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                destAccount.setBalance(destAccount.getBalance() + amount);
                return true;
            }
        }
        return false;
    }

    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}
