package bridge;

import lombok.AllArgsConstructor;

// 桥接器 桥
@AllArgsConstructor
public abstract class Phone {
    public Brand brand;

    protected void open() {
        this.brand.open();
    }

    protected void close() {
        this.brand.close();
    }

    protected void call() {
        this.brand.call();
    }

}
