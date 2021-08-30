package in.countrybaskets.signupandsignin;

public class userdata {
    public static String username;
    public static String password;

    public static String getUsername() {
        return username;
    }

    public static void setUsername(String username) {
        userdata.username = username;
    }

    public static String getPassword() {
        return password;
    }

    public static void setPassword(String password) {
        userdata.password = password;
    }

    public userdata() {
    }
}
