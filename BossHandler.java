public class BossHandler extends Handler {
    @Override
    public void handlerRequest(int heaven) {
        if (heaven <= 15) {
            System.out.println("老板处理");
        }else {
            if (super.successor != null) {
                super.successor.handlerRequest(heaven);
            }
        }
    }
}