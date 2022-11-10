package cyan.simple.apidoc.service.impl;


import cyan.simple.apidoc.domain.entity.CompanyEntity;
import cyan.simple.apidoc.domain.model.Company;
import cyan.simple.apidoc.filter.CompanyFilter;
import cyan.simple.apidoc.service.CompanyService;
import io.github.nichetoolkit.rest.RestException;
import io.github.nichetoolkit.rest.helper.OptionalHelper;
import io.github.nichetoolkit.rice.RiceInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;


/**
 * <p>CompanyServiceImpl</p>
 * @author Cyan (snow22314@outlook.com)
 * @version v1.0.0
 */
@Slf4j
@Service
public class CompanyServiceImpl extends RiceInfoService<Company, CompanyEntity, CompanyFilter> implements CompanyService {

    @Override
    protected Boolean isModelUnique() {
        return true;
    }

    @Override
    protected void fieldRepeat(Boolean existByModel, Company model) throws RestException {
        OptionalHelper.fieldRepeat(existByModel,model.getName() + " 或者 " + model.getCode(),"名称或编码参数已存在!");
    }

    @Override
    protected void optionalInit(@NonNull Company model) throws RestException {
        OptionalHelper.fieldable(model.getCode(), "公司编码参数不能为空！","code");
    }

    @Override
    public String queryWhereSql(CompanyFilter filter) throws RestException {
        return filter.toCodeSql("code").toQuerySql(this,"logic_sign").toNameSql("name")
                .toJsonbSql("properties").toTimeSql("regdate").toIdSql().addSorts("update_time").toSql();
    }
}
