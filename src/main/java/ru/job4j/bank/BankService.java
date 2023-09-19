package ru.job4j.bank;

import ru.job4j.bank.Account;
import ru.job4j.bank.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу
 *  * * @author Aleksei
 *  *  * @version 1.0
 */
public class BankService {

    /**
     * Хранение пользователей в списке по паре ключ - значение
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод addUser добавляет нового пользователя, если нет повторяющихся ключ-значений
     * @param user значение для добавления проверки повторяющихся ключ-значений
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод используется для удаления пользователя
     * @param passport принимается значечние в качестве аргумента
     * @return если успешно удаляет объект из users, то он возвращает удаленный объект, если объект не найдет вернет null
     */
    public boolean deleteUser(String passport) {
            return users.remove(new User(passport, "")) != null;
    }

    /**
     * Метод используется для добавления нового счета к пользователю
     * @param passport необходим для поиска пользователя, если значение не найдено вернет null
     * @param account используется для идентификации пользователе
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        }
    }

    /**
     * Метод позволяет найти пользователя по его паспортным данным
     * @param passport принимает на вход параметр для идентификации пользователя
     * @return возвращает пользователя по совпадению данных passport
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * Метод позволяет найти счет пользователя по его паспортным данным и реквизитам счета.
     * @param passport принимает на вход параметр для идентификации пользователя
     * @param requisite принимает на вход параметр реквизиты счета для идентификации пользователя
     * @return возвращает счет при совпадении входящих параметров
     */
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

    /**
     * Метод позволяет осуществить перевод денежных средств между счетами пользователей
     * @param srcPassport принимает на вход passport данные
     * @param srcRequisite принимает на вход requisite данные
     * @param destPassport поиск кому будут переводиться деньги
     * @param destRequisite реквизиты на которые будут переведены деньги
     * @param amount сумма изменения счета
     * @return возвращает увеличенный баланс или ошибку перевода
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
            Account srcAccount = findByRequisite(srcPassport, srcRequisite);
            Account destAccount = findByRequisite(destPassport, destRequisite);
            if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
                srcAccount.setBalance(srcAccount.getBalance() - amount);
                destAccount.setBalance(destAccount.getBalance() + amount);
                return true;
            }
        return false;
    }

    /**
     * Метод позволяет получить список счетов пользователя
     * @param user подается на вход для поиска по ключ-значение
     * @return возвращает список счетов user
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}