<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Flights</title>
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

<form action="findFlights" method="post">
<Table>
<caption><b><font size="6">Find Flights</font></b></caption>

<tr>
<td>From:<input type="text" name="from"></td>
</tr>
<tr>
<td>To:<input type="text" name="to"></td>
</tr>
<tr>
<td>Date of Departure:<input type="text" name="departureDate"></td>
</tr>
<tr>
 <td colspan="2" style="text-align: center;">
<input type="submit" name="search"></td>
</tr>

</Table>
</form>

</body>
</html>