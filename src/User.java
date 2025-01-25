public class User {

    private String username;
    private String password;
    private String userId;

    public User(String username, String password, String userId) {
        this.username = username;
        this.password = password;
        this.userId = userId;
    }

    // Implement methods for user to send message
    // Connect to room
    public void connectToRoom(User user) {
            if(password.equals(user.getPassword())) {
                System.out.println("Connected to room");
                ChatRoom chatRoom = new ChatRoom();
                chatRoom.addUser(user);
            }
    }
    public void DisconnectFromRoom(User user) {
        if(password.equals(user.getPassword())) {
            System.out.println("Disconnected from room");
            ChatRoom chatRoom = new ChatRoom();
            chatRoom.removeUser(user);
        }
    }
    // send message to another user

    public Message sendMessage(String message, String userId) {
            return new Message(getUserId(), userId, message);
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
