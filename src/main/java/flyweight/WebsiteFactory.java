package flyweight;

import java.util.HashMap;

// 共享池
public class WebsiteFactory {
    HashMap<String, ConcreteWebsite> pool = new HashMap<>();

    public Website getWebsiteCategory(String type) {
        if (!pool.containsKey(type)) {
            pool.put(type, new ConcreteWebsite(type));
        }

        return (Website) this.pool.get(type);
    }

    public int poolCount() {
        return this.pool.size();
    }

}
