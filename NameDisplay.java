   class NameDisplay{
    public static void main(String[] args) {
        // Check if there are two command-line arguments (first name and last name)
        if (args.length == 2) {
            String firstName = args[0];
            String lastName = args[1];
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
        } else {
            System.out.println("Please provide both first name and last name as command-line arguments.");
        }
    }
}