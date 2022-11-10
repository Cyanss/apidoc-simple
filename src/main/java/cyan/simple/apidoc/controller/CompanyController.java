package cyan.simple.apidoc.controller;


import cyan.simple.apidoc.domain.model.Company;
import cyan.simple.apidoc.filter.CompanyFilter;
import cyan.simple.apidoc.service.CompanyService;
import io.github.nichetoolkit.rest.RestException;
import io.github.nichetoolkit.rest.RestResult;
import io.github.nichetoolkit.rest.userlog.LogType;
import io.github.nichetoolkit.rest.userlog.stereotype.RestNotelog;
import io.github.nichetoolkit.rest.userlog.stereotype.RestUserlog;
import io.github.nichetoolkit.rice.RestPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.List;

/**
 * <p>CompanyController</p>
 * @author Cyan (snow22314@outlook.com)
 * @version v1.0.0
 */
@CrossOrigin
@RestController
@RestNotelog("公司信息")
@RequestMapping("/simple/api/v0.1.0/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @PostMapping("/create")
    @RestUserlog(logType = LogType.CREATE)
    public ResponseEntity<RestResult<Company>> create(@RequestBody Company company) throws RestException {
        return RestResult.ok(companyService.create(company));
    }

    @PostMapping("/update")
    @RestUserlog(logType = LogType.UPDATE)
    public ResponseEntity<RestResult<Company>> update(@RequestBody Company company) throws RestException {
        return RestResult.ok(companyService.update(company));
    }

    @PostMapping("/saveAll")
    @RestUserlog(logType = LogType.SAVE_ALL)
    public ResponseEntity<RestResult<List<Company>>> saveAll(@RequestBody Collection<Company> companies) throws RestException {
        return RestResult.ok(companyService.saveAll(companies));
    }

    @GetMapping("/query/{id}")
    public ResponseEntity<RestResult<Company>> queryById(@PathVariable("id") String id) throws RestException {
        Company company = companyService.queryById(id);
        return RestResult.ok(company);
    }
    
    @PostMapping("/query/filter")
    public ResponseEntity<RestResult<RestPage<Company>>> queryByFilter(@RequestBody CompanyFilter filter) throws RestException {
        RestPage<Company> restPage = companyService.queryAllWithFilter(filter);
        return RestResult.ok(restPage);
    }
    
    @DeleteMapping("/delete")
    @RestUserlog(logType = LogType.DELETE)
    public ResponseEntity deleteById(@RequestParam("id") String id) throws RestException {
        companyService.deleteById(id);
        return RestResult.ok();
    }

    @PostMapping("/delete/filter")
    @RestUserlog(logType = LogType.DELETE_FILTER)
    public ResponseEntity deleteByFilter(@RequestBody CompanyFilter filter) throws RestException {
        companyService.deleteAllWithFilter(filter);
        return RestResult.ok();
    }
    
}
