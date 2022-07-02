import com.chongligong.config.SpringConfig;
import com.chongligong.dao.BrandDao;
import com.chongligong.domain.Brand;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfig.class)
public class TestBrand {

    @Autowired
    private BrandDao brandDao;

    @Test
    public void TestAdd()
    {
        Brand brand = new Brand("云南白药", "云南白药有限公司", 123, "国家秘法", 1);
        brandDao.add(brand);
    }

    @Test
    public void TestDelete()
    {
        brandDao.delete(35);

    }

    @Test
    public void TestUpdata()
    {
        Brand brand = new Brand(36,"云南白药", "云南白药股份有限公司", 2333, "国家秘方", 1);
        brandDao.update(brand);
    }

    @Test
    public void TestSelect()
    {
        Brand select = brandDao.select(36);
        System.out.println(select);
        System.out.println(select);
        System.out.println(select);
        System.out.println(select);
    }

}
