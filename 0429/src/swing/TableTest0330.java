package swing;

import java.awt.Container;
import java.util.ArrayList;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TableTest0330 extends JFrame  {
	private ArrayList<Person> list = new ArrayList<>();
	private Vector <String> tableTitle;
	private DefaultTableModel model;
	private JTable table;
	
	void addArrayList() {
		list.add(new Person("Ȧ1","111-2222"));
		list.add(new Person("Ȧ2","111-2222"));
		list.add(new Person("Ȧ3","111-2222"));
	}
	
	public TableTest0330() {
		addArrayList();
		
		//Ÿ��Ʋ �����
		tableTitle = new Vector<String>();
		tableTitle.addElement("�̸�");
		tableTitle.add("�ڵ���");
		
		//defaultTableModel ����
		model = new DefaultTableModel(tableTitle, 0);
		table = new JTable(model);
		JScrollPane scroll = new JScrollPane(table);
		
		//�����͸� Vector ����Ʈ ���������߰�
		for(Person data:list)
		{
			Vector<String>v = new Vector<>();
			v.add(data.getName());
			v.add(data.getTel());
			model.addRow(v); //���� ���̺� ��Ÿ��
		}
		
		//����â
		JPanel pn = new JPanel();
		JTextField fd1 = new JTextField(15);
		JTextField fd2 = new JTextField(15);
		
		pn.add(fd1); pn.add(fd2);
		
//		int srow=table.getSelectedRow();
//		String name=(String) 
//		table.getValueAt(srow, 0);
//		String tel=(String) 
//		table.getValueAt(srow, 1);
		
//		fd1.setText(name);
//		fd2.setText(tel);
		//container �߱�
		Container c = getContentPane();
		c.add("North",pn);
		c.add("Center",scroll);
		//������ ����
		this.setBounds(700,100,500,400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		
		new TableTest0330();
	}
}
