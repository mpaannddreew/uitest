package anebra.uitest;

import androidx.annotation.Nullable;

public class User {
    String name;
    String email;

    public User(String name, @Nullable String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
