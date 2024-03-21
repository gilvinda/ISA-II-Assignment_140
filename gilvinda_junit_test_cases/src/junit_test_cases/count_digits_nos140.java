package junit_test_cases;

public class count_digits_nos140 {

		 int  count = 0;
		public int count_digits(int num) {
			 while (num != 0) {
			      num /= 10;
			      ++count;
			}
			return count;

		  }
	}



