package cyan.simple.apidoc.mapper;

import cyan.simple.apidoc.domain.entity.CompanyEntity;
import io.github.nichetoolkit.rice.RiceInfoMapper;
import io.github.nichetoolkit.rice.mapper.RemoveMapper;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

@Component
public interface CompanyMapper extends RiceInfoMapper<CompanyEntity>, RemoveMapper<String>, Mapper<CompanyEntity> {

}
