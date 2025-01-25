import java.util.List;

public class ChatRoom {

    private String roomName;
    private static List<User> userList;
    private static List<Message> messageList;

    // create a singleton instance
    private static ChatRoom instance;
    public ChatRoom() {
        roomName = "newChatRoom";

    }
    public static ChatRoom getInstance() {
        if (instance == null) {
            return new ChatRoom();
        }
        return instance;
    }

    // Add message to a chatRoom
    public void addUser(User user) {
        userList.add(user);
    }
    public void removeUser(User user) {
        userList.remove(user);
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public List<User> getUserList() {
        return userList;
    }

    public List<Message> getMessageList() {
        return messageList;
    }

}
