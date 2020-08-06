import java.awt.*; //classes  BorderLayout e GridLayout
import javax.swing.*;  //classes JFrame, JLabel, JButton, JPanel
import java.awt.event.*; //classe MouseAdapter

//funcionando
public class Calculadora  {
	private JFrame janela = new JFrame("Calculadora");
	private JLabel visor = new JLabel("0", JLabel.RIGHT);
	private JButton botao [] = new JButton [16];
	
	
	private class TratadorTeclado implements KeyListener{
		
		public void keyTyped(KeyEvent e)
		{
			if ((int)e.getKeyChar()==KeyEvent.VK_ENTER)
				e.setKeyChar('=');
			
			if ((int)e.getKeyChar()==KeyEvent.VK_ESCAPE|| e.getKeyChar()=='C'||e.getKeyChar()=='c')
				e.setKeyChar('C');
				
			for (int i=0; i < botao.length;i++){
				if (e.getKeyChar()==botao[i].getText().charAt(0))
					botao[i].doClick();
			}
		}
		public void keyPressed(KeyEvent e){
			
		}
		public void keyReleased(KeyEvent e){
			
		}
	}
	private class TratadorRedimencionamento implements ComponentListener {
		
		public void componentResized (ComponentEvent e){
			
			Font fonteVisor = new Font ("Arial",Font.PLAIN,
					Math.min(janela.getHeight(),janela.getWidth())*26/300);
			Font fonteBotao = new Font ("Arial",Font.PLAIN,
					Math.min(janela.getHeight(),janela.getWidth())*22/300);
			visor.setFont(fonteVisor);
			
			for (int i=0;i<botao.length;i++){
				botao[i].setFont(fonteBotao);
			}
		}
		
		public void componentMoved (ComponentEvent e){
			
		}
		public void componentHidden (ComponentEvent e){
			
		}
		public void componentShown (ComponentEvent e){
			
		}
		
	}
	private class TratadorEventosMouse implements ActionListener {

		private boolean substitui = true;
		private char operador = ' ';
		private double operando1;
		
		private void tratarClickEmDigito (char dig) {
			if (substitui) {
				visor.setText(" " + dig);
				substitui = false;
			}
			else {
				visor.setText(visor.getText() + dig);
			}	
		}
		private void tratarClickEmOperacao (char oper) {
			tratarClickEmResultado();
			operando1 = new Double(visor.getText()).doubleValue();
			operador = oper;
		}
		private void tratarClickEmResultado () {
			if (operador != ' ') {
				double operando2 = new Double(visor.getText()).doubleValue();
				double resultado = 0;
				switch (operador){
					case '+' : 	resultado = operando1 + operando2;
							break;
					case '-' : 	resultado = operando1 - operando2;
							break;
					case '*' : 	resultado = operando1 * operando2;
							break;
					case '/' : 	resultado = operando1 / operando2;
				}
				//para não aparecer casa decimal quando for número inteiro
				if (((long)resultado) == resultado)
					visor.setText(" " + ((long)resultado));
				else
					visor.setText(" " + resultado);
				
				operador = ' ';
			}
			substitui = true;
		}
		private void tratarClickEmLimpar() {
			visor.setText("0");
			operador = ' ';
			substitui = true;
		}
		
		public void actionPerformed (ActionEvent e) {
			
		 
				
				//descobrir qual botão foi clicado e armazenar em "c"
				char c = ((JButton)e.getSource()).getText().charAt(0);
				
				if ( Character.isDigit(c) )
						tratarClickEmDigito(c);
				
				if ( c == '+' || c == '-' || c == '*' || c == '/' )		
						tratarClickEmOperacao(c);

				if ( c == '=' )			
						tratarClickEmResultado();

				if ( c == 'C' )			
						tratarClickEmLimpar();
			
		}
	}
	
	public Calculadora () {
		BorderLayout layoutCalc=new BorderLayout(); //North South East West Center
		GridLayout layoutBotoes=new GridLayout(4, 4); //matriz: 4 lin e 4 col
		JPanel botoes = new JPanel();  //container botoes (agrupa os buttons)	
		
		TratadorEventosMouse tm = new TratadorEventosMouse();
		TratadorRedimencionamento tr = new TratadorRedimencionamento();
		TratadorTeclado tt = new TratadorTeclado();
		
		String texto []  =  { "7","8","9","+",
					"4","5","6","-",
					"1","2","3","*",
					"0","=","C","/"}; //em ordem p/matriz JPanel 4x4
		
		for (int i=0; i<botao.length; i++) {
			botao[i] = new JButton(texto[i]);
			botoes.add(botao[i]);
			botao[i].addActionListener(tm);
			botao[i].addKeyListener(tt);
		}
			
		janela.setSize(300, 300);
		janela.setVisible(true);
	janela.getContentPane().setLayout(layoutCalc);
	// ou janela.setLayout(layoutCalc);
		botoes.setLayout(layoutBotoes);
		
		janela.add(visor, BorderLayout.NORTH); //ou janela.add("North", visor);
		// ou janela.add(visor, layoutCalc.NORTH);
		// ou janela.add("North", visor);
		
		janela.add(botoes, BorderLayout.CENTER); //janela.add("Center", botoes);
		janela.addComponentListener(tr);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
}