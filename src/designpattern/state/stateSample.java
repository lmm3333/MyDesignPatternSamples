package designpattern.state;

/**
 * @author lmm333
 */
public class stateSample {
    public static void main(String[] args) {
        Context ruandan =new Context();
        ruandan.setState(Context.单身state);
        ruandan.追求();
        ruandan.得手();
        ruandan.分手();
    }
}

//环境，用于保存状态
class Context {//extends State
    public static final State 单身state=new 单身State();
    public static final State 恋爱state=new 恋爱State();
    public static final State 求偶state=new 求偶State();
    
    private State state;

//    public Context(State state) {
//        this.state = state;
//        this.state.setContext(this);
//    }

    public void setState(State state) {
        this.state = state;
        this.state.setContext(this);
    }
    public State getState() {
        return state;
    }
//     @Override
    public void 分手() {
        state.分手();
    }
//    @Override
    public void 得手() {
        state.得手();
    }
//    @Override
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
