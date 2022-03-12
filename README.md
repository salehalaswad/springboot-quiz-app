# Getting Started

####1 - create a database with MySQL
####4 - copy the JBDC URL to the application.properties file
####2 - enter the username and the password for the connection
####3 - open Postman and send a post request to the API
request must be like: <br />
{ <br />
&nbsp;&nbsp;"question":{ <br />
&nbsp;&nbsp;&nbsp;&nbsp;"text":"3 * 4?" <br />
}, <br />
&nbsp;&nbsp;"options":{ <br />
&nbsp;&nbsp;&nbsp;&nbsp;"first":"13", <br />
&nbsp;&nbsp;&nbsp;&nbsp;"second":"12", <br />
&nbsp;&nbsp;&nbsp;&nbsp;"third":"14" <br />
}, <br />
&nbsp;&nbsp;"answer": { <br />
&nbsp;&nbsp;&nbsp;&nbsp;"rOption":"second" <br />
&nbsp;&nbsp;} <br />
} <br />