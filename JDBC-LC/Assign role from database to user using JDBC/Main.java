import java.util.*;
import java.io.*;
public class Main {

       public static void main(String[] args) throws Exception {
                int choice, roleId, c = 0;
                                String userDetails;
                                Role role = null;
                                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                                User user;
                                while (true) {
                                                System.out.println("1. Create User\n2. Display Details\n3. Exit\nEnter the choice :");
                                                choice = Integer.parseInt(br.readLine());
                                                switch (choice) {
                                                case 1:
                                                                System.out.println("Enter the user details:");
                                                                userDetails = br.readLine();
                                                                String[] split = userDetails.split(",");
                                                                String name = split[0];
                                                                String username = split[1];
                                                                String password = split[2];
                                                                String mobile = split[3];

                                                                System.out.println("Role details:");
                                                                System.out.format("%-15s %-25s %s\n", "Role id", "Role name", "Role description");
                                                                List<Role> rolelist = new RoleDAO().getAllRoles();
                                                                for (Role role2 : rolelist) {
                                                                                System.out.println(role2);
                                                                }
                                                                System.out.println("Enter the role id:");
                                                                roleId = Integer.parseInt(br.readLine());

                                                                for (Role role2 : rolelist) {
                                                                                if (role2.getId().equals(roleId)) {
                                                                                                role = role2;
                                                                                }
                                                                }
                                                                user = new User(name, username, password, mobile, role);
                                                                new UserDAO().createUser(user);
                                                                break;
                                                case 2:
                                                                new UserDAO().displayDetails();
                                                                break;
                                                case 3:
                                                                System.exit(0);
                                                }
                                }
                }

}