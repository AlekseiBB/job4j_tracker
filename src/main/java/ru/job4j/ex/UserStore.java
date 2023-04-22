package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User result = null;
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                result = user;
                break;
            }
        }
            if (result == null) {
                throw new UserNotFoundException("пользователь не найден");
            }
        return result;
    }

        public static boolean validate (User user) throws UserInvalidException {
            if (user.getUsername() == null || user.getUsername().length() < 3) {
                throw new UserInvalidException("Пользователь не валидный. Имя должно содержать не менее 3 символов." + user);
            }
            if (!user.isValid()) {
                throw new UserInvalidException("неверной пользователь " + user);
            }
            return false;
        }

        public static void main (String[]args) throws UserNotFoundException {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            try {
                User user = findUser(users, "Petr Arsentev");
                if (validate(user)) {
                    System.out.println("This user has an access");
                }
            } catch (UserInvalidException e) {
                e.printStackTrace();
            } catch (UserNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
