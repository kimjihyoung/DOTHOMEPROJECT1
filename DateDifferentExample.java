package kr.co.dothome.std08219;

	import java.text.SimpleDateFormat;
	import java.util.Date;
	import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;


	public class DateDifferentExample {

		public static void main(String[] args) {
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
			String formatDateTime = now.format(formatter);
			String dateStart = formatDateTime;
			String dateStop = "2017/12/01 00:00:00";

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

				System.out.print(" 김지형님과 관련된 모든 게임 비밀번호 변경일까지 "+diffDays + " 일 ");
				System.out.print(diffHours + " 시간 ");
				System.out.print(diffMinutes + " 분 ");
				System.out.print(diffSeconds + " 초  " + "남았습니다." );

			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}

