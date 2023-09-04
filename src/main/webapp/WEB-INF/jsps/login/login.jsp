<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
  <style>
    /* Style for the table */
    table {
        border-collapse: collapse;
        width: 300px;
        margin: auto;
        background-color: #f5f5f5;
        border: 1px solid #ddd;
        border-radius: 5px;
    }

    /* Style for table headers (th) */
    th {
        background-color: #333;
        color: white;
        padding: 8px;
        text-align: left;
    }

    /* Alternate row colors for table rows */
    tr:nth-child(even) {
        background-color: #f2f2f2;
    }

    /* Style for input fields */
    input[type="text"], input[type="password"] {
        width: 100%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 3px;
        box-sizing: border-box;
    }

    /* Style for submit button */
    input[type="submit"] {
        background-color: #4caf50;
        color: white;
        padding: 10px 20px;
        border: none;
        border-radius: 3px;
        cursor: pointer;
    }

    /* Hover effect for submit button */
    input[type="submit"]:hover {
        background-color: #45a049;
    }

    /* Center align text in center-aligned cells */
    td[colspan="2"] {
        text-align: center;
    }
    
     /* Center align the content horizontally and vertically */
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }
    
</style>

</head>
<body>

<b>${error}</b>
<b>${msg}</b>

<form action="verifyLogin" method="post">
    <table>
    <caption><b><font size="6">Log In Here</font></b></caption>
        <tr>
 <th><label for="emailId">Email:</label></th>
<td><input type="text" name="emailId" required/></td>
</tr>
<tr>
 <th><label for="password">Password:</label></th>
<td><input type="password" name="password" required/></td>
</tr>
<tr>
 <td colspan="2" style="text-align: center;">
<input type="submit" value="LogIn"/>
</td>
   
        </tr>
         </table>


</form>
</body>
</html>