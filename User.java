package library;

public class User 
{
    private int userId;
    private String userName;

    public User(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public String getuserName() {
        return userName;
    }

    public String toString() {
        return "User ID: " + userId + ", User Name: " + userName;
    }
}
