package com.time;

/*Write the definition for a class called Time that has hours and minutes as integer. The class has the following behaviours/services/methods:
 void setTime(int, int) to set the specified value in object
 void showTime() to display time object
 time sum(time) to sum two time object & return time
 1. Write the definitions for each of the above member functions.
 2. Write main function to create three time objects. Set the value in two objects and call sum() to calculate sum and assign it in third object. Display all time objects.*/

public class Time {
	private int hours;
	private int minutes;

	public void set(int hours, int minutes) {
		if (hours > 24 && minutes > 60) {
			this.hours = -1;
			this.minutes = -1;
		} else {
			this.hours = hours;
			this.minutes = minutes;
		}
	}

	public float getHour() {
		return this.hours;
	}

	public float getMinute() {
		return this.minutes;
	}

	public Time sum(Time object1, Time object2) {
		if (object1.minutes < 0 || object1.hours < 0 || object2.minutes < 0
				|| object2.hours < 0) {
			this.hours = -1;
			this.minutes = -1;
			return this;
		} else {
			int minuteSum = this.minutes + object1.minutes + object2.minutes;
			if (minuteSum > 59) {
				if (minuteSum == 60)
					this.hours = this.hours + 1;
				else {
					int minutesGreaterThanSixty = minuteSum - 60;
					this.hours = this.hours + 1;
					this.minutes = this.minutes + minutesGreaterThanSixty;
				}
			} else
				this.minutes = minuteSum;
			int hourSum = this.hours + object1.hours + object2.hours;
			if (hourSum > 23) {
				if (hourSum == 24)
					this.hours = 00;
				else {
					int hoursGreatorThanTwentyFour = hourSum - 24;
					this.hours = hoursGreatorThanTwentyFour;
				}
			} else
				this.hours = hourSum;
			return this;
		}
	}

	@Override
	public String toString() {
		return "Time [hours=" + hours + ", minutes=" + minutes + "]";
	}
}
