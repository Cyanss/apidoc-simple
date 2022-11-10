package cyan.simple.apidoc.service;

import cyan.simple.apidoc.domain.model.Company;
import cyan.simple.apidoc.filter.CompanyFilter;
import io.github.nichetoolkit.rice.service.FilterService;
import io.github.nichetoolkit.rice.service.extend.SingleService;

/**
 * <p>CompanyService</p>
 * @author Cyan (snow22314@outlook.com)
 * @version v1.0.0
 */
public interface CompanyService extends FilterService<String, Company, CompanyFilter>, SingleService<String,Company> {
}
