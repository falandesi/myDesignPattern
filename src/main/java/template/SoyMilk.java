package template;

public abstract class SoyMilk {
    // final 防止子类覆盖 模版方法
    final void make() {
        selectMainMaterial();
        selectIngredient();
        soak();
        smash();
    }

    private void selectMainMaterial() {
        System.out.println(" 选取主材料上好黄豆...... ");
    }

    abstract void selectIngredient();

    private void soak() {
        System.out.println(" 将主材料和配料浸泡一段时间...... ");
    }

    private void smash() {
        System.out.println(" 开始研磨豆浆...... ");
    }

}
