public class FactoryManagerHandler extends Handler{
    @Override
    public void handlerRequest(int heaven) {
        if (heaven <= 7) {
            System.out.println("厂长处理");
        }else {
            if (super.successor != null) {
                super.successor.handlerRequest(heaven);
            }
        }
    }
}