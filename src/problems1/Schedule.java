package problems1;

import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.Comparator;
import java.util.List;


public class Schedule {
	
	static class Meeting {
		final String beggining;
		final String end;
		public Meeting(String beggining, String end) {
			super();
			this.beggining = beggining;
			this.end = end;
		}
		public String getBeggining() {
			return beggining;
		}
		public String getEnd() {
			return end;
		}
		
	}
	
	

	public static void main(String[] args) {
		String[][] m1 = {{"09:00","10:00"},{"12:00","13:00"},{"16:00","18:00"}};
		String[] r1 = {"09:00","20:00"};
		
		String[][] m2 = {{"10:00","11:30"},{"12:30","14:30"},{"14:30","15:00"},{"16:00","17:00"}};
		String[] r2 = {"10:00","18:30"};
		int mL = 30;
		// Sample output [['11:30','12:00'],['15:00','16:00'],['18:00','18:30']]
		
		List<Schedule.Meeting> mergedMeetings = new ArrayList<Schedule.Meeting>();
		
		for (String[] meeting : m1) {
			Meeting meeting1 = new Meeting(meeting[0],meeting[1]);
			mergedMeetings.add(meeting1);
		}
		
		for (String[] meeting : m2) {
			Meeting meeting2 = new Meeting(meeting[0],meeting[1]);
			mergedMeetings.add(meeting2);
		}
		
		mergedMeetings.sort((Meeting meet1,Meeting meet2) -> compareTimes(meet1,meet2));
		
		System.out.println("-----------------------------------------------------------------------");
		mergedMeetings.forEach(meet -> System.out.println(meet.getBeggining() + " " + meet.getEnd()));
		System.out.println("-----------------------------------------------------------------------");
		// 
		// ArrayList<String[]> bookedTimes = new ArrayList<String[]>();
		
		for (int i =0; i< mergedMeetings.size();i++) {
			// if (convertTimeToInt(mergedMeetings[i]) + 30 <= convertTimeToInt(mergedMeetings[i+1])) {
				
			// }
		}
		
		int j = 0;
		while(j<mergedMeetings.size()) {
			
		}
		
		findTime(m1,m2,r1,r2,mL);
//		{"09:00","10:00"},{"10:00","11:30"},{"12:00","13:00"},{"12:30","14:30"},{"14:30","15:00"},{"16:00","17:00"},{"16:00","18:00"}

	}
	
	private static void findTime(String[][] m1, 
			String[][] m2,
			String[] r1,
			String[] r2,
			int mL) {
		
//		ArrayList<String[]> bookedTimes = new ArrayList<String[]>();
 		
//		int i = 0;
//		int j = 0;
//		while (i<m1.length && j<m2.length) {
//			if (compareTimes(m1[i][0],m2[j][0]) <= 0){
//				bookedTimes.add(m1[i]);
//				bookedTimes.add(m2[j]);
//				i++;
//				j++;
//			} else if (compareTimes(m1[i][0],m2[j][0]) == 1) {
//				bookedTimes.add(m2[j]);
//				bookedTimes.add(m1[i]);
//				j++;
//				i++;
//			}
//		}
//		
//		for (String[] time : bookedTimes)
//			System.out.println(time[0] + " " + time[1]);
//		
	}
	
	private static int compareTimes(Meeting tP1, Meeting tP2) {
		int intTimeP1 = convertTimeToInt(tP1.getBeggining());
		int intTimeP2 = convertTimeToInt(tP2.getBeggining());
		
		
		if (intTimeP1 > intTimeP2) {
			return 1;
		} else if(intTimeP1 < intTimeP2) {
			return -1;
		} else {
			int endTimeP1 = convertTimeToInt(tP1.getEnd());
			int endTimeP2 = convertTimeToInt(tP2.getEnd());
			if (endTimeP1 > endTimeP2) {
				return 1;
			} else if (endTimeP1 < endTimeP2) {
				return -1;
			} else {
				return 0;
			}
			
		}
	}
	
	private static int convertTimeToInt(String time) {
		System.out.println(Integer.parseInt(time.substring(0,2))*60 + 
				Integer.parseInt(time.substring(3,5)));
		return Integer.parseInt(time.substring(0,2))*60 + 
				Integer.parseInt(time.substring(3,5));
	}

}
