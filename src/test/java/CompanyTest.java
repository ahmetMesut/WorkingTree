import com.ahmetmesut.flatmap.Company;
import com.ahmetmesut.flatmap.CompanyModel;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertThat;

@RunWith(Parameterized.class)
public class CompanyTest {

    public Map<String, List<CompanyModel>> inputMap;
    public List outputList;
    public Company company;


    public CompanyTest(Map<String, List<CompanyModel>> inputMap, List outputList) {
        this.inputMap = inputMap;
        this.outputList = outputList;
    }

    @Before
    public void initialize() {
        company = new Company();
    }


    @Parameterized.Parameters
    public static Collection parameters() {

        CompanyModel companyApple = new CompanyModel();
        companyApple.setId(1L);
        companyApple.setCompanyName("Apple");

        CompanyModel companySamsung = new CompanyModel();
        companySamsung.setId(2L);
        companySamsung.setCompanyName("Samsung");

        List<CompanyModel> mobileCompanies = new ArrayList<>();
        mobileCompanies.add(companyApple);
        mobileCompanies.add(companySamsung);


        CompanyModel companyFacebook = new CompanyModel();
        companyFacebook.setId(3L);
        companyFacebook.setCompanyName("Facebook");

        CompanyModel companyTwitter = new CompanyModel();
        companyTwitter.setId(4L);
        companyTwitter.setCompanyName("Twitter");

        List<CompanyModel> socialNetworkingCompanies = new ArrayList<>();
        socialNetworkingCompanies.add(companyFacebook);
        socialNetworkingCompanies.add(companyTwitter);

        Map<String, List<CompanyModel>> companies = new HashMap<>();
        companies.put("MobileCompanies", mobileCompanies);
        companies.put("SocialNetworkingCompanies", socialNetworkingCompanies);

        List output = Arrays.asList("Apple", "Samsung", "Facebook", "Twitter");

        return Arrays.asList(new Object[][]{
                {companies, output}
        });
    }


    @Test
    public void testFlatMap() {
        assertThat(company.flatMap(), is(equalTo(outputList)));
    }


}
