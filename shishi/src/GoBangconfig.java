import java.awt.Dimension;
import java.awt.Image;
import javax.swing.ImageIcon;

//����������������صĽӿڣ��������̵���㣬���Ӵ�С��������������Ϣ
public interface GoBangconfig {
	int X=170;
	int Y=20;
	int SIZE=50;
	int ROW=15;
	int COLUMN=15;
	int UIWIDTH=1265;
	int UIHIGHTH=785;
	int MESSAGEWIDTH=240;//�����ұ���Ϣ���Ŀ��

	Dimension dim1=new Dimension(MESSAGEWIDTH,0);//�����ұ���Ϣ���Ĵ�С
	Dimension dim2=new Dimension(145,40);//���õ�¼��ť����Ĵ�С
	Dimension dim3=new Dimension(120,120);//����ͷ������Ĵ�С
	Dimension dim4=new Dimension(140,45);//�����ұ߰�ť����Ĵ�С
}
