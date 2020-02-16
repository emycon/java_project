public class UserB extends User {
    public UserB(AbstractChatRoom chatRoom) {
        super(chatRoom);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("用户B发送 " + msg);
        chatRoom.notice(msg, this);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("用户B收到 " + msg);
    }
}