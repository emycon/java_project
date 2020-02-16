public class UserA extends User {
    public UserA(AbstractChatRoom chatRoom) {
        super(chatRoom);
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println("用户A发送 " + msg);
        chatRoom.notice(msg, this);
    }

    @Override
    public void getMessage(String msg) {
        System.out.println("用户A收到 " + msg);
    }

}