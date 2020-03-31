import com.yxb.relcommon.security.AES_CBCUtils;
import org.junit.Test;
import org.springframework.security.crypto.keygen.KeyGenerators;

/**
 * @author YingXB
 * @date 2020/03/31 15:56
 */
public class AES_CBCTest {

    @Test
    public void encodingTest() {
        String salt = KeyGenerators.string().generateKey();
        String pwd = AES_CBCUtils.encode("123456", "admin@163.com", salt);
        System.out.println(salt);
        System.out.println(pwd);
    }
}
