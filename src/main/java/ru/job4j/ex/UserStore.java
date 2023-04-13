package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        int index = 0;
        boolean result = false;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                result = true;
                index = i;
                break;
            }
        }
        if (!result) {
            throw new UserNotFoundException("пользователь не найден");
        }
        return users[index];
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername() == null || user.getUsername().length() < 3) {
            throw new UserInvalidException("Пользователь не валидный. Имя должно содержать не менее 3 символов." + user);
        }
        if (user.isValid() == false) {
            throw new UserInvalidException("неверной пользователь " + user);
        }
        return false;
    }

    public static void main(String[] args) throws UserNotFoundException {
        User[] users = {
                new User("Petr Arsentev", true)
        };
        User user = findUser(users, "Petr Arsentev");
        if (validate(user)) {
            System.out.println("This user has an access");
        }
    }
}
