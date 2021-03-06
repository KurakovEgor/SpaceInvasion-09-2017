package ru.spaceinvasion.services;

import org.springframework.jdbc.core.RowMapper;
import ru.spaceinvasion.models.User;

class Mappers {

    static final RowMapper<User> USER_ROW_MAPPER = (res, num) -> {
        User user = new User(
                res.getString("username"),
                res.getString("password"),
                res.getString("email")
        );
        user.setScore(res.getInt("score"));
        user.setId(res.getInt("id"));
        return user;
    };

}
