import org.junit.jupiter.api.Test;
import warmup.SockMerchant;

import static org.junit.jupiter.api.Assertions.*;

public class SockMerchantTest {

    @Test
    public void stringsShouldBeEqualsFromValues() {

        // 1. Equals
        int[] socks1 =  {1, 2, 2, 1, 3, 5, 4};
        int[] socks2 =  {1, 2, 2, 1, 3, 5, 4, 5};
        int[] socks3 =  {1};
        int[] socks4 = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        assertEquals(2, SockMerchant.sockMerchant(7, socks1));
        assertEquals(3, SockMerchant.sockMerchant(8, socks2));
        assertEquals(0, SockMerchant.sockMerchant(1, socks3));
        assertEquals(3, SockMerchant.sockMerchant(9, socks4));
    }

}
