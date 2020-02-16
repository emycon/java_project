import java.util.ArrayList;
import java.util.List;

/**
 * ChatRoom
 */
public class ChatRoom extends AbstractChatRoom {
    private List<User> users = new ArrayList<>();

    public void register(User user) {
        users.add(user);
    }

    @Override
    public void notice(String message, User user) {
        for (User u : users) {
            if (u != user) {
                u.getMessage(message);
            }
        }
    }
}