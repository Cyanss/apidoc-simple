<!DOCTYPE html>
<a name="top"></a>

<% if (project.header) { -%>
<%- project.header.title %>
<% } -%>

# <%= project.name %> v<%= project.version %>

<%= project.description %>

<% if (header) { -%>
<%- header %>
<% } -%>

# 目录[catalog]

<% data.forEach((group,groupIndex) => { -%>

- <%= groupIndex+1 %>、 [<%= group.name && group.name.includes('_' ) ? `${ group.name.substring(0, group.name.indexOf('_'))}` : group.name -%>](#<%= toLink(group.name) -%>)
<% group.subs.forEach((sub,subIndex) => { -%>

  - <%= groupIndex+1 %>.<%= subIndex+1 %>、[<%= sub.title %>](#<%= toLink(sub.title) %>)
<% })}) -%>

___

<% if (prepend) { -%>
<%- prepend %>
<% } -%>
<% data.forEach((group,groupIndex) => { -%>

<!DOCTYPE html>
<a name='<%= toLink(group.name) %>'></a>

# <%= groupIndex+1 %>、<%- group.name && group.name.includes('_' ) ? `${ group.name.substring(0, group.name.indexOf('_'))}\n\n` : group.name -%>
<% group.subs.forEach((sub,subIndex) => { -%>

<!DOCTYPE html>
<a name='<%= toLink(sub.title) %>'></a>

## <%= groupIndex+1 %>.<%= subIndex+1 %>、<%= sub.title %>

[返回顶部[Back to top]](#top)

<%- sub.description ? `${sub.description.replace('<p>', '').replace('</p>', '')}\n\n` : '' -%>
```json
<%- sub.type.toUpperCase() %> <%= sub.type === 'DESC' ? `\n`:`${sub.url}\n` -%>
```
<% if (sub.header && sub.header.fields) { -%>

### 标头[Headers]
<% Object.entries(sub.header.fields).forEach(([headersGroup, headersGroupContent],headerIndex) => { -%>

####  <%- headerIndex+1 %>、Header - `<%= headersGroup %>`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                          |
|---------|---------|-----------|--------------------------------------|
<% headersGroupContent.forEach((header,headerIndex) => { -%>
| <%- headerIndex+1 %> | <%- header.field %> | <%- header.type ? `\`${header.type}\`` : '' %> | <%- header.optional ? '**optional**' : '' %><%- header.description.replace('<p>', '').replace('</p>', ''); %> |
<% }) // foreach parameter -%>
<% }) // foreach header fields -%>
<% } // if parameters -%>
<% if (sub.header && sub.header.examples && sub.header.examples.length) { -%>

### 标头示例[Header examples]
<% sub.header.examples.forEach(example => { -%>
<%= example.title %>
```<%= example.type %>
<%- example.content %>
```
<% }) // foreach example -%>
<% } // if example -%>
<% if (sub.parameter && sub.parameter.fields) { -%>

### 参数[Parameters] 
<% Object.entries(sub.parameter.fields).forEach(([parametersGroup, parametersGroupContent],parameterIndex) => { -%>

####  <%- parameterIndex+1 %>、Parameter -  `<%= parametersGroup -%>`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
<% parametersGroupContent.forEach((param,paramIndex) => { -%>
| <%- paramIndex+1 -%> | <%- param.field -%> | <%- param.type ? `\`${param.type}\`` : '' %> | <%- param.optional ? '**optional** ' : '' -%><%- param.description.replace('<p>', '').replace('</p>', ''); -%>
<% if (param.defaultValue) { -%>
_默认值[Default]: <%= param.defaultValue %>_<br><% } -%>
<% if (param.size) { -%>
_Size range: <%- param.size %>_<br><% } -%>
<% if (param.allowedValues) { -%>
_Allowed values: <%- param.allowedValues %>_<% } -%> |
<% }) // foreach parameters -%>
<% }) // foreach param parameter -%>
<% } // if parameters -%>
<% if (sub.query) { -%>

### 请求参数[Query Parameters]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
<% sub.query.forEach((query,queryIndex) => { -%>
| <%- queryIndex+1 -%> | <%- query.field -%> | <%- query.type ? `\`${query.type}\`` : '' %> | <%- query.optional ? '**optional** ' : '' -%><%- query.description.replace('<p>', '').replace('</p>', '') -%>
<% if (query.defaultValue) { -%>
_默认值[Default]: <%= query.defaultValue %>_<br><% } -%>
<% if (query.size) { -%>
_Size range: <%- query.size %>_<br><% } -%>
<% if (query.allowedValues) { -%>
_Allowed values: <%- query.allowedValues %>_<% } -%> |
<% }) // foreach query -%>
<% } // if query -%>
<% if (sub.body) { -%>

### 请求体[Request Body]

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
<% sub.body.forEach((body,bodyIndex) => { -%>
| <%- bodyIndex+1 -%>| <%- body.field -%> | <%- body.type ? `\`${body.type}\`` : '' %> | <%- body.optional ? '**optional** ' : '' -%><%- body.description.replace('<p>', '').replace('</p>', '') -%>
<% if (body.defaultValue) { -%>
_默认值[Default]: <%= body.defaultValue %>_<br><% } -%>
<% if (body.size) { -%>
_Size range: <%- body.size %>_<br><% } -%>
<% if (body.allowedValues) { -%>
_Allowed values: <%- body.allowedValues %>_<% } -%> |
<% }) // foreach body -%>
<% } // if body -%>
<% if (sub.examples && sub.examples.length) { -%>

### 示例[Examples]
<% sub.examples.forEach(example => { -%>
<%= example.title %>
```<%= example.type %>
<%- example.content %>
```

<% }) // foreach example -%>
<% } // if example -%>
<% if (sub.parameter && sub.parameter.examples && sub.parameter.examples.length) { -%>

### 参数示例[Parameters examples]
<% sub.parameter.examples.forEach(exampleParam => { -%>
`<%= exampleParam.type %>` - <%= exampleParam.title %>
```<%= exampleParam.type %>
<%- exampleParam.content %>
```
<% }) // foreach exampleParam -%>
<% } // if exampleParam -%>
<% if (sub.success && sub.success.fields) { -%>

### 成功响应[Success response]
<% Object.entries(sub.success.fields).forEach(([responsesGroup, responsesGroupContent],successIndex) => { -%>

#### <%- successIndex+1 -%>、Success response - `<%= responsesGroup %>`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
<% responsesGroupContent.forEach((param,paramIndex) => { -%>
| <%- paramIndex+1 %> | <%- param.field %> | <%- param.type ? `\`${param.type}\`` : '' %> | <%- param.optional ? '**optional**' : '' %><%- param.description.replace('<p>', '').replace('</p>', ''); -%>
<% if (param.defaultValue) { -%>
_默认值[Default]: <%- param.defaultValue %>_<br><% } -%>
<% if (param.size) { -%>
_Size range: <%- param.size -%>_<br><% } -%>
<% if (param.allowedValues) { -%>
_Allowed values: <%- param.allowedValues %>_<% } -%> |
<% }) // foreach reponses -%>
<% }) // foreach field -%>
<% } // if success.fields -%>
<% if (sub.success && sub.success.examples && sub.success.examples.length) { -%>

### 成功响应示例[Success response example]
<% sub.success.examples.forEach((example,exampleIndex) => { -%>

#### <%- exampleIndex+1 %>、Success response example - `<%= example.title %>`
```<%= example.type %>
<%- example.content %>
```
<% }) // foreach success example -%>
<% } // if success.examples -%>
<% if (sub.error && sub.error.fields) { -%>

### 错误响应[Error response]
<% Object.entries(sub.error.fields).forEach(([errorsGroup, errorsGroupContent],errorIndex) => { -%>

#### <%- errorIndex+1 %>、 Error response - `<%= errorsGroup %>`

| 序号[Index]     | 名称[Name]     | 类型[Type]       | 描述[Description]                           |
|----------|----------|------------|---------------------------------------|
<% errorsGroupContent.forEach((param,paramIndex) => { -%>
| <%- paramIndex+1 %> | <%- param.field %> | <%- param.type ? `\`${param.type}\`` : '' %> | <%- param.optional ? '**optional**' : '' %><%- param.description.replace('<p>', '').replace('</p>', ''); -%>
<% if (param.defaultValue) { -%>
_默认值[Default]: <%- param.defaultValue %>_<br><% } -%>
<% if (param.size) { -%>
_Size range: <%- param.size -%>_<br><% } -%>
<% if (param.allowedValues) { -%>
_Allowed values: <%- param.allowedValues %>_<% } -%> |
<% }) // foreach errors -%>
<% }) // foreach field -%>
<% } // if error.fields -%>
<% if (sub.error && sub.error.examples && sub.error.examples.length) { -%>

### 错误响应示例[Error response example]
<% sub.error.examples.forEach((example,exampleIndex) => { -%>

#### <%- exampleIndex+1 %>、Error response example - `<%= example.title %>`
```<%= example.type %>
<%- example.content %>
```
<% }) // foreach error example -%>
<% } // if error.examples -%>
<% }) // foreach sub -%>
<% }) // foreach group -%>

<% if (footer) { -%>
<%- footer %>
<% } -%>

<% if (project.footer) { -%>
<%- project.footer.title %>
<% } -%>