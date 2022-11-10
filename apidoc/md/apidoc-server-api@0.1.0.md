<!DOCTYPE html>
<a name="top"></a>

Cyan (snow22314@outlook.com)

# Apidoc Simple Server Api v0.1.0

Apidoc simple project for Spring Boot Api


# 目录[catalog]


- 1、 [CompanyController](#CompanyController)

  - 1.1、[公司信息创建[Create]](#公司信息创建[Create])

  - 1.2、[公司信息单个查询[QueryId]](#公司信息单个查询[QueryId])

  - 1.3、[公司信息单个删除[DeleteId]](#公司信息单个删除[DeleteId])

  - 1.4、[公司信息更新[Update]](#公司信息更新[Update])

  - 1.5、[公司信息过滤器查询[QueryFilter]](#公司信息过滤器查询[QueryFilter])

  - 1.6、[公司信息过滤器删除[DeleteFilter]](#公司信息过滤器删除[DeleteFilter])

  - 1.7、[公司信息批量保存[SaveAll]](#公司信息批量保存[SaveAll])

- 2、 [HelloController](#HelloController_Hello)

  - 2.1、[Hello测试接口[Hello]](#Hello测试接口[Hello])

- 3、 [JsonbEnum](#JsonbEnum_Jsonb)

  - 3.1、[对比操作[ContrastOperation]](#对比操作[ContrastOperation])

  - 3.2、[范围操作[RangeOperation]](#范围操作[RangeOperation])

  - 3.3、[相等操作[EqualOperation]](#相等操作[EqualOperation])

- 4、 [JsonbRule](#JsonbRule_Jsonb)

  - 4.1、[包含运算规则对象[ContainRule]](#包含运算规则对象[ContainRule])

  - 4.2、[比较模糊运算规则对象[EqualRule]](#比较模糊运算规则对象[EqualRule])

  - 4.3、[对比运算规则对象[ContrastRule]](#对比运算规则对象[ContrastRule])

  - 4.4、[范围运算规则对象[RangeRule]](#范围运算规则对象[RangeRule])

- 5、 [ProjectObject](#ProjectObject_)

  - 5.1、[公司对象[Company]](#公司对象[Company])

- 6、 [RestEnum](#RestEnum_Rest)

  - 6.1、[排序类型[SortType]](#排序类型[SortType])

- 7、 [RestFilter](#RestFilter_Rest)

  - 7.1、[分页过滤器[PageFilter]](#分页过滤器[PageFilter])

  - 7.2、[名称过滤器[NameFilter]](#名称过滤器[NameFilter])

  - 7.3、[排序过滤器[SortFilter]](#排序过滤器[SortFilter])

  - 7.4、[时间过滤器[TimeFilter]](#时间过滤器[TimeFilter])

  - 7.5、[Id过滤器[IdFilter]](#Id过滤器[IdFilter])

  - 7.6、[Jsonb过滤器[JsonbFilter]](#Jsonb过滤器[JsonbFilter])

- 8、 [RestModel](#RestModel_Rest)

  - 8.1、[编号模型[IdModel]](#编号模型[IdModel])

  - 8.2、[时间模型[TimeModel]](#时间模型[TimeModel])

  - 8.3、[信息模型[InfoModel]](#信息模型[InfoModel])

- 9、 [RestObject](#RestObject_Rest)

  - 9.1、[分页对象[RestPage]](#分页对象[RestPage])

  - 9.2、[排序对象[RestSort]](#排序对象[RestSort])

  - 9.3、[属性对象[Property]](#属性对象[Property])

- 10、 [RiceObject](#RiceObject_Rice)

  - 10.1、[用户日志对象[RiceUsernote]](#用户日志对象[RiceUsernote])

- 11、 [SimpleFilter](#SimpleFilter_Simple)

  - 11.1、[公司信息过滤器[CompanyFilter]](#公司信息过滤器[CompanyFilter])

___


<!DOCTYPE html>
<a name='CompanyController'></a>

# 1、CompanyController
<!DOCTYPE html>
<a name='公司信息创建[Create]'></a>

## 1.1、公司信息创建[Create]

[返回顶部[Back to top]](#top)

[公司信息创建] 公司信息创建接口，用于用户创建公司信息操作

```json
POST /simple/api/v0.1.0/company/create
```

### 标头[Headers]

####  1、Header - `DefaultHeader[默认请求头]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                          |
|---------|---------|-----------|--------------------------------------|
| 1 | Content-Type | `String` | 多媒体类型 |
| 2 | Charset | `String` | 字符编码 |

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| createTime | `Date` | 创建时间 |
| 2| updateTime | `Date` | 更新时间时间 |
| 3| id | `String` | 对象Id |
| 4| name | `String` | 对象名称 |
| 5| description | `String` | 描述信息 |
| 6| code | `String` | 公司编码 |
| 7| telephone | `String` | 公司电话 |
| 8| email | `String` | 公司邮箱 |
| 9| address | `String` | 公司详细地址 |
| 10| regdate | `String` | 公司注册时间 |
| 11| properties | `Set` | 公司其他属性 <code>Set&lt;Property&gt;</code> |

### 参数示例[Parameters examples]
`json` - 200-RequestBody[公司信息创建成功参数示例]:
```json
{
    "name": "公司信息测试001",
    "description": "公司信息测试001 创建测试",
    "code": "GS21562884-001",
    "payCode": "ZF115121541-001",
    "telephone": "0397-2135564",
    "email": "gs001@test.com",
    "address": "某某省某某市某某区某某街道001号",
    "regdate": "2022-01-01 09:00:00",
    "properties": [
        {
            "name": "level",
            "value": 5
        }
    ]
}
```
`json` - 10501-RequestBody[名称参数错误参数示例]:
```json
{
    "description": "公司信息测试001 创建测试",
    "code": "GS21562884-001",
    "payCode": "ZF115121541-001",
    "telephone": "0397-2135564",
    "email": "gs001@test.com",
    "address": "某某省某某市某某区某某街道001号",
    "regdate": "2022-01-01 09:00:00",
    "properties": [
        {
            "name": "level",
            "value": 5
        }
    ]
}
```
`json` - 10521-RequestBody[公司编码参数错误参数示例]:
```json
{
    "name": "公司信息测试001",
    "description": "公司信息测试001 创建测试",
    "payCode": "ZF115121541-001",
    "telephone": "0397-2135564",
    "email": "gs001@test.com",
    "address": "某某省某某市某某区某某街道001号",
    "regdate": "2022-01-01 09:00:00",
    "properties": [
        {
            "name": "level",
            "value": 5
        }
    ]
}
```

### 成功响应[Success response]

#### 1、Success response - `Success[成功响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | 响应状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | time | `Date` | 时间信息 |

#### 2、Success response - `TimeModel[时间响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | createTime | `Date` | 创建时间 |
| 2 | updateTime | `Date` | 更新时间时间 |

#### 3、Success response - `IdModel[编号响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | id | `String` | 对象Id |

#### 4、Success response - `InfoModel[信息响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | name | `String` | 对象名称 |
| 2 | description | `String` | 描述信息 |

#### 5、Success response - `Company[公司响应对象]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | code | `String` | 公司编码 |
| 2 | telephone | `String` | 公司电话 |
| 3 | email | `String` | 公司邮箱 |
| 4 | address | `String` | 公司详细地址 |
| 5 | regdate | `String` | 公司注册时间 |
| 6 | properties | `Set` | 公司其他属性 <code>Set&lt;Property&gt;</code> |

### 成功响应示例[Success response example]

#### 1、Success response example - `200-SuccessResponse[公司信息创建成功响应示例]:`
```json
{
    "status": 200,
    "message": "成功",
    "data": {
        "logicSign": "1",
        "id": "1590640746569142272",
        "name": "公司信息测试001",
        "description": "公司信息测试001 创建测试",
        "code": "GS21562884-001",
        "telephone": "0397-2135564",
        "email": "gs001@test.com",
        "address": "某某省某某市某某区某某街道001号",
        "regdate": "2022-01-01 09:00:00",
        "properties": [
            {
                "name": "level",
                "value": 5
            }
        ]
    },
    "time": "2022-11-10 17:41:21"
}
```

### 错误响应[Error response]

#### 1、 Error response - `Error[错误响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | Error状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | error | `Object` | 详细错误 |
| 5 | time | `Date` | 时间信息 |

### 错误响应示例[Error response example]

#### 1、Error response example - `10501-ErrorResponse[名称参数错误响应示例]:`
```json
{
    "status": 10501,
    "message": "名称不能为空！",
    "data": {
        "resource": "Field",
        "issues": [
            {
                "field": "Field",
                "issue": "名称不能为空！",
                "status": 10501,
                "message": "名称不能为空！"
            }
        ],
        "name": "FIELD_IS_NULL",
        "status": 10501,
        "message": "名称不能为空！"
    }
}
```

#### 2、Error response example - `10521-ErrorResponse[公司编码参数错误响应示例]:`
```json
{
    "status": 10501,
    "message": "公司编码参数不能为空！",
    "data": {
        "resource": "code",
        "issues": [
            {
                "field": "code",
                "issue": "公司编码参数不能为空！",
                "status": 10501,
                "message": "公司编码参数不能为空！"
            }
        ],
        "name": "FIELD_IS_NULL",
        "status": 10501,
        "message": "公司编码参数不能为空！"
    }
}
```

<!DOCTYPE html>
<a name='公司信息单个查询[QueryId]'></a>

## 1.2、公司信息单个查询[QueryId]

[返回顶部[Back to top]](#top)

[公司信息单个查询] 公司信息单个查询接口，用于通过公司信息编号进行查询操作

```json
GET /simple/api/v0.1.0/company/query/:id
```

### 标头[Headers]

####  1、Header - `DefaultHeader[默认请求头]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                          |
|---------|---------|-----------|--------------------------------------|
| 1 | Content-Type | `String` | 多媒体类型 |
| 2 | Charset | `String` | 字符编码 |

### 参数[Parameters] 

####  1、Parameter -  `CompanyQueryId[公司信息查询]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | id | `String` | 公司信息编号_默认值[Default]: 1590640746569142272_<br> |

### 参数示例[Parameters examples]
`curl` - 200-RequestPath[公司信息查询成功请求路径示例]:
```curl

@Shell:
curl -I http://127.0.0.1:8081/simple/api/v0.1.0/company/query/1590640746569142272  -H 'Content-Type: application/json' -H 'Charset: UTF-8'

@PowerShell:
curl -Headers @{"Content-Type"="application/json";"Charset"="UTF-8"} http://127.0.0.1:8081/simple/api/v0.1.0/company/query/1590640746569142272
```
`curl` - 200-RequestPath[公司信息不存在查询成功请求路径示例]:
```curl

@Shell:
curl -I http://127.0.0.1:8081/simple/api/v0.1.0/company/query/1587009423619133441 -H 'Content-Type: application/json' -H 'Charset: UTF-8'

@PowerShell:
curl -Headers @{"Content-Type"="application/json";"Charset"="UTF-8"} http://127.0.0.1:8081/simple/api/v0.1.0/company/query/1587009423619133441
```

### 成功响应[Success response]

#### 1、Success response - `Success[成功响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | 响应状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | time | `Date` | 时间信息 |

#### 2、Success response - `TimeModel[时间响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | createTime | `Date` | 创建时间 |
| 2 | updateTime | `Date` | 更新时间时间 |

#### 3、Success response - `IdModel[编号响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | id | `String` | 对象Id |

#### 4、Success response - `InfoModel[信息响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | name | `String` | 对象名称 |
| 2 | description | `String` | 描述信息 |

#### 5、Success response - `Company[公司响应对象]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | code | `String` | 公司编码 |
| 2 | telephone | `String` | 公司电话 |
| 3 | email | `String` | 公司邮箱 |
| 4 | address | `String` | 公司详细地址 |
| 5 | regdate | `String` | 公司注册时间 |
| 6 | properties | `Set` | 公司其他属性 <code>Set&lt;Property&gt;</code> |

### 成功响应示例[Success response example]

#### 1、Success response example - `200-SuccessResponse[公司信息查询成功响应示例]:`
```json
{
    "status": 200,
    "message": "成功",
    "data": {
        "logicSign": "1",
        "createTime": "2022-11-10 17:41:21",
        "updateTime": "2022-11-10 17:48:15",
        "id": "1590640746569142272",
        "name": "公司信息测试001",
        "description": "公司信息测试001 更新测试",
        "code": "GS21562884-001",
        "telephone": "0397-2135564",
        "email": "gs001@test.com",
        "address": "某某省某某市某某区某某街道001号",
        "regdate": "2022-01-01 09:00:00",
        "properties": [
            {
                "name": "level",
                "value": 5
            }
        ]
    },
    "time": "2022-11-10 17:50:23"
}
```

#### 2、Success response example - `200-SuccessResponse[公司信息不存在查询成功响应示例]:`
```json
{
    "status": 200,
    "message": "成功",
    "time": "2022-11-10 17:52:48"
}
```

### 错误响应[Error response]

#### 1、 Error response - `Error[错误响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | Error状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | error | `Object` | 详细错误 |
| 5 | time | `Date` | 时间信息 |

<!DOCTYPE html>
<a name='公司信息单个删除[DeleteId]'></a>

## 1.3、公司信息单个删除[DeleteId]

[返回顶部[Back to top]](#top)

[公司信息单个删除] 公司信息单个删除接口，用于通过公司信息编号进行单个删除操作

```json
DELETE /simple/api/v0.1.0/company/delete
```

### 标头[Headers]

####  1、Header - `DefaultHeader[默认请求头]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                          |
|---------|---------|-----------|--------------------------------------|
| 1 | Content-Type | `String` | 多媒体类型 |
| 2 | Charset | `String` | 字符编码 |

### 请求参数[Query Parameters]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | id | `String` | 公司信息编号_默认值[Default]: 1590640746569142272_<br> |

### 参数示例[Parameters examples]
`curl` - 200-RequestPath[公司信息单个删除成功请求路径示例]:
```curl

@Shell:
curl -I http://127.0.0.1:8081/simple/api/v0.1.0/company/delete?id=1590640746569142272  -H 'Content-Type: application/json' -H 'Charset: UTF-8'

@PowerShell:
curl -Headers @{"Content-Type"="application/json";"Charset"="UTF-8"} http://127.0.0.1:8081/simple/api/v0.1.0/company/delete?id=1590640746569142272
```
`curl` - 200-RequestPath[公司信息不存在单个删除成功请求路径示例]:
```curl

@Shell:
curl -I http://127.0.0.1:8081/simple/api/v0.1.0/company/delete?id=1587009423619133441  -H 'Content-Type: application/json' -H 'Charset: UTF-8'

@PowerShell:
curl -Headers @{"Content-Type"="application/json";"Charset"="UTF-8"} http://127.0.0.1:8081/simple/api/v0.1.0/company/delete?id=1587009423619133441
```

### 成功响应[Success response]

#### 1、Success response - `Success[成功响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | 响应状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | time | `Date` | 时间信息 |

### 成功响应示例[Success response example]

#### 1、Success response example - `200-SuccessResponse[公司信息单个删除成功响应示例]:`
```json
{
    "status": 200,
    "message": "成功",
    "time": "2022-11-10 18:08:16"
}
```

#### 2、Success response example - `200-SuccessResponse[公司信息不存在单个删除成功响应示例]:`
```json
{
    "status": 200,
    "message": "成功",
    "time": "2022-11-10 18:08:36"
}
```

### 错误响应[Error response]

#### 1、 Error response - `Error[错误响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | Error状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | error | `Object` | 详细错误 |
| 5 | time | `Date` | 时间信息 |

<!DOCTYPE html>
<a name='公司信息更新[Update]'></a>

## 1.4、公司信息更新[Update]

[返回顶部[Back to top]](#top)

[公司信息更新] 公司信息更新接口，用于用户更新公司信息操作

```json
POST /simple/api/v0.1.0/company/update
```

### 标头[Headers]

####  1、Header - `DefaultHeader[默认请求头]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                          |
|---------|---------|-----------|--------------------------------------|
| 1 | Content-Type | `String` | 多媒体类型 |
| 2 | Charset | `String` | 字符编码 |

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| createTime | `Date` | 创建时间 |
| 2| updateTime | `Date` | 更新时间时间 |
| 3| id | `String` | 对象Id |
| 4| name | `String` | 对象名称 |
| 5| description | `String` | 描述信息 |
| 6| code | `String` | 公司编码 |
| 7| telephone | `String` | 公司电话 |
| 8| email | `String` | 公司邮箱 |
| 9| address | `String` | 公司详细地址 |
| 10| regdate | `String` | 公司注册时间 |
| 11| properties | `Set` | 公司其他属性 <code>Set&lt;Property&gt;</code> |

### 参数示例[Parameters examples]
`json` - 200-RequestBody[公司信息更新成功参数示例]:
```json
{
    "id": "1590640746569142272",
    "name": "公司信息测试001",
    "description": "公司信息测试001 更新测试",
    "code": "GS21562884-001",
    "payCode": "ZF115121541-001",
    "telephone": "0397-2135564",
    "email": "gs001@test.com",
    "address": "某某省某某市某某区某某街道001号",
    "regdate": "2022-01-01 09:00:00",
    "properties": [
        {
            "name": "level",
            "value": 5
        }
    ]
}
```
`json` - 10521-RequestBody[公司信息编号参数错误参数示例]:
```json
{
    "name": "公司信息测试001",
    "description": "公司信息测试001 更新测试",
    "code": "GS21562884-001",
    "payCode": "ZF115121541-001",
    "telephone": "0397-2135564",
    "email": "gs001@test.com",
    "address": "某某省某某市某某区某某街道001号",
    "regdate": "2022-01-01 09:00:00",
    "properties": [
        {
            "name": "level",
            "value": 5
        }
    ]
}
```

### 成功响应[Success response]

#### 1、Success response - `Success[成功响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | 响应状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | time | `Date` | 时间信息 |

#### 2、Success response - `TimeModel[时间响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | createTime | `Date` | 创建时间 |
| 2 | updateTime | `Date` | 更新时间时间 |

#### 3、Success response - `IdModel[编号响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | id | `String` | 对象Id |

#### 4、Success response - `InfoModel[信息响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | name | `String` | 对象名称 |
| 2 | description | `String` | 描述信息 |

#### 5、Success response - `Company[公司响应对象]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | code | `String` | 公司编码 |
| 2 | telephone | `String` | 公司电话 |
| 3 | email | `String` | 公司邮箱 |
| 4 | address | `String` | 公司详细地址 |
| 5 | regdate | `String` | 公司注册时间 |
| 6 | properties | `Set` | 公司其他属性 <code>Set&lt;Property&gt;</code> |

### 成功响应示例[Success response example]

#### 1、Success response example - `200-SuccessResponse[公司信息更新成功响应示例]:`
```json
{
    "status": 200,
    "message": "成功",
    "data": {
        "id": "1590640746569142272",
        "name": "公司信息测试001",
        "description": "公司信息测试001 更新测试",
        "code": "GS21562884-001",
        "telephone": "0397-2135564",
        "email": "gs001@test.com",
        "address": "某某省某某市某某区某某街道001号",
        "regdate": "2022-01-01 09:00:00",
        "properties": [
            {
                "name": "level",
                "value": 5
            }
        ]
    },
    "time": "2022-11-10 17:44:32"
}
```

### 错误响应[Error response]

#### 1、 Error response - `Error[错误响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | Error状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | error | `Object` | 详细错误 |
| 5 | time | `Date` | 时间信息 |

### 错误响应示例[Error response example]

#### 1、Error response example - `10521-ErrorResponse[公司信息编号参数错误响应示例]:`
```json
{
    "status": 10521,
    "message": "Id为空",
    "data": {
        "resource": "Id",
        "issues": [
            {
                "field": "Id",
                "issue": "Id为空",
                "status": 10521,
                "message": "Id为空"
            }
        ],
        "name": "IDENTITY_IS_NULL",
        "status": 10521,
        "message": "Id为空"
    }
}
```

<!DOCTYPE html>
<a name='公司信息过滤器查询[QueryFilter]'></a>

## 1.5、公司信息过滤器查询[QueryFilter]

[返回顶部[Back to top]](#top)

[公司信息过滤器查询] 公司信息过滤器查询接口，用于公司信息过滤器查询操作

```json
POST /simple/api/v0.1.0/company/query/filter
```

### 标头[Headers]

####  1、Header - `DefaultHeader[默认请求头]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                          |
|---------|---------|-----------|--------------------------------------|
| 1 | Content-Type | `String` | 多媒体类型 |
| 2 | Charset | `String` | 字符编码 |

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| pageNum | `Integer` | 页码，默认为第一页_默认值[Default]: 1_<br> |
| 2| pageSize | `Integer` | 页面大小,默认为0时查询所有数据_默认值[Default]: 0_<br> |
| 3| sorts | `Set` | 排序字段集合 <code>Set&lt;RestSort&gt;</code> |
| 4| id | `String` | 通过id查询 |
| 5| ids | `Set` | 通过ids集合查询  <code>Set&lt;String&gt;</code> |
| 6| startTime | `Date` | 开始时间 |
| 7| endTime | `Date` | 结束时间 |
| 8| contrasts | `Set` | 数值型对比运算集合 <code>Set&lt;ContrastRule&gt;</code> |
| 9| ranges | `Set` | 数值型范围对比运算集合 <code>Set&lt;RangeRule&gt;</code> |
| 10| equals | `Set` | 字符串型比较模糊运算集合 <code>Set&lt;EqualRule&gt;</code> |
| 11| contains | `Set` | 包含运算集合 <code>Set&lt;ContainRule&gt;</code> |
| 12| name | `String` | 单个名称模糊查询 |
| 13| names | `Set` | 名称等值查询 <code>Set&lt;String&gt;</code> |
| 14| code | `String` | 公司编码过滤查询 |

### 参数示例[Parameters examples]
`json` - 200-RequestBody[分页查询所有参数示例]:
```json
{
    "pageNum": 1,
    "pageSize": 10,
    "id": null,
    "ids": [],
    "startTime": null,
    "endTime": null,
    "contrasts": [],
    "ranges": [],
    "equals": [],
    "contains": [],
    "name": null,
    "names": [],
    "code": null
}
```
`json` - 200-RequestBody[时间段查询参数示例]:
```json
{
    "pageNum": 1,
    "pageSize": 10,
    "id": null,
    "ids": [],
    "startTime": "2022-01-01 10:01:00",
    "endTime": "2022-01-01 12:01:00",
    "contrasts": [],
    "ranges": [],
    "equals": [],
    "contains": [],
    "name": null,
    "names": [],
    "code": null
}
```
`json` - 200-RequestBody[公司级别属性Jsonb查询参数示例]:
```json
{
    "pageNum": 1,
    "pageSize": 10,
    "id": null,
    "ids": [],
    "startTime": null,
    "endTime": null,
    "contrasts": [
        {
            "name": "level",
            "type": 2,
            "value": 6,
            "operation": 5
        }
    ],
    "ranges": [],
    "equals": [],
    "contains": [],
    "name": null,
    "names": [],
    "code": null
}
```

### 成功响应[Success response]

#### 1、Success response - `Success[成功响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | 响应状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | time | `Date` | 时间信息 |

#### 2、Success response - `RestPage[分页响应对象]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | totals | `Long` | 总数据量 |
| 2 | pages | `Long` | 总页数 |
| 3 | pageNum | `Long` | 当前页码 |
| 4 | pageSize | `Long` | 页码大小 |
| 5 | itemSize | `Long` | 当前页码大小 |
| 6 | items | `List` | 数据集合 <code>List&lt;Object&gt;</code> |

#### 3、Success response - `TimeModel[时间响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | createTime | `Date` | 创建时间 |
| 2 | updateTime | `Date` | 更新时间时间 |

#### 4、Success response - `IdModel[编号响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | id | `String` | 对象Id |

#### 5、Success response - `InfoModel[信息响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | name | `String` | 对象名称 |
| 2 | description | `String` | 描述信息 |

#### 6、Success response - `Company[公司响应对象]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | code | `String` | 公司编码 |
| 2 | telephone | `String` | 公司电话 |
| 3 | email | `String` | 公司邮箱 |
| 4 | address | `String` | 公司详细地址 |
| 5 | regdate | `String` | 公司注册时间 |
| 6 | properties | `Set` | 公司其他属性 <code>Set&lt;Property&gt;</code> |

### 成功响应示例[Success response example]

#### 1、Success response example - `200-SuccessResponse[分页查询所有响应示例]:`
```json
{
    "status": 200,
    "message": "成功",
    "data": {
        "totals": 3,
        "pages": 1,
        "pageNum": 1,
        "pageSize": 10,
        "itemSize": 3,
        "items": [
            {
                "logicSign": "1",
                "createTime": "2022-11-10 17:41:21",
                "updateTime": "2022-11-10 17:56:06",
                "id": "1590640746569142272",
                "name": "公司信息测试001",
                "description": "公司信息测试001 更新测试",
                "code": "GS21562884-001",
                "telephone": "0397-2135564",
                "email": "gs001@test.com",
                "address": "某某省某某市某某区某某街道001号",
                "regdate": "2022-01-01 09:00:00",
                "properties": [
                    {
                        "name": "level",
                        "value": 5
                    }
                ]
            },
            {
                "logicSign": "1",
                "createTime": "2022-11-10 17:48:15",
                "updateTime": "2022-11-10 17:48:15",
                "id": "1590642485674381312",
                "name": "公司信息测试003",
                "description": "公司信息测试003 创建测试",
                "code": "GS21562884-003",
                "telephone": "0397-2135564",
                "email": "gs003@test.com",
                "address": "某某省某某市某某区某某街道003号",
                "regdate": "2022-01-01 11:00:00",
                "properties": [
                    {
                        "name": "level",
                        "value": 7
                    }
                ]
            },
            {
                "logicSign": "1",
                "createTime": "2022-11-10 17:48:15",
                "updateTime": "2022-11-10 17:48:15",
                "id": "1590642485661798400",
                "name": "公司信息测试002",
                "description": "公司信息测试002 创建测试",
                "code": "GS21562884-002",
                "telephone": "0397-2135564",
                "email": "gs002@test.com",
                "address": "某某省某某市某某区某某街道002号",
                "regdate": "2022-01-01 10:00:00",
                "properties": [
                    {
                        "name": "level",
                        "value": 6
                    }
                ]
            }
        ]
    },
    "time": "2022-11-10 17:57:26"
}
```

#### 2、Success response example - `200-SuccessResponse[时间段查询响应示例]:`
```json
{
    "status": 200,
    "message": "成功",
    "data": {
        "totals": 1,
        "pages": 1,
        "pageNum": 1,
        "pageSize": 10,
        "itemSize": 1,
        "items": [
            {
                "logicSign": "1",
                "createTime": "2022-11-10 17:48:15",
                "updateTime": "2022-11-10 17:48:15",
                "id": "1590642485674381312",
                "name": "公司信息测试003",
                "description": "公司信息测试003 创建测试",
                "code": "GS21562884-003",
                "telephone": "0397-2135564",
                "email": "gs003@test.com",
                "address": "某某省某某市某某区某某街道003号",
                "regdate": "2022-01-01 11:00:00",
                "properties": [
                    {
                        "name": "level",
                        "value": 7
                    }
                ]
            }
        ]
    },
    "time": "2022-11-10 18:00:36"
}
```

#### 3、Success response example - `200-SuccessResponse[公司级别属性Jsonb查询响应示例]:`
```json
{
    "status": 200,
    "message": "成功",
    "data": {
        "totals": 2,
        "pages": 1,
        "pageNum": 1,
        "pageSize": 10,
        "itemSize": 2,
        "items": [
            {
                "logicSign": "1",
                "createTime": "2022-11-10 17:41:21",
                "updateTime": "2022-11-10 17:56:06",
                "id": "1590640746569142272",
                "name": "公司信息测试001",
                "description": "公司信息测试001 更新测试",
                "code": "GS21562884-001",
                "telephone": "0397-2135564",
                "email": "gs001@test.com",
                "address": "某某省某某市某某区某某街道001号",
                "regdate": "2022-01-01 09:00:00",
                "properties": [
                    {
                        "name": "level",
                        "value": 5
                    }
                ]
            },
            {
                "logicSign": "1",
                "createTime": "2022-11-10 17:48:15",
                "updateTime": "2022-11-10 17:48:15",
                "id": "1590642485661798400",
                "name": "公司信息测试002",
                "description": "公司信息测试002 创建测试",
                "code": "GS21562884-002",
                "telephone": "0397-2135564",
                "email": "gs002@test.com",
                "address": "某某省某某市某某区某某街道002号",
                "regdate": "2022-01-01 10:00:00",
                "properties": [
                    {
                        "name": "level",
                        "value": 6
                    }
                ]
            }
        ]
    },
    "time": "2022-11-10 18:05:17"
}
```

### 错误响应[Error response]

#### 1、 Error response - `Error[错误响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | Error状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | error | `Object` | 详细错误 |
| 5 | time | `Date` | 时间信息 |

<!DOCTYPE html>
<a name='公司信息过滤器删除[DeleteFilter]'></a>

## 1.6、公司信息过滤器删除[DeleteFilter]

[返回顶部[Back to top]](#top)

[公司信息过滤器删除] 公司信息过滤器删除接口，用于公司信息过滤器删除操作

```json
POST /simple/api/v0.1.0/company/delete/filter
```

### 标头[Headers]

####  1、Header - `DefaultHeader[默认请求头]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                          |
|---------|---------|-----------|--------------------------------------|
| 1 | Content-Type | `String` | 多媒体类型 |
| 2 | Charset | `String` | 字符编码 |

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| id | `String` | 通过id查询 |
| 2| ids | `Set` | 通过ids集合查询  <code>Set&lt;String&gt;</code> |

### 参数示例[Parameters examples]
`json` - 200-RequestBody[公司信息过滤器删除参数示例]:
```json
{
    "id": null,
    "ids": ["1590642485661798400","1590642485674381312"]
}
```

### 成功响应[Success response]

#### 1、Success response - `Success[成功响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | 响应状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | time | `Date` | 时间信息 |

### 成功响应示例[Success response example]

#### 1、Success response example - `200-SuccessResponse[公司信息过信息滤器删除响应示例]:`
```json
{
    "status": 200,
    "message": "成功",
    "time": "2022-11-10 18:09:46"
}
```

### 错误响应[Error response]

#### 1、 Error response - `Error[错误响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | Error状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | error | `Object` | 详细错误 |
| 5 | time | `Date` | 时间信息 |

<!DOCTYPE html>
<a name='公司信息批量保存[SaveAll]'></a>

## 1.7、公司信息批量保存[SaveAll]

[返回顶部[Back to top]](#top)

[公司信息批量保存] 公司信息批量保存接口，用于用户对公司信息批量保存操作

```json
POST /simple/api/v0.1.0/company/saveAll
```

### 标头[Headers]

####  1、Header - `DefaultHeader[默认请求头]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                          |
|---------|---------|-----------|--------------------------------------|
| 1 | Content-Type | `String` | 多媒体类型 |
| 2 | Charset | `String` | 字符编码 |

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| createTime | `Date` | 创建时间 |
| 2| updateTime | `Date` | 更新时间时间 |
| 3| id | `String` | 对象Id |
| 4| name | `String` | 对象名称 |
| 5| description | `String` | 描述信息 |
| 6| code | `String` | 公司编码 |
| 7| telephone | `String` | 公司电话 |
| 8| email | `String` | 公司邮箱 |
| 9| address | `String` | 公司详细地址 |
| 10| regdate | `String` | 公司注册时间 |
| 11| properties | `Set` | 公司其他属性 <code>Set&lt;Property&gt;</code> |

### 参数示例[Parameters examples]
`json` - 200-RequestBody[公司信息批量保存成功参数示例]:
```json
[
    {
        "id": "1590640746569142272",
        "name": "公司信息测试001",
        "description": "公司信息测试001 更新测试",
        "code": "GS21562884-001",
        "payCode": "ZF115121541-001",
        "telephone": "0397-2135564",
        "email": "gs001@test.com",
        "address": "某某省某某市某某区某某街道001号",
        "regdate": "2022-01-01 09:00:00",
        "properties": [
            {
                "name": "level",
                "value": 5
            }
        ]
    },
    {
        "name": "公司信息测试002",
        "description": "公司信息测试002 创建测试",
        "code": "GS21562884-002",
        "payCode": "ZF115121541-002",
        "telephone": "0397-2135564",
        "email": "gs002@test.com",
        "address": "某某省某某市某某区某某街道002号",
        "regdate": "2022-01-01 10:00:00",
        "properties": [
            {
                "name": "level",
                "value": 6
            }
        ]
    },
    {
        "name": "公司信息测试003",
        "description": "公司信息测试003 创建测试",
        "code": "GS21562884-003",
        "payCode": "ZF115121541-003",
        "telephone": "0397-2135564",
        "email": "gs003@test.com",
        "address": "某某省某某市某某区某某街道003号",
        "regdate": "2022-01-01 11:00:00",
        "properties": [
            {
                "name": "level",
                "value": 7
            }
        ]
    }
]
```

### 成功响应[Success response]

#### 1、Success response - `Success[成功响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | 响应状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | time | `Date` | 时间信息 |

#### 2、Success response - `TimeModel[时间响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | createTime | `Date` | 创建时间 |
| 2 | updateTime | `Date` | 更新时间时间 |

#### 3、Success response - `IdModel[编号响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | id | `String` | 对象Id |

#### 4、Success response - `InfoModel[信息响应模型]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | name | `String` | 对象名称 |
| 2 | description | `String` | 描述信息 |

#### 5、Success response - `Company[公司响应对象]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | code | `String` | 公司编码 |
| 2 | telephone | `String` | 公司电话 |
| 3 | email | `String` | 公司邮箱 |
| 4 | address | `String` | 公司详细地址 |
| 5 | regdate | `String` | 公司注册时间 |
| 6 | properties | `Set` | 公司其他属性 <code>Set&lt;Property&gt;</code> |

### 成功响应示例[Success response example]

#### 1、Success response example - `200-SuccessResponse[公司信息批量保存成功响应示例]:`
```json
{
    "status": 200,
    "message": "成功",
    "data": [
        {
            "id": "1590640746569142272",
            "name": "公司信息测试001",
            "description": "公司信息测试001 更新测试",
            "code": "GS21562884-001",
            "telephone": "0397-2135564",
            "email": "gs001@test.com",
            "address": "某某省某某市某某区某某街道001号",
            "regdate": "2022-01-01 09:00:00",
            "properties": [
                {
                    "name": "level",
                    "value": 5
                }
            ]
        },
        {
            "logicSign": "1",
            "id": "1590642485661798400",
            "name": "公司信息测试002",
            "description": "公司信息测试002 创建测试",
            "code": "GS21562884-002",
            "telephone": "0397-2135564",
            "email": "gs002@test.com",
            "address": "某某省某某市某某区某某街道002号",
            "regdate": "2022-01-01 10:00:00",
            "properties": [
                {
                    "name": "level",
                    "value": 6
                }
            ]
        },
        {
            "logicSign": "1",
            "id": "1590642485674381312",
            "name": "公司信息测试003",
            "description": "公司信息测试003 创建测试",
            "code": "GS21562884-003",
            "telephone": "0397-2135564",
            "email": "gs003@test.com",
            "address": "某某省某某市某某区某某街道003号",
            "regdate": "2022-01-01 11:00:00",
            "properties": [
                {
                    "name": "level",
                    "value": 7
                }
            ]
        }
    ],
    "time": "2022-11-10 17:48:15"
}
```

### 错误响应[Error response]

#### 1、 Error response - `Error[错误响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | Error状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | error | `Object` | 详细错误 |
| 5 | time | `Date` | 时间信息 |

<!DOCTYPE html>
<a name='HelloController_Hello'></a>

# 2、HelloController


<!DOCTYPE html>
<a name='Hello测试接口[Hello]'></a>

## 2.1、Hello测试接口[Hello]

[返回顶部[Back to top]](#top)

[Hello测试接口] Hello测试接口,用于服务器部署测试

```json
GET /simple/api/v0.1.0/hello
```

### 标头[Headers]

####  1、Header - `DefaultHeader[默认请求头]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                          |
|---------|---------|-----------|--------------------------------------|
| 1 | Content-Type | `String` | 多媒体类型 |
| 2 | Charset | `String` | 字符编码 |

### 参数示例[Parameters examples]
`curl` - 200-RequestPath[测试成功请求路径示例]:
```curl

@Shell:
curl -I http://127.0.0.1:8081/simple/api/v0.1.0/hello -H 'Content-Type: application/json' -H 'Charset: UTF-8'

@PowerShell:
curl -Headers @{"Content-Type"="application/json";"Charset"="UTF-8"} http://127.0.0.1:8081/simple/api/v0.1.0/hello
```

### 成功响应[Success response]

#### 1、Success response - `Success[成功响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | 响应状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | time | `Date` | 时间信息 |

### 成功响应示例[Success response example]

#### 1、Success response example - `200-SuccessResponse[测试成功响应示例]:`
```json
{
    "status": 200,
    "message": "Hello, Welcome to the apidoc simple server !",
    "time": "2022-11-10 17:33:11"
}
```

### 错误响应[Error response]

#### 1、 Error response - `Error[错误响应结果]`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1 | status | `Integer` | Error状态码 |
| 2 | message | `String` | 返回信息 |
| 3 | data | `Object` | 返回数据,为空时不显示 |
| 4 | error | `Object` | 详细错误 |
| 5 | time | `Date` | 时间信息 |

<!DOCTYPE html>
<a name='JsonbEnum_Jsonb'></a>

# 3、JsonbEnum


<!DOCTYPE html>
<a name='对比操作[ContrastOperation]'></a>

## 3.1、对比操作[ContrastOperation]

[返回顶部[Back to top]](#top)

[对比操作] 对比操作定义对比操作信息

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| EQUAL_OPERATION | `ContrastOperation` | 相等_默认值[Default]: 1_<br> |
| 2| GREATER_OPERATION | `ContrastOperation` | 大于_默认值[Default]: 2_<br> |
| 3| GREATER_EQUAL_OPERATION | `ContrastOperation` | 大于等于_默认值[Default]: 3_<br> |
| 4| LESS_OPERATION | `ContrastOperation` | 小于_默认值[Default]: 4_<br> |
| 5| LESS_EQUAL_OPERATION | `ContrastOperation` | 小于等于_默认值[Default]: 5_<br> |
| 6| UNEQUAL_OPERATION | `ContrastOperation` | 不等于_默认值[Default]: 6_<br> |

<!DOCTYPE html>
<a name='范围操作[RangeOperation]'></a>

## 3.2、范围操作[RangeOperation]

[返回顶部[Back to top]](#top)

[范围操作] 范围操作定义范围操作信息

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| GREATER_EQUAL_LESS_EQUAL_OPERATION | `RangeOperation` | 大于等于且小于等于_默认值[Default]: 1_<br> |
| 2| GREATER_EQUAL_LESS_OPERATION | `RangeOperation` | 大于等于且小于_默认值[Default]: 2_<br> |
| 3| GREATER_LESS_EQUAL_OPERATION | `RangeOperation` | 大于且小于等于_默认值[Default]: 3_<br> |
| 4| GREATER_LESS_OPERATION | `RangeOperation` | 大于且小于_默认值[Default]: 4_<br> |

<!DOCTYPE html>
<a name='相等操作[EqualOperation]'></a>

## 3.3、相等操作[EqualOperation]

[返回顶部[Back to top]](#top)

[相等操作] 相等操作定义相等操作信息

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| EQUAL_OPERATION | `EqualOperation` | 相等_默认值[Default]: 1_<br> |
| 2| LEFT_LIKE_OPERATION | `EqualOperation` | 左模糊_默认值[Default]: 2_<br> |
| 3| RIGHT_LIKE_OPERATION | `EqualOperation` | 右模糊_默认值[Default]: 3_<br> |
| 4| ALL_LIKE_OPERATION | `EqualOperation` | 全模糊_默认值[Default]: 4_<br> |
| 5| NOT_NULL_OPERATION | `EqualOperation` | 不为空_默认值[Default]: 5_<br> |

<!DOCTYPE html>
<a name='JsonbRule_Jsonb'></a>

# 4、JsonbRule


<!DOCTYPE html>
<a name='包含运算规则对象[ContainRule]'></a>

## 4.1、包含运算规则对象[ContainRule]

[返回顶部[Back to top]](#top)

[包含运算规则对象]

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| name | `String` | 属性名 |
| 2| type | `ValueType` | 属性值类型_默认值[Default]: LONG_<br> |
| 3| values | `Set` | 属性值运算范围 <code>Set&lt;Object&gt;</code> |

<!DOCTYPE html>
<a name='比较模糊运算规则对象[EqualRule]'></a>

## 4.2、比较模糊运算规则对象[EqualRule]

[返回顶部[Back to top]](#top)

[比较模糊运算规则对象]

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| name | `String` | 属性名 |
| 2| type | `ValueType` | 属性值类型_默认值[Default]: STRING_<br> |
| 3| value | `Object` | 属性值 |
| 4| operation | `ContrastOperation` | 计算操作_默认值[Default]: EQUAL_OPERATION_<br> |

<!DOCTYPE html>
<a name='对比运算规则对象[ContrastRule]'></a>

## 4.3、对比运算规则对象[ContrastRule]

[返回顶部[Back to top]](#top)

[对比运算规则对象]

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| name | `String` | 属性名 |
| 2| type | `ValueType` | 属性值类型_默认值[Default]: LONG_<br> |
| 3| value | `Object` | 属性值 |
| 4| operation | `ContrastOperation` | 操作_默认值[Default]: EQUAL_OPERATION_<br> |

<!DOCTYPE html>
<a name='范围运算规则对象[RangeRule]'></a>

## 4.4、范围运算规则对象[RangeRule]

[返回顶部[Back to top]](#top)

[范围运算规则对象]

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| name | `String` | 属性名 |
| 2| type | `ValueType` | 属性值类型_默认值[Default]: STRING_<br> |
| 3| startValue | `Object` | 属性开始值 |
| 4| endValue | `Object` | 属性结束值 |
| 5| operation | `ContrastOperation` | 计算操作_默认值[Default]: GREATER_EQUAL_LESS_EQUAL_OPERATION_<br> |

<!DOCTYPE html>
<a name='ProjectObject_'></a>

# 5、ProjectObject


<!DOCTYPE html>
<a name='公司对象[Company]'></a>

## 5.1、公司对象[Company]

[返回顶部[Back to top]](#top)

[公司对象] 公司对象传输公司相关信息

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| createTime | `Date` | 创建时间 |
| 2| updateTime | `Date` | 更新时间时间 |
| 3| id | `String` | 对象Id |
| 4| name | `String` | 对象名称 |
| 5| description | `String` | 描述信息 |
| 6| code | `String` | 公司编码 |
| 7| telephone | `String` | 公司电话 |
| 8| email | `String` | 公司邮箱 |
| 9| address | `String` | 公司详细地址 |
| 10| regdate | `String` | 公司注册时间 |
| 11| properties | `Set` | 公司其他属性 <code>Set&lt;Property&gt;</code> |

<!DOCTYPE html>
<a name='RestEnum_Rest'></a>

# 6、RestEnum


<!DOCTYPE html>
<a name='排序类型[SortType]'></a>

## 6.1、排序类型[SortType]

[返回顶部[Back to top]](#top)

[排序类型] 排序类型定义排序查询枚举信息

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| ASC | `SortType` | 升序_默认值[Default]: 1_<br> |
| 2| DESC | `SortType` | 降序_默认值[Default]: 2_<br> |

<!DOCTYPE html>
<a name='RestFilter_Rest'></a>

# 7、RestFilter


<!DOCTYPE html>
<a name='分页过滤器[PageFilter]'></a>

## 7.1、分页过滤器[PageFilter]

[返回顶部[Back to top]](#top)

[分页过滤器] 用于输排分页数据进行过滤查询

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| pageNum | `Integer` | 页码，默认为第一页_默认值[Default]: 1_<br> |
| 2| pageSize | `Integer` | 页面大小,默认为0时查询所有数据_默认值[Default]: 0_<br> |

<!DOCTYPE html>
<a name='名称过滤器[NameFilter]'></a>

## 7.2、名称过滤器[NameFilter]

[返回顶部[Back to top]](#top)

[名称过滤器] 用于传输数据名称过滤查询

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| pageNum | `Integer` | 页码，默认为第一页_默认值[Default]: 1_<br> |
| 2| pageSize | `Integer` | 页面大小,默认为0时查询所有数据_默认值[Default]: 0_<br> |
| 3| sorts | `Set` | 排序字段集合 <code>Set&lt;RestSort&gt;</code> |
| 4| id | `String` | 通过id查询 |
| 5| ids | `Set` | 通过ids集合查询  <code>Set&lt;String&gt;</code> |
| 6| startTime | `Date` | 开始时间 |
| 7| endTime | `Date` | 结束时间 |
| 8| contrasts | `Set` | 数值型对比运算集合 <code>Set&lt;ContrastRule&gt;</code> |
| 9| ranges | `Set` | 数值型范围对比运算集合 <code>Set&lt;RangeRule&gt;</code> |
| 10| equals | `Set` | 字符串型比较模糊运算集合 <code>Set&lt;EqualRule&gt;</code> |
| 11| contains | `Set` | 包含运算集合 <code>Set&lt;ContainRule&gt;</code> |
| 12| name | `String` | 单个名称模糊查询 |
| 13| names | `Set` | 名称等值查询 <code>Set&lt;String&gt;</code> |

<!DOCTYPE html>
<a name='排序过滤器[SortFilter]'></a>

## 7.3、排序过滤器[SortFilter]

[返回顶部[Back to top]](#top)

[排序过滤器] 用于传输排序数据对字段进行过滤查询

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| pageNum | `Integer` | 页码，默认为第一页_默认值[Default]: 1_<br> |
| 2| pageSize | `Integer` | 页面大小,默认为0时查询所有数据_默认值[Default]: 0_<br> |
| 3| sorts | `Set` | 排序字段集合 <code>Set&lt;RestSort&gt;</code> |

<!DOCTYPE html>
<a name='时间过滤器[TimeFilter]'></a>

## 7.4、时间过滤器[TimeFilter]

[返回顶部[Back to top]](#top)

[时间过滤器] 用于传输时间范围数据过滤查询

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| pageNum | `Integer` | 页码，默认为第一页_默认值[Default]: 1_<br> |
| 2| pageSize | `Integer` | 页面大小,默认为0时查询所有数据_默认值[Default]: 0_<br> |
| 3| sorts | `Set` | 排序字段集合 <code>Set&lt;RestSort&gt;</code> |
| 4| id | `String` | 通过id查询 |
| 5| ids | `Set` | 通过ids集合查询  <code>Set&lt;String&gt;</code> |
| 6| startTime | `Date` | 开始时间 |
| 7| endTime | `Date` | 结束时间 |

<!DOCTYPE html>
<a name='Id过滤器[IdFilter]'></a>

## 7.5、Id过滤器[IdFilter]

[返回顶部[Back to top]](#top)

[Id过滤器] 用于传输id编号数据过滤查询

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| pageNum | `Integer` | 页码，默认为第一页_默认值[Default]: 1_<br> |
| 2| pageSize | `Integer` | 页面大小,默认为0时查询所有数据_默认值[Default]: 0_<br> |
| 3| sorts | `Set` | 排序字段集合 <code>Set&lt;RestSort&gt;</code> |
| 4| id | `String` | 通过id查询 |
| 5| ids | `Set` | 通过ids集合查询  <code>Set&lt;String&gt;</code> |

<!DOCTYPE html>
<a name='Jsonb过滤器[JsonbFilter]'></a>

## 7.6、Jsonb过滤器[JsonbFilter]

[返回顶部[Back to top]](#top)

[Jsonb过滤器] 用于传输jsonb格式的数据进行属性过滤

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| pageNum | `Integer` | 页码，默认为第一页_默认值[Default]: 1_<br> |
| 2| pageSize | `Integer` | 页面大小,默认为0时查询所有数据_默认值[Default]: 0_<br> |
| 3| sorts | `Set` | 排序字段集合 <code>Set&lt;RestSort&gt;</code> |
| 4| id | `String` | 通过id查询 |
| 5| ids | `Set` | 通过ids集合查询  <code>Set&lt;String&gt;</code> |
| 6| startTime | `Date` | 开始时间 |
| 7| endTime | `Date` | 结束时间 |
| 8| contrasts | `Set` | 数值型对比运算集合 <code>Set&lt;ContrastRule&gt;</code> |
| 9| ranges | `Set` | 数值型范围对比运算集合 <code>Set&lt;RangeRule&gt;</code> |
| 10| equals | `Set` | 字符串型比较模糊运算集合 <code>Set&lt;EqualRule&gt;</code> |
| 11| contains | `Set` | 包含运算集合 <code>Set&lt;ContainRule&gt;</code> |

<!DOCTYPE html>
<a name='RestModel_Rest'></a>

# 8、RestModel


<!DOCTYPE html>
<a name='编号模型[IdModel]'></a>

## 8.1、编号模型[IdModel]

[返回顶部[Back to top]](#top)

[编号模型] 编号模型传输数据库数据主键编号

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| createTime | `Date` | 创建时间 |
| 2| updateTime | `Date` | 更新时间时间 |
| 3| id | `String` | 对象Id |

<!DOCTYPE html>
<a name='时间模型[TimeModel]'></a>

## 8.2、时间模型[TimeModel]

[返回顶部[Back to top]](#top)

[时间模型] 时间模型传输数据库创建时间和数据库更新时间

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| createTime | `Date` | 创建时间 |
| 2| updateTime | `Date` | 更新时间时间 |

<!DOCTYPE html>
<a name='信息模型[InfoModel]'></a>

## 8.3、信息模型[InfoModel]

[返回顶部[Back to top]](#top)

[信息模型] 信息模型传输对象名称和描述信息

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| createTime | `Date` | 创建时间 |
| 2| updateTime | `Date` | 更新时间时间 |
| 3| id | `String` | 对象Id |
| 4| name | `String` | 对象名称 |
| 5| description | `String` | 描述信息 |

<!DOCTYPE html>
<a name='RestObject_Rest'></a>

# 9、RestObject


<!DOCTYPE html>
<a name='分页对象[RestPage]'></a>

## 9.1、分页对象[RestPage]

[返回顶部[Back to top]](#top)

[分页对象] 分页对象传输分页查询数据

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| totals | `Long` | 总数据量 |
| 2| pages | `Long` | 总页数 |
| 3| pageNum | `Long` | 当前页码 |
| 4| pageSize | `Long` | 页码大小 |
| 5| itemSize | `Long` | 当前页码大小 |
| 6| items | `List` | 数据集合 <code>List&lt;Object&gt;</code> |

<!DOCTYPE html>
<a name='排序对象[RestSort]'></a>

## 9.2、排序对象[RestSort]

[返回顶部[Back to top]](#top)

[排序对象] 排序对象传输排序查询数据

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| name | `String` | 排序字段名称 |
| 2| type | `SortType` | 排序类型 |

<!DOCTYPE html>
<a name='属性对象[Property]'></a>

## 9.3、属性对象[Property]

[返回顶部[Back to top]](#top)

[属性对象] 属性对象传输属性名称和属性值信息

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| name | `String` | 属性名称 |
| 2| value | `Object` | 属性值 |

<!DOCTYPE html>
<a name='RiceObject_Rice'></a>

# 10、RiceObject


<!DOCTYPE html>
<a name='用户日志对象[RiceUsernote]'></a>

## 10.1、用户日志对象[RiceUsernote]

[返回顶部[Back to top]](#top)

[用户日志对象] 用户日志对象传输用户日志信息

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| createTime | `Date` | 创建时间 |
| 2| updateTime | `Date` | 更新时间时间 |
| 3| id | `String` | 对象Id |
| 4| userId | `String` | 用户编号 |
| 5| targetIds | `Set` | 操作目标对象编号集合 <code>Set&lt;String&gt;</code> |
| 6| username | `String` | 用户名 |
| 7| userAgent | `String` | 用户代理 |
| 8| ipAddress | `String` | 用户ip地址 |
| 9| requestMethod | `String` | 请求方式 |
| 10| requestParams | `String` | 请求参数 |
| 11| requestUrl | `String` | 请求地址 |
| 12| methodName | `String` | 方法名称 |
| 13| mediaType | `String` | 请求媒介类型 |
| 14| responseTime | `Long` | 响应耗费时间 |
| 15| responseStatus | `Integer` | 响应状态码 |
| 16| responseMessage | `String` | 响应消息 |
| 17| notelog | `String` | 日志标题 |
| 18| userlog | `String` | 日志信息 |
| 19| logKey | `Integer` | 操作key |
| 20| logValue | `String` | 操作值 |
| 21| logType | `LogType` | 日志类型 <code>LogType</code> |
| 22| logTime | `Date` | 日志记录时间 |

<!DOCTYPE html>
<a name='SimpleFilter_Simple'></a>

# 11、SimpleFilter


<!DOCTYPE html>
<a name='公司信息过滤器[CompanyFilter]'></a>

## 11.1、公司信息过滤器[CompanyFilter]

[返回顶部[Back to top]](#top)

[公司信息过滤器] 用于传输公司信息数据进行过滤查询

```json
DESC 
```

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
| 1| pageNum | `Integer` | 页码，默认为第一页_默认值[Default]: 1_<br> |
| 2| pageSize | `Integer` | 页面大小,默认为0时查询所有数据_默认值[Default]: 0_<br> |
| 3| sorts | `Set` | 排序字段集合 <code>Set&lt;RestSort&gt;</code> |
| 4| id | `String` | 通过id查询 |
| 5| ids | `Set` | 通过ids集合查询  <code>Set&lt;String&gt;</code> |
| 6| startTime | `Date` | 开始时间 |
| 7| endTime | `Date` | 结束时间 |
| 8| contrasts | `Set` | 数值型对比运算集合 <code>Set&lt;ContrastRule&gt;</code> |
| 9| ranges | `Set` | 数值型范围对比运算集合 <code>Set&lt;RangeRule&gt;</code> |
| 10| equals | `Set` | 字符串型比较模糊运算集合 <code>Set&lt;EqualRule&gt;</code> |
| 11| contains | `Set` | 包含运算集合 <code>Set&lt;ContainRule&gt;</code> |
| 12| code | `String` | 公司编码过滤查询 |


apidoc-server
