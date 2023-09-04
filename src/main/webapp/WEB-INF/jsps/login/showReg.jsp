<!DOCTYPE html>
<html>
<head>
    <title>New Registration</title>
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
        input[type="text"], input[type="password"], input[type="email"] {
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

        /* Style for the header */
        h2 {
            text-align: center;
        }
    </style>
</head>
<body>
 

<form action="saveReg" method="post">
    <table>
   <caption><b><font size="6">New Registration</font></b></caption>
        <tr>
            <th><label for="firstName">First Name:</label></th>
            <td><input type="text" id="firstName" name="firstName" required></td>
        </tr>
        <tr>
            <th><label for="lastName">Last Name:</label></th>
            <td><input type="text" id="lastName" name="lastName" required></td>
        </tr>
        <tr>
            <th><label for="email">Email:</label></th>
            <td><input type="email" id="email" name="email" required></td>
        </tr>
        <tr>
            <th><label for="password">Password:</label></th>
            <td><input type="password" id="password" name="password" required></td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: center;">
                <input type="submit" value="Save">
            </td>
        </tr>

    </table>
</form>
<div ><a href="showLoginPage">Already a user? Click Here To Log In</a></div>

</body>
</html>
