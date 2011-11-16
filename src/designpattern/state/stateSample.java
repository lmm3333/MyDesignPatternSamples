package designpattern.state;

/**
 * @author lmm333
 */
public class stateSample {
    public static void main(String[] args) {
        Context 软蛋 =new Context(Context.单身state);
        软蛋.追求();
        软蛋.得手();
        软蛋.分手();
    }
}

//环境，用于保存状态

class Context {
    public static final State 单身state=new 单身State();
    public static final State 恋爱state=new 恋爱State();
    public static final State 求偶state=new 求偶State();
    
    private State state;

    public Context(State state) {
        this.state = state;
        this.state.setContext(this);
    }

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);//这一句很重要，保证了状态子类里能够正确地应用到context对象
    }
    public State getState() {
        return state;
    }
    public void 分手() {
        state.分手();
    }
    public void 得手() {
        state.得手();
    }
    public void 追求() {
        state.追求();
    }
}

abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }
    public abstract void 分手();
    public abstract void 追求();
    public abstract void 得手();
}

class 恋爱State extends State{
    @Override
    public void 得手() {
        //do nothing
        System.out.println("哈哈，我成功啦，陷入热恋！");
    }
    @Override
    public void 分手() {
        super.context.setState(Context.单身state);
        super.context.getState().分手();
    }
    @Override
    public void 追求() {
        super.context.setState(Context.求偶state);
        super.context.getState().追求();
    }
}

class 单身State extends State{
    @Override
    public void 得手() {
        super.context.setState(Context.恋爱state);
        super.context.getState().得手();
    }
    @Override
    public void 分手() {
        //do nothing
        System.out.println("我被踹了，555");
    }
    @Override
    public void 追求() {
        super.context.setState(Context.求偶state);
        super.context.getState().追求();
    }
}

class 求偶State extends State{
    @Override
    public void 得手() {
        super.context.setState(Context.恋爱state);
        super.context.getState().得手();
    }
    @Override
    public void 分手() {
        super.context.setState(Context.单身state);
        super.context.getState().分手();
    }
    @Override
    public void 追求() {
        //do nothing
        System.out.println("我正在追一个mm哦");
    }
}
