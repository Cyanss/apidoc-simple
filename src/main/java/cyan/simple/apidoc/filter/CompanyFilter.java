package cyan.simple.apidoc.filter;

import io.github.nichetoolkit.rest.util.GeneralUtils;
import io.github.nichetoolkit.rice.RiceFilter;
import io.github.nichetoolkit.rice.builder.SqlBuilders;
import lombok.NonNull;

/**
 * <p>CompanyFilter</p>
 * @author Cyan (snow22314@outlook.com)
 * @version v1.0.0
 */
public class CompanyFilter extends RiceFilter {
    private String code;

    public CompanyFilter() {
    }

    public CompanyFilter(String id) {
        super(id);
    }

    public CompanyFilter(String... ids) {
        super(ids);
    }


    public CompanyFilter toCodeSql(@NonNull String alias) {
        if (GeneralUtils.isNotEmpty(this.code)) {
            SqlBuilders.equal(SQL_BUILDER, alias, this.code);
        }
        return this;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
