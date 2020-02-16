/**
 * GroupLeaderHandler
 */
public class GroupLeaderHandler extends Handler {
    @Override
    public void handlerRequest(int heaven) {
        if (heaven <=2 ) {
            System.out.println("组长处理");
        } else {
            if (super.successor != null) {
                super.successor.handlerRequest(heaven);
            }
        }
    }

}