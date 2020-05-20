package flyweight;

public class Client {
    public static void main(String[] args) {
        WebsiteFactory websiteFactory = new WebsiteFactory();

        Website website1 = websiteFactory.getWebsiteCategory("微博");
        website1.use(new User("Tom"));

        Website website2 = websiteFactory.getWebsiteCategory("新闻");
        website2.use(new User("Ford"));

        Website website3 = websiteFactory.getWebsiteCategory("微信");
        website3.use(new User("Jerry"));

        Website website4 = websiteFactory.getWebsiteCategory("微博");
        website4.use(new User("Tony"));

        System.out.println("pool 数量:" + websiteFactory.poolCount());

    }
}
