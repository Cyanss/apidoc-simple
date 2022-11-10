
/**
 * @apiDefine SuccessResponse Success[成功响应结果]
 * @apiSuccess (SuccessResponse) {Integer} status 响应状态码
 * @apiSuccess (SuccessResponse) {String} message 返回信息
 * @apiSuccess (SuccessResponse) {Object} data 返回数据,为空时不显示
 * @apiSuccess (SuccessResponse) {Date} time 时间信息
 */

/**
 * @apiDefine ErrorResponse Error[错误响应结果]
 * @apiError (ErrorResponse) {Integer} status Error状态码
 * @apiError (ErrorResponse) {String} message 返回信息
 * @apiError (ErrorResponse) {Object} data 返回数据,为空时不显示
 * @apiError (ErrorResponse) {Object} error 详细错误
 * @apiError (ErrorResponse) {Date} time 时间信息
 */

/**
 * @apiDefine DefaultHeader DefaultHeader[默认请求头]
 * @apiHeader (DefaultHeader) {String} Content-Type=application/json 多媒体类型
 * @apiHeader (DefaultHeader) {String} Charset=UTF-8 字符编码
 */

/**
 * @apiDefine SortType SortType[排序类型]
 * @apiBody (SortType) {SortType} ASC=1 升序
 * @apiBody (SortType) {SortType} DESC=2 降序
 */

/**
 * @api {DESC} / 排序类型[SortType]
 * @apiVersion 0.1.0
 * @apiName SortType
 * @apiGroup RestEnum [Rest枚举]
 * @apiDescription [排序类型] 排序类型定义排序查询枚举信息
 * @apiUse SortType
 */

/**
 * @apiDefine ContrastOperation ContrastOperation[对比操作]
 * @apiBody (ContrastOperation) {ContrastOperation} EQUAL_OPERATION=1 相等
 * @apiBody (ContrastOperation) {ContrastOperation} GREATER_OPERATION=2 大于
 * @apiBody (ContrastOperation) {ContrastOperation} GREATER_EQUAL_OPERATION=3 大于等于
 * @apiBody (ContrastOperation) {ContrastOperation} LESS_OPERATION=4 小于
 * @apiBody (ContrastOperation) {ContrastOperation} LESS_EQUAL_OPERATION=5 小于等于
 * @apiBody (ContrastOperation) {ContrastOperation} UNEQUAL_OPERATION=6 不等于     
 */

/**
 * @api {DESC} / 对比操作[ContrastOperation]
 * @apiVersion 0.1.0
 * @apiName ContrastOperation
 * @apiGroup JsonbEnum [Jsonb枚举]
 * @apiDescription [对比操作] 对比操作定义对比操作信息
 * @apiUse ContrastOperation
 */

/**
 * @apiDefine EqualOperation EqualOperation[相等操作]
 * @apiBody (EqualOperation) {EqualOperation} EQUAL_OPERATION=1 相等
 * @apiBody (EqualOperation) {EqualOperation} LEFT_LIKE_OPERATION=2 左模糊
 * @apiBody (EqualOperation) {EqualOperation} RIGHT_LIKE_OPERATION=3 右模糊
 * @apiBody (EqualOperation) {EqualOperation} ALL_LIKE_OPERATION=4 全模糊
 * @apiBody (EqualOperation) {EqualOperation} NOT_NULL_OPERATION=5 不为空
 */

/**
 * @api {DESC} / 相等操作[EqualOperation]
 * @apiVersion 0.1.0
 * @apiName EqualOperation
 * @apiGroup JsonbEnum [Jsonb枚举]
 * @apiDescription [相等操作] 相等操作定义相等操作信息
 * @apiUse EqualOperation
 */

/**
 * @apiDefine RangeOperation RangeOperation[范围操作]
 * @apiBody (RangeOperation) {RangeOperation} GREATER_EQUAL_LESS_EQUAL_OPERATION=1 大于等于且小于等于
 * @apiBody (RangeOperation) {RangeOperation} GREATER_EQUAL_LESS_OPERATION=2 大于等于且小于
 * @apiBody (RangeOperation) {RangeOperation} GREATER_LESS_EQUAL_OPERATION=3 大于且小于等于
 * @apiBody (RangeOperation) {RangeOperation} GREATER_LESS_OPERATION=4 大于且小于
 */

/**
 * @api {DESC} / 范围操作[RangeOperation]
 * @apiVersion 0.1.0
 * @apiName RangeOperation
 * @apiGroup JsonbEnum [Jsonb枚举]
 * @apiDescription [范围操作] 范围操作定义范围操作信息
 * @apiUse RangeOperation
 */

/**
 * @apiDefine ContrastRule ContrastRule[对比运算规则对象]
 * @apiBody (ContrastRule) {String} name 属性名
 * @apiBody (ContrastRule) {ValueType} type=LONG 属性值类型
 * @apiBody (ContrastRule) {Object} value 属性值
 * @apiBody (ContrastRule) {ContrastOperation} operation=EQUAL_OPERATION 操作
 */

/**
 * @api {DESC} / 对比运算规则对象[ContrastRule]
 * @apiVersion 0.1.0
 * @apiName ContrastRule
 * @apiGroup JsonbRule [Jsonb规则]
 * @apiDescription [对比运算规则对象]
 * @apiUse ContrastRule
 */

/**
 * @apiDefine RangeRule RangeRule[范围运算规则对象]
 * @apiBody (RangeRule) {String} name 属性名
 * @apiBody (RangeRule) {ValueType} type=STRING 属性值类型
 * @apiBody (RangeRule) {Object} startValue 属性开始值
 * @apiBody (RangeRule) {Object} endValue 属性结束值
 * @apiBody (RangeRule) {ContrastOperation} operation=GREATER_EQUAL_LESS_EQUAL_OPERATION 计算操作
 */

/**
 * @api {DESC} / 范围运算规则对象[RangeRule]
 * @apiVersion 0.1.0
 * @apiName RangeRule
 * @apiGroup JsonbRule [Jsonb规则]
 * @apiDescription [范围运算规则对象]
 * @apiUse RangeRule
 */

/**
 * @apiDefine EqualRule EqualRule[比较模糊运算规则对象]
 * @apiBody (EqualRule) {String} name 属性名
 * @apiBody (EqualRule) {ValueType} type=STRING 属性值类型
 * @apiBody (EqualRule) {Object} value 属性值
 * @apiBody (EqualRule) {ContrastOperation} operation=EQUAL_OPERATION 计算操作
 */

/**
 * @api {DESC} / 比较模糊运算规则对象[EqualRule]
 * @apiVersion 0.1.0
 * @apiName EqualRule
 * @apiGroup JsonbRule [Jsonb规则]
 * @apiDescription [比较模糊运算规则对象]
 * @apiUse EqualRule
 */

/**
 * @apiDefine ContainRule ContainRule[包含运算规则对象]
 * @apiBody (ContainRule) {String} name 属性名
 * @apiBody (ContainRule) {ValueType} type=LONG 属性值类型
 * @apiBody (ContainRule) {Set} values 属性值运算范围 `Set<Object>`
 */

/**
 * @api {DESC} / 包含运算规则对象[ContainRule]
 * @apiVersion 0.1.0
 * @apiName ContainRule
 * @apiGroup JsonbRule [Jsonb规则]
 * @apiDescription [包含运算规则对象]
 * @apiUse ContainRule
 */

/**
 * @apiDefine RestPage RestPage[分页对象]
 * @apiBody (RestPage) {Long} totals 总数据量
 * @apiBody (RestPage) {Long} pages 总页数
 * @apiBody (RestPage) {Long} pageNum 当前页码
 * @apiBody (RestPage) {Long} pageSize 页码大小
 * @apiBody (RestPage) {Long} itemSize 当前页码大小
 * @apiBody (RestPage) {List} items 数据集合 `List<Object>`
 */

/**
 * @apiDefine RestPageResponse RestPage[分页响应对象]
 * @apiSuccess (RestPageResponse) {Long} totals 总数据量
 * @apiSuccess (RestPageResponse) {Long} pages 总页数
 * @apiSuccess (RestPageResponse) {Long} pageNum 当前页码
 * @apiSuccess (RestPageResponse) {Long} pageSize 页码大小
 * @apiSuccess (RestPageResponse) {Long} itemSize 当前页码大小
 * @apiSuccess (RestPageResponse) {List} items 数据集合 `List<Object>`
 */

/**
 * @api {DESC} / 分页对象[RestPage]
 * @apiVersion 0.1.0
 * @apiName RestPage
 * @apiGroup RestObject [Rest对象]
 * @apiDescription [分页对象] 分页对象传输分页查询数据
 * @apiUse RestPage
 */

/**
 * @apiDefine RestSort RestSort[排序对象]
 * @apiBody (RestSort) {String} name 排序字段名称
 * @apiBody (RestSort) {SortType} type 排序类型
 */

/**
 * @api {DESC} / 排序对象[RestSort]
 * @apiVersion 0.1.0
 * @apiName RestSort
 * @apiGroup RestObject [Rest对象]
 * @apiDescription [排序对象] 排序对象传输排序查询数据
 * @apiUse RestSort
 */

/**
 * @apiDefine Property Property[属性对象]
 * @apiBody (Property) {String} name 属性名称
 * @apiBody (Property) {Object} value 属性值
 */

/**
 * @api {DESC} / 属性对象[Property]
 * @apiVersion 0.1.0
 * @apiName Property
 * @apiGroup RestObject [Rest对象]
 * @apiDescription [属性对象] 属性对象传输属性名称和属性值信息
 * @apiUse Property
 */

/**
 * @apiDefine TimeModel TimeModel[时间模型]
 * @apiBody (TimeModel) {Date} createTime 创建时间
 * @apiBody (TimeModel) {Date} updateTime 更新时间时间 
 */

/**
 * @apiDefine TimeModelResponse TimeModel[时间响应模型]
 * @apiSuccess (TimeModelResponse) {Date} createTime 创建时间
 * @apiSuccess (TimeModelResponse) {Date} updateTime 更新时间时间 
 */

/**
 * @api {DESC} / 时间模型[TimeModel]
 * @apiVersion 0.1.0
 * @apiName TimeModel
 * @apiGroup RestModel [Rest模型]
 * @apiDescription [时间模型] 时间模型传输数据库创建时间和数据库更新时间
 * @apiUse TimeModel
 */

/**
 * @apiDefine IdModel IdModel[编号模型]
 * @apiBody (IdModel) {String} id 对象Id
 */

/**
 * @apiDefine IdModelResponse IdModel[编号响应模型]
 * @apiSuccess (IdModelResponse) {String} id 对象Id
 */

/**
 * @api {DESC} / 编号模型[IdModel]
 * @apiVersion 0.1.0
 * @apiName IdModel
 * @apiGroup RestModel [Rest模型]
 * @apiDescription [编号模型] 编号模型传输数据库数据主键编号
 * @apiUse TimeModel 
 * @apiUse IdModel
 */

/**
 * @apiDefine InfoModel InfoModel[信息模型]
 * @apiBody (InfoModel) {String} name 对象名称
 * @apiBody (InfoModel) {String} description 描述信息
 */

/**
 * @apiDefine InfoModelResponse InfoModel[信息响应模型]
 * @apiSuccess (InfoModelResponse) {String} name 对象名称
 * @apiSuccess (InfoModelResponse) {String} description 描述信息
 */ 

/**
 * @api {DESC} / 信息模型[InfoModel]
 * @apiVersion 0.1.0
 * @apiName InfoModel
 * @apiGroup RestModel [Rest模型]
 * @apiDescription [信息模型] 信息模型传输对象名称和描述信息
 * @apiUse TimeModel 
 * @apiUse IdModel
 * @apiUse InfoModel
 */

/**
 * @apiDefine RiceUsernote RiceUsernote[用户日志对象]
 * @apiBody (RiceUsernote) {String} userId 用户编号
 * @apiBody (RiceUsernote) {Set} targetIds 操作目标对象编号集合 `Set<String>`
 * @apiBody (RiceUsernote) {String} username 用户名
 * @apiBody (RiceUsernote) {String} userAgent 用户代理
 * @apiBody (RiceUsernote) {String} ipAddress 用户ip地址
 * @apiBody (RiceUsernote) {String} requestMethod 请求方式
 * @apiBody (RiceUsernote) {String} requestParams 请求参数
 * @apiBody (RiceUsernote) {String} requestUrl 请求地址
 * @apiBody (RiceUsernote) {String} methodName 方法名称
 * @apiBody (RiceUsernote) {String} mediaType 请求媒介类型
 * @apiBody (RiceUsernote) {Long} responseTime 响应耗费时间
 * @apiBody (RiceUsernote) {Integer} responseStatus 响应状态码
 * @apiBody (RiceUsernote) {String} responseMessage 响应消息
 * @apiBody (RiceUsernote) {String} notelog 日志标题
 * @apiBody (RiceUsernote) {String} userlog 日志信息  
 * @apiBody (RiceUsernote) {Integer} logKey 操作key
 * @apiBody (RiceUsernote) {String} logValue 操作值
 * @apiBody (RiceUsernote) {LogType} logType 日志类型 `LogType`   
 * @apiBody (RiceUsernote) {Date} logTime 日志记录时间              
 */

/**
 * @apiDefine RiceUsernoteResponse RiceUsernote[用户日志响应对象]
 * @apiSuccess (RiceUsernoteResponse) {String} userId 用户编号
 * @apiSuccess (RiceUsernoteResponse) {Set} targetIds 操作目标对象编号集合 `Set<String>`
 * @apiSuccess (RiceUsernoteResponse) {String} username 用户名
 * @apiSuccess (RiceUsernoteResponse) {String} userAgent 用户代理
 * @apiSuccess (RiceUsernoteResponse) {String} ipAddress 用户ip地址
 * @apiSuccess (RiceUsernoteResponse) {String} requestMethod 请求方式
 * @apiSuccess (RiceUsernoteResponse) {String} requestParams 请求参数
 * @apiSuccess (RiceUsernoteResponse) {String} requestUrl 请求地址
 * @apiSuccess (RiceUsernoteResponse) {String} methodName 方法名称
 * @apiSuccess (RiceUsernoteResponse) {String} mediaType 请求媒介类型
 * @apiSuccess (RiceUsernoteResponse) {Long} responseTime 响应耗费时间
 * @apiSuccess (RiceUsernoteResponse) {Integer} responseStatus 响应状态码
 * @apiSuccess (RiceUsernoteResponse) {String} responseMessage 响应消息
 * @apiSuccess (RiceUsernoteResponse) {String} notelog 日志标题
 * @apiSuccess (RiceUsernoteResponse) {String} userlog 日志信息  
 * @apiSuccess (RiceUsernoteResponse) {Integer} logKey 操作key
 * @apiSuccess (RiceUsernoteResponse) {String} logValue 操作值
 * @apiSuccess (RiceUsernoteResponse) {LogType} logType 日志类型 `LogType`   
 * @apiSuccess (RiceUsernoteResponse) {Date} logTime 日志记录时间              
 */ 

/**
 * @api {DESC} / 用户日志对象[RiceUsernote]
 * @apiVersion 0.1.0
 * @apiName RiceUsernote
 * @apiGroup RiceObject [Rice对象]
 * @apiDescription [用户日志对象] 用户日志对象传输用户日志信息
 * @apiUse TimeModel 
 * @apiUse IdModel
 * @apiUse RiceUsernote
 */


/**
 * @apiDefine Company Company[公司对象]
 * @apiBody (Company) {String} logo 公司logo图
 * @apiBody (Company) {String} telephone 公司电话 
 * @apiBody (Company) {String} email 公司邮箱
 * @apiBody (Company) {String} address 公司详细地址
 */

/**
 * @apiDefine CompanyResponse Company[公司响应对象]
 * @apiSuccess (CompanyResponse) {String} logo 公司logo图
 * @apiSuccess (CompanyResponse) {String} telephone 公司电话 
 * @apiSuccess (CompanyResponse) {String} email 公司邮箱
 * @apiSuccess (CompanyResponse) {String} address 公司详细地址 
 */

/**
 * @api {DESC} / 公司对象[Company]
 * @apiVersion 0.1.0
 * @apiName Company
 * @apiGroup ProjectObject [项目对象]
 * @apiDescription [公司对象] 公司对象传输公司相关信息
 * @apiUse TimeModel 
 * @apiUse IdModel
 * @apiUse InfoModel
 * @apiUse Company 
 */



/**
 * @apiDefine PageFilter PageFilter[分页过滤器]
 * @apiBody (PageFilter) {Integer} pageNum=1 页码，默认为第一页
 * @apiBody (PageFilter) {Integer} pageSize=0 页面大小,默认为0时查询所有数据
 */

/**
 * @api {DESC} / 分页过滤器[PageFilter]
 * @apiVersion 0.1.0
 * @apiName PageFilter
 * @apiGroup RestFilter [Rest过滤器]
 * @apiDescription [分页过滤器] 用于输排分页数据进行过滤查询
 * @apiUse PageFilter
 */

/**
 * @apiDefine SortFilter SortFilter[排序过滤器]
 * @apiBody (SortFilter) {Set} sorts 排序字段集合 `Set<RestSort>`
 */

/**
 * @api {DESC} / 排序过滤器[SortFilter]
 * @apiVersion 0.1.0
 * @apiName SortFilter
 * @apiGroup RestFilter [Rest过滤器]
 * @apiDescription [排序过滤器] 用于传输排序数据对字段进行过滤查询
 * @apiUse PageFilter
 * @apiUse SortFilter
 */

/**
 * @apiDefine IdFilter IdFilter[Id过滤器]
 * @apiBody (IdFilter) {String} id 通过id查询
 * @apiBody (IdFilter) {Set} ids 通过ids集合查询  `Set<String>`
 */

/**
 * @api {DESC} / Id过滤器[IdFilter]
 * @apiVersion 0.1.0
 * @apiName IdFilter
 * @apiGroup RestFilter [Rest过滤器]
 * @apiDescription [Id过滤器] 用于传输id编号数据过滤查询
 * @apiUse PageFilter
 * @apiUse SortFilter
 * @apiUse IdFilter
 */

/**
 * @apiDefine TimeFilter TimeFilter[时间过滤器]
 * @apiBody (TimeFilter) {Date} startTime 开始时间
 * @apiBody (TimeFilter) {Date} endTime 结束时间
 */

/**
 * @api {DESC} / 时间过滤器[TimeFilter]
 * @apiVersion 0.1.0
 * @apiName TimeFilter
 * @apiGroup RestFilter [Rest过滤器]
 * @apiDescription [时间过滤器] 用于传输时间范围数据过滤查询
 * @apiUse PageFilter
 * @apiUse SortFilter
 * @apiUse IdFilter
 * @apiUse TimeFilter
 */

/**
 * @apiDefine JsonbFilter JsonbFilter[Jsonb过滤器]
 * @apiBody (JsonbFilter) {Set} contrasts 数值型对比运算集合 `Set<ContrastRule>`
 * @apiBody (JsonbFilter) {Set} ranges 数值型范围对比运算集合 `Set<RangeRule>`
 * @apiBody (JsonbFilter) {Set} equals 字符串型比较模糊运算集合 `Set<EqualRule>`
 * @apiBody (JsonbFilter) {Set} contains 包含运算集合 `Set<ContainRule>`
 */

/**
 * @api {DESC} / Jsonb过滤器[JsonbFilter]
 * @apiVersion 0.1.0
 * @apiName JsonbFilter
 * @apiGroup RestFilter [Rest过滤器]
 * @apiDescription [Jsonb过滤器] 用于传输jsonb格式的数据进行属性过滤
 * @apiUse PageFilter
 * @apiUse SortFilter
 * @apiUse IdFilter
 * @apiUse TimeFilter
 * @apiUse JsonbFilter
 */

/**
 * @apiDefine NameFilter NameFilter[名称过滤器]
 * @apiBody (NameFilter) {String} name 单个名称模糊查询
 * @apiBody (NameFilter) {Set} names 名称等值查询 `Set<String>`
 */

/**
 * @api {DESC} / 名称过滤器[NameFilter]
 * @apiVersion 0.1.0
 * @apiName NameFilter
 * @apiGroup RestFilter [Rest过滤器]
 * @apiDescription [名称过滤器] 用于传输数据名称过滤查询
 * @apiUse PageFilter
 * @apiUse SortFilter
 * @apiUse IdFilter
 * @apiUse TimeFilter
 * @apiUse NameFilter
 */

/**
 * @apiDefine ValidStatusFilter ValidStatusFilter[有效状态过滤器]
 * @apiBody (ValidStatusFilter) {String} projectId 项目编号过滤查询
 * @apiBody (ValidStatusFilter) {String} userId 用户编号过滤查询  
 * @apiBody (ValidStatusFilter) {Set} userIds 用户编号集合过滤查询 `Set<String>`
 * @apiBody (ValidStatusFilter) {ValidStatus} validStatus 是否有效状态过滤查询 `ValidStatus`
 * @apiBody (ValidStatusFilter) {Boolean} loadValid=true 是否加载有效数据
 * @apiBody (ValidStatusFilter) {Boolean} loadUser=false 是否加载用户信息   
 */

/**
 * @api {DESC} / 有效状态过滤器[ValidStatusFilter]
 * @apiVersion 0.1.0
 * @apiName ValidStatusFilter
 * @apiGroup WbgpmFilter [Wbgpm过滤器]
 * @apiDescription [有效状态过滤器] 用于传输有效状态数据进行过滤查询
 * @apiUse PageFilter
 * @apiUse SortFilter
 * @apiUse IdFilter
 * @apiUse TimeFilter
 * @apiUse NameFilter 
 * @apiUse ValidStatusFilter
 */


/**
 * @api {GET} /simple/api/v0.1.0/hello Hello测试接口[Hello]
 * @apiVersion 0.1.0
 * @apiName HelloTest
 * @apiGroup HelloController [Hello接口]
 * @apiDescription [Hello测试接口] Hello测试接口,用于服务器部署测试
 * @apiSampleRequest /simple/api/v0.1.0/hello
 * @apiUse DefaultHeader 
 * @apiUse SuccessResponse
 * @apiUse ErrorResponse   
 * @apiSampleRequest /simple/api/v0.1.0/hello
 * @apiParamExample {curl} 200-RequestPath[测试成功请求路径示例]:

   @Shell:
   curl -I http://127.0.0.1:8081/simple/api/v0.1.0/hello -H 'Content-Type: application/json' -H 'Charset: UTF-8'

   @PowerShell:
   curl -Headers @{"Content-Type"="application/json";"Charset"="UTF-8"} http://127.0.0.1:8081/simple/api/v0.1.0/hello
 
 * @apiSuccessExample {json} 200-SuccessResponse[测试成功响应示例]:
{
    "status": 200,
    "message": "Hello, Wbgpm Server!",
    "time": "2022-04-25 11:09:12"
}
 *
 */

