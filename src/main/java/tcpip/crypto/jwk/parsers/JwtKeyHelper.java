package tcpip.crypto.jwk.parsers;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Base64;


/**
 * Esta clase contiene 
 * @author santibayo
 *
 */
public class JwtKeyHelper  {
	
	public static PublicKey parseJwtPublicKeyMaterial(String Base64Mod, String Base64Exp,String alg)throws JwtParserException{
		BigInteger bim = getModulus(Base64Mod);
		BigInteger bie = getExponent(Base64Exp);
		try {
			return KeyFactory.getInstance(alg).generatePublic(new RSAPublicKeySpec(bim, bie));
		} catch (InvalidKeySpecException e) {
			JwtParserException jpe = new JwtParserException(e);
			jpe.setCode(10101);
			throw jpe;
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			JwtParserException jpe = new JwtParserException(e);
			jpe.setCode(10102);
			throw jpe;
		}
	}
	private static BigInteger getModulus(String b64m){
		BigInteger bim = new BigInteger(1, Base64.getMimeDecoder().decode(b64m));
		return bim;
	}
	private static BigInteger getExponent(String b64e){
		BigInteger bim = new BigInteger(1, Base64.getMimeDecoder().decode(b64e));
		return bim;
	}
	
	
}
