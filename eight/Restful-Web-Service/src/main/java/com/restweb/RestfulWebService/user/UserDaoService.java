package com.restweb.RestfulWebService.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService 
{
    private static List<User> users = new ArrayList<>();
    private static int cntUser = 0;

    static
    {
        users.add(new User(++cntUser, "DK", LocalDate.now().minusYears(22)));
        users.add(new User(++cntUser, "Om", LocalDate.now().minusYears(18)));
        users.add(new User(++cntUser, "Madbox", LocalDate.now().minusYears(25)));
    }

    public List<User> FindAll()
    {
        return users;
    }

    public User FindUser(int id)
    {
        // return users.get(id - 1);
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        return users.stream().filter(predicate).findFirst().orElse(null);
    }

    public User SaveUser(User user)
    {
        user.setId(++cntUser);
        users.add(user);
        return user;
    }
}