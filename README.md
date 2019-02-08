# ejb-remote-with-role-auth
Sample remote standalone ejb client with authorization by role.

To proper run setup user and group on Weblogic 12c console http://127.0.0.1:7001/console

1) Create new role
   Security Realms -> myrealm -> Roles and Policies -> 
   Global Roles -> Roles -> NEW -> 
   Name: gore2s -> OK 

2) Create new user
   Security Realms -> myrealm -> Users and Groups ->
   New -> Name: gore2s -> Password: gore2s+++ -> Confirm Password: gore2s+++ -> OK

3)  Assign user to role
   Security Realms -> myrealm -> Roles and Policies -> 
   Global Roles -> Roles -> gore2s -> 
   Add conditions -> Predicate List -> User -> Next -> User Argument Name: gore2s -> Add -> Finish -> Save

