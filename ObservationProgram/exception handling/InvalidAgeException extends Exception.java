class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void checkVotingEligibility(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Must be 18 or older to vote.");
        }
    }

    public static void main(String[] args) {
        try {
            checkVotingEligibility(16);
        } catch (InvalidAgeException e) {
            System.err.println("Caught Custom Exception: " + e.getMessage());
        }
    }
}
