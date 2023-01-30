package ex6_base64;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class Base64_Main {
	public static void main(String[] args) {

		Encoder encoder = Base64.getEncoder();
		Decoder decoder = Base64.getDecoder();

		String text = "��ȣȭ �۾� ��ŸƮ";// ����

		// encoder�� ���� ��ȣȭ
		byte[] encodeByte = encoder.encode(text.getBytes());
		System.out.println("��ȣȭ : " + new String(encodeByte));

		// decodeByte�� ���� ��ȣȭ (��ȣȭ �ϰ���� ����Ʈ �迭�� decodeByte�� ����ش�)
		byte[] decodeByte = decoder.decode(encodeByte);
		System.out.println("��ȣȭ : " + new String(decodeByte));

	}// main
}
