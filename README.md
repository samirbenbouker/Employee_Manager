# Employee_Manager
This Spring Boot project covers Spring Boot and MySQL using Spring Data JPA. This project also dives into defining and creating a spring boot API, exposing the API endpoints over HTTP and handling HTTP requests through the API endpoints. Covers testing of API endpoints (using an HTTP client and the DevTools browser).  This project also dives into angular components, angular shapes, angular routing, and angular services. Enter Angular HTTP Communication.

## Path Java Project:
`employeemanager/src/main/java/com/getarrays/employeemanager/`

## Path Angular Project:
`employeeManagerApp/src/app/`

# Execute Angular Project:
```
ng serve
```

## Path Data DataBase:
_Can use this txt to insert default users_
`employeemanager/data.txt`

## Endpoints API:
### Get All Employees
_This endpoint return all employees we found in database_
<table>
  <tr>
    <th>Response: Array[Employee]</th>
  </tr>
  <tr>
    <th>Get /all </th>
  </tr>
  <tr>
    <td>No parameters required</td>
  </tr>
</table>

### Get Employee By Id
_This endpoint return employee with that id we passed_
<table>
  <tr>
    <th>Response: Employee</th>
  </tr>
  <tr>
    <th>Get /find/{id} </th>
  </tr>
    <tr>
    <th>Param</th>
    <th>Values</th>
    <th>Description</th>
    <th>Required</th>
  </tr>
  <tr>
    <td>id</td>
    <td>Long</td>
    <td>Contains the id of the employee</td>
    <td>Yes</td>
  </tr>
</table>

### Post Add Employee
_This endpoint we can add a employee in frontend and database_
<table>
  <tr>
    <th>Response: Employee</th>
  </tr>
  <tr>
    <th>Post /add </th>
  </tr>
  <tr>
    <td>No parameters required</td>
  </tr>
</table>

### Put Update Employee
_This endpoint we can update a employee in frontend and database_
<table>
  <tr>
    <th>Response: Employee</th>
  </tr>
  <tr>
    <th>Put /update </th>
  </tr>
  <tr>
    <td>No parameters required</td>
  </tr>
</table>

### Delete Employee By Id
_This endpoint delete employee with that id we passed_
<table>
  <tr>
    <th>Response: String</th>
  </tr>
  <tr>
    <th>Delete /delete/{id} </th>
  </tr>
    <tr>
    <th>Param</th>
    <th>Values</th>
    <th>Description</th>
    <th>Required</th>
  </tr>
  <tr>
    <td>id</td>
    <td>Long</td>
    <td>Contains the id of the employee</td>
    <td>Yes</td>
  </tr>
</table>



