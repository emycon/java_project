/**
 * Client
 */
public class Client {
    public static void main(String[] args) {
        Handler groupLeaderHandler = new GroupLeaderHandler();
        Handler factoryManagerHandler = new FactoryManagerHandler();
        Handler bossHandler = new BossHandler();

        groupLeaderHandler.setSuccessor(factoryManagerHandler);
        factoryManagerHandler.setSuccessor(bossHandler);

        groupLeaderHandler.handlerRequest(1);
        groupLeaderHandler.handlerRequest(6);
        groupLeaderHandler.handlerRequest(10);
        // ChatRoom chatRoom = new ChatRoom();
        // UserA userA = new UserA(chatRoom);
        // UserB userB = new UserB(chatRoom);
        // chatRoom.register(userA);
        // chatRoom.register(userB);
        // userA.sendMessage("你好！");
        // userB.sendMessage("再见！");
    }
}