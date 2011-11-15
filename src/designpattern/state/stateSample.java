package designpattern.state;

/**
 * @author lmm333
 */
public class stateSample {
}

//环境，用于保存状态

class Context {
    public static final State shilian=new shilianState();
    public static final State lianai=new lianaiState();
    public static final State qiuou=new qiiuouState();
    
    private State state;

    public Context(State state) {
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

}

abstract class State {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }
    public abstract void fenshou();
    public abstract void zhuiqiu();
    public abstract void deshou();
}

class lianaiState extends State{
    @Override
    public void deshou() {
        super.context.setState(Context.shilian);
    }
    @Override
    public void fenshou() {
        //
    }
    @Override
    public void zhuiqiu() {
        
    }
}

class shilianState extends State{
    @Override
    public void deshou() {
        
    }
    @Override
    public void fenshou() {
        
    }
    @Override
    public void zhuiqiu() {
        
    }
}

class qiiuouState extends State{
    @Override
    public void deshou() {
        
    }
    @Override
    public void fenshou() {
        
    }
    @Override
    public void zhuiqiu() {
        
    }
}
