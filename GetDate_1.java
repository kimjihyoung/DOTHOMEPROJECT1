package kr.co.dothome.std08219;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class GetDate_1 {


			public static void main(String[] args) {
				System.out.print(" 이 프로그램은 현재 날짜를 구해 원하는 날짜와의 \n 시간 간격을 알려주는 프로그램입니다\n  ");
				System.out.print("계산하려는 날짜를  YYYY/MM/DD 00:00:00 형태로 입력하세요 \n (반드시 저 형태로 입력할것 예[2017/12/01 00:00:00]입력한뒤 엔터) : ");
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
					System.out.print(" 구하려는 날짜는 현재 시간으로부터 "+diffDays + " 일 ");
					System.out.print(diffHours + " 시간 ");
					System.out.print(diffMinutes + " 분 ");
					System.out.print(diffSeconds + " 초  " + "남았습니다." );
					System.out.println("\n {이 프로그램은 2017/11/26일 김지형 님에 의해 만들어졌습니다}");

				} catch (Exception e) {
					e.printStackTrace();
				}

			}



	}


