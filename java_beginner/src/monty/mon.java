package monty;

public class mon {
    public static void main(String[] args) {

        int normal_win_rate=0; // �ٲ��� �ʾƼ� �̱� Ƚ��
        int normal_lose_rate=0; // �ٲ��� �ʾƼ� �� Ƚ��
        int change_win_rate=0; // �ٲ㼭 �̱� Ƚ��
        int change_lose_rate=0; // �ٲ㼭 �� Ƚ��

        for(int i=0;i<100000;i++){ // �� 10�� �� �ݺ��Ѵ�.
            int reward = (int)(Math.random()*3+1); // �����ڴ� 1~3�� ������ �ϳ� ����
            int answer = (int)(Math.random()*3+1); // �����ڴ� 1~3�� �ϳ��� ��

            /*�̶� �����ڴ� ���Ҹ� �� �� �����ڿ��� �ٲ��� ���� �����Ѵ�.*/
            
            //�����ڴ� �������� ��� ������ �ƴ� ���� ����
            int val = (int)(Math.random()*3+1);
            while(reward == val || answer == val){
                val = (int)(Math.random()*3+1);
            }

            //�ٲ��� �ʾ��� ��
            if(reward == answer) normal_win_rate++; //�ٲ��� �ʾƼ� �̰��� ��� 1�� �߰�
            else normal_lose_rate++; //�ٲ��� �ʾƼ� ���� ��� 1�� �߰�

            //�ٲ��� ��
            int change = (int)(Math.random()*3+1);
            while(val == change || answer == change){ //�̶� �����ڴ� �ٲٱ�� ����
                change = (int)(Math.random()*3+1);
            }
            if(reward == change) change_win_rate++; //�ٲ㼭 �̰��� ��� 1�� �߰�
            else change_lose_rate++; //�ٲ㼭 ���� ��� 1�� �߰�

        }

        System.out.println("normal_win_rate : "+normal_win_rate); // �ٲ��� �ʾƼ� �̱� Ƚ�� ���
        System.out.println("normal_lose_rate : "+normal_lose_rate); // �ٲ��� �ʾƼ� �� Ƚ�� ���
        long normal_rate = (normal_win_rate*100)/(normal_win_rate+normal_lose_rate); //Ȯ�����
        System.out.println("rate : "+normal_rate+"%"); //�ٲ��� �ʾƼ� �̱� Ȯ��
        System.out.println();

        System.out.println("change_win_rate : "+change_win_rate); // �ٲ㼭 �̱� Ƚ�� ���
        System.out.println("change_lose_rate : "+change_lose_rate); // �ٲ㼭 �� Ƚ�� ���
        long change_rate = (change_win_rate*100)/(change_win_rate+change_lose_rate); //Ȯ�����
        System.out.println("rate : "+change_rate+"%"); //�ٲ㼭 �̱� Ȯ��

    }
}