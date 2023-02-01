package ex4_memo_app;

import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Memo {
	public static void main(String[] args) {

		Frame frame = new Frame("메모장");
		frame.setBounds(500, 200, 250, 400);
		frame.setLayout(null);// 자동배치 끄기
		frame.setBackground(Color.lightGray);
		
		Font font = new Font("", Font.PLAIN, 20);
		
		//상단에 자리잡을 컴포넌트들-------
		TextField tf = new TextField();
		tf.setBounds(10,35, 180, 20);
		
		Button btn = new Button("OK");
		btn.setBounds(195, 35, 45, 20);
		//상단------------------------
		
		//중앙에 자리잡을 컴포넌트--------
		TextArea ta = new TextArea( "", 0, 0, TextArea.SCROLLBARS_VERTICAL_ONLY );
		ta.setBounds(10, 60, 225, 280);
		ta.setFont(font);
		ta.setEditable(false);//ta에 직접적으로 값을 입력하는것을 방지
		
		//ta.setText("안녕\nhi hello\n반가워");
		//ta.getText(); --> ta에 쓰여있는 내용 가져오기
		
		//중앙------------------------
		
		//하단에 자리잡을 컴포넌트-----------
		Button btnSave = new Button("저장");
		btnSave.setBounds(20, 345, 100, 40);
		
		Button btnClose = new Button("닫기");
		btnClose.setBounds(130, 345, 100, 40);
		
		//닫기버튼에 프레임을 종료하는 감지자 등록
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		//하단-------------------------
		
		
		//frame에 컴포넌트 추가
		frame.add(tf);
		frame.add(btn);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);
		
		
		// 종료-----------------------
		frame.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {

				System.exit(0);// 열려있는 모든 프레임을 종료

			}

		});
		
		//만들어진 프레임의 크기조정 불가
		frame.setResizable(false);
		
		//보이게 만들기 ----------------
		frame.setVisible(true);
	}// main
}
