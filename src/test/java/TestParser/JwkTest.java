package TestParser;

import static org.junit.Assert.*;

import java.security.PublicKey;

import org.junit.Test;

import tcpip.crypto.jwk.parsers.JwtKeyHelper;
import tcpip.crypto.jwk.parsers.JwtParserException;

public class JwkTest {

	@Test
	public void test() {
//		/fail("Not yet implemented");
		try {
			PublicKey pubKey = JwtKeyHelper.parseJwtPublicKeyMaterial("hU6SR9PKwulOryAXq74ugsEsO95281As6zvnt33pfGo7iMy2266Jqcy_amC7JGfm4ErKiUaJbGnTEYXayTaaNAqCAmtNtsYNjYA1wAsO5xOpbvmg1krBqYmbErM87RooqToPbrKXm0GuneL1FYDtNn3RD3hDttUs-wNSYHWrN3QsDBTua_qEDBrP-mUXu7H3z1p4VlvlOrKrIkwHOpIi1vr7v-m8gedfGRloLCGlgedYwpgzX-xgeL3sI4vinM_ZpwohFbXJe9edlrhm6b6NqLUYa9ekGqXfQLON_oOm1Q-BfeG29JvH5kPzgF5MNR7GZ7Lz_5kp5dcaWUBYyPcXAw", "AQAB", "RSA");
			byte[] bits = pubKey.getEncoded();
			System.out.println(pubKey.getFormat());
			for (byte b: bits){
				System.out.print(b);
			}
		} catch (JwtParserException e) {
			// TODO Auto-generated catch block
			System.out.printf("exception %s code %d",e.getMessage(),e.getCode());
			
		}
	}

}
