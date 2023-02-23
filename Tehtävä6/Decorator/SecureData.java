import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

public class SecureData extends DataDecorator {

    private static final String ALGORITHM = "AES";
    private static final String KEY = "MySecretKey12345";

    public SecureData(IData data) {
        super(data);
    }

    @Override
    public String readData(String fileName) {

        String encryptedData = super.readData(fileName);
        String decryptedData = null;
        try {
            decryptedData = decrypt(encryptedData);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return "Decrypted data: " + decryptedData;
    }

    @Override
    public void setData(String data, String fileName) {
        String encrypterData = encrypt(data);
        super.setData(encrypterData, fileName);
    }

    public String encrypt(String content) {
        SecretKeySpec keySpec = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
        Cipher cipher;
        byte[] encryptedValue = null;
        try {
            cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.ENCRYPT_MODE, keySpec);
            encryptedValue = cipher.doFinal(content.getBytes());
        } catch (NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException
                | BadPaddingException e) {
            e.printStackTrace();
        }

        return Base64.getEncoder().encodeToString(encryptedValue);
    }

    public static String decrypt(String encryptedValue) throws Exception {
        try {
            SecretKeySpec keySpec = new SecretKeySpec(KEY.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(ALGORITHM);
            cipher.init(Cipher.DECRYPT_MODE, keySpec);
            byte[] decodedValue = Base64.getDecoder().decode(encryptedValue.trim());
            System.out.println("what is this " + decodedValue);
            byte[] decryptedValue = cipher.doFinal(decodedValue);
            return new String(decryptedValue);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "error";
    }

}
