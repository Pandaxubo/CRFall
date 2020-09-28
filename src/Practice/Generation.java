package Practice;

/**
 * @author pandaxubo
 * @description 理解父类和子类的继承关系。
 * 在父类的变量访问权限是private时，可以调用setter改变其值；为protected/public/default时，继承的super为另一个存储空间，互相不影响。
 * 任何时候都可以通过setter修改变量
 */
public class Generation extends Father {
    int money;
    public Generation() {
        System.out.println("This is Son's constructor!");
        this.money = 55;
        super.money = 1000;
    }

    public static void main(String[] args) {
        Generation g = new Generation();
        Father f = new Father();
        g.says();
        f.says();
        System.out.println("Step 1: Modify Father's val.");
        System.out.println("Father's val : "+g.getVal());
        g.setVal(100);
        System.out.println("After modification : "+g.getVal());
        System.out.println("Step 2: Show money.");
        System.out.println("Original Father's money : "+f.money);
        g.printMoney();
    }

    protected void printMoney(){
        System.out.println("Generation's money : "+ this.money);
        System.out.println("Father's money : "+ super.money);
    }

    @Override
    public void says() {
        System.out.println("Son says bar.");
    }

}

class Father {
    private int val = 1;
    protected int money;

    public Father() {
        System.out.println("This is Father's constructor!");
        money = 123;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void says() {
        System.out.println("Father says foo.");
    }
}
