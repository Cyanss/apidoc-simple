package cyan.simple.apidoc.domain.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import cyan.simple.apidoc.domain.model.Company;
import io.github.nichetoolkit.rest.util.BeanUtils;
import io.github.nichetoolkit.rice.RiceInfoEntity;
import io.github.nichetoolkit.rice.helper.PropertyHelper;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * <p>CompanyEntity</p>
 * @author Cyan (snow22314@outlook.com)
 * @version v1.0.0
 */
@Data
@TableName("company")
@EqualsAndHashCode(callSuper = true)
public class CompanyEntity extends RiceInfoEntity<CompanyEntity, Company> {
    /** 公司编码 */
    private String code;
    /** 公司电话 */
    private String telephone;
    /** 公司邮箱 */
    private String email;
    /** 公司详细地址 */
    private String address;
    /** 公司注册时间 */
    private Date regdate;
    /** 公司其他属性 */
    private String properties;

    @Override
    public Company toModel() {
        Company model = new Company();
        BeanUtils.copyNonullProperties(this, model);
        model.setProperties(PropertyHelper.toPropertiesList(this.properties));
        return model;
    }
}
