import org.jasypt.util.password.StrongPasswordEncryptor;

public class EncryptEmployeePassword {
    public static void main(String[] args) {
        StrongPasswordEncryptor encryptor = new StrongPasswordEncryptor();
        String encrypted = encryptor.encryptPassword("classta");
        System.out.println("Encrypted password: " + encrypted);
    }
}