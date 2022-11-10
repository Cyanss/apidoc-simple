package cyan.simple.apidoc.domain.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import cyan.simple.apidoc.domain.entity.CompanyEntity;
import io.github.nichetoolkit.rest.util.BeanUtils;
import io.github.nichetoolkit.rest.util.GeneralUtils;
import io.github.nichetoolkit.rice.RiceInfoModel;
import io.github.nichetoolkit.rice.helper.PropertyHelper;
import io.github.nichetoolkit.rice.jsonb.Property;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.*;

/**
 * <p>Company</p>
 * @author Cyan (snow22314@outlook.com)
 * @version v1.0.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
@JsonInclude(value= JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Company extends RiceInfoModel<Company, CompanyEntity> {
    /** 公司编码 */
    private String code;
    /** 公司电话 */
    private String telephone;
    /** 公司邮箱 */
    private String email;
    /** 公司详细地址 */
    private String address;
    /** 公司注册时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date regdate;
    /** 公司其他属性 */
    private Set<Property> properties;

    public List<Property> getProperties() {
        if (GeneralUtils.isNotEmpty(properties)) {
            return new ArrayList<>(properties);
        }
        return null;
    }

    public void setProperties(Property... properties) {
        this.properties = Optional.ofNullable(properties).map(propertyList -> new HashSet<>(Arrays.asList(propertyList))).orElse(null);
    }

    @JsonSetter
    public void setProperties(Collection<Property> properties) {
        this.properties = Optional.ofNullable(properties).map(HashSet::new).orElse(null);
    }

    public void addProperties(Property... properties) {
        if (GeneralUtils.isEmpty(this.properties)) {
            this.properties = Optional.ofNullable(properties).map(propertyList -> new HashSet<>(Arrays.asList(propertyList))).orElse(null);
        } else {
            Optional.ofNullable(properties).ifPresent(propertyList -> this.properties.addAll(Arrays.asList(propertyList)));
        }
    }

    public void addProperties(Collection<Property> properties) {
        if (GeneralUtils.isEmpty(this.properties)) {
            this.properties = Optional.ofNullable(properties).map(HashSet::new).orElse(null);
        } else {
            Optional.ofNullable(properties).ifPresent(this.properties::addAll);
        }
    }

    @Override
    public CompanyEntity toEntity() {
        CompanyEntity entity = new CompanyEntity();
        BeanUtils.copyNonullProperties(this,entity);
        entity.setProperties(PropertyHelper.toPropertiesJson(this.properties));
        return entity;
    }
}
