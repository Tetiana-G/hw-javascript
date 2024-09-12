ublic class PasswordChecker {

    public static String checkPasswordStrength(String password) {
        if (password.length() < 8) {
            return "Weak";
        }

        boolean hasDigit = false;
        boolean hasLowerCase = false;
        boolean hasUpperCase = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isDigit(c)) {
                hasDigit = true;
            }

            if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            }

            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            }
        }

        if (hasDigit && hasLowerCase && hasUpperCase) {
            return "Strong";
        } else {
            return "Weak";
        }
    }

    public static void main(String[] args) {
        System.out.println(checkPasswordStrength("password"));     // Weak
        System.out.println(checkPasswordStrength("Password123"));  // Strong
    }
}