public class User {

    private String name;
    private String email;

    public User(String name, String email) {
            this.name = name;
            this.email = email;
    }

        public void register() {

            System.out.println("User registered: " + name + ", " + email);
        }

        public void login() {

            System.out.println("User logged in: " + name);
        }

        public void logout() {

            System.out.println("User logged out: " + name);
        }

        public String getName() {
            return name;
        }

        public String getEmail() {
            return email;
        }


}




