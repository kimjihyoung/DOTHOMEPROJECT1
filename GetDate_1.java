package kr.co.dothome.std08219;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class GetDate_1 {


			public static void main(String[] args) {
				System.out.print(" �� ���α׷��� ���� ��¥�� ���� ���ϴ� ��¥���� \n �ð� ������ �˷��ִ� ���α׷��Դϴ�\n  ");
				System.out.print("����Ϸ��� ��¥��  YYYY/MM/DD 00:00:00 ���·� �Է��ϼ��� \n (�ݵ�� �� ���·� �Է��Ұ� ��[2017/12/01 00:00:00]�Է��ѵ� ����) : ");
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				String st = "";
				st = sc.nextLine();
				LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
				String formatDateTime = now.format(formatter);
				String dateStart = formatDateTime;
				String dateStop = st;

				//HH converts hour in 24 hours format (0-23), day calculation
				SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

				Date d1 = null;
				Date d2 = null;

				try {
					d1 = format.parse(dateStart);
					d2 = format.parse(dateStop);

					//in milliseconds
					long diff = d2.getTime() - d1.getTime();

					long diffSeconds = diff / 1000 % 60;
					long diffMinutes = diff / (60 * 1000) % 60;
					long diffHours = diff / (60 * 60 * 1000) % 24;
					long diffDays = diff / (24 * 60 * 60 * 1000);
					System.out.print(" ���Ϸ��� ��¥�� ���� �ð����κ��� "+diffDays + " �� ");
					System.out.print(diffHours + " �ð� ");
					System.out.print(diffMinutes + " �� ");
					System.out.print(diffSeconds + " ��  " + "���ҽ��ϴ�." );
					System.out.println("\n {�� ���α׷��� 2017/11/26�� ������ �Կ� ���� ����������ϴ�}");

				} catch (Exception e) {
					e.printStackTrace();
				}

			}



	}


