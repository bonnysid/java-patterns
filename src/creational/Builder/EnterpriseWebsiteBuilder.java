package creational.Builder;

public class EnterpriseWebsiteBuilder extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprise website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.JOOMLA);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
