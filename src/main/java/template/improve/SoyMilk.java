package template.improve;

public abstract class SoyMilk {
    // final 防止子类覆盖
    final void make() {
        selectMainMaterial();
        if (isAddIngredient()) {
            selectIngredient();
        }
        soak();
        smash();
    }

    private void selectMainMaterial() {
        System.out.println(" 选取主材料上好黄豆...... ");
    }

    // 钩子方法
    abstract void selectIngredient();

    private void soak() {
        System.out.println(" 将主材料和配料浸泡一段时间...... ");
    }

    private void smash() {
        System.out.println(" 开始研磨豆浆...... ");
    }

    private boolean isAddIngredient() {
        return true;
    }

}
