package com.reflectionTransient;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class User implements Serializable {
    private String username;
    private transient String password;

    public User() {}
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(username);
        // Password is not serialized
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
        username = (String) in.readObject();
        password = null; // Password is not deserialized
    }
}

public class UserLogin {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		User user = new User("johndoe", "secretpassword");

        // Serialize the user object
        FileOutputStream fileOut = new FileOutputStream("user.ser");
        ObjectOutputStream out = new ObjectOutputStream(fileOut);
        out.writeObject(user);
        out.close();
        fileOut.close();
        System.out.println("User object serialized");

        // Deserialize the user object
        FileInputStream fileIn = new FileInputStream("user.ser");
        ObjectInputStream in = new ObjectInputStream(fileIn);
        User deserializedUser = (User) in.readObject();
        in.close();
        fileIn.close();
        System.out.println("User object deserialized");

        // Check if the deserialized user object has the correct username and password
        System.out.println("Username: " + deserializedUser.getUsername());
        System.out.println("Password: " + deserializedUser.getPassword()); // This should be null
    }

}
