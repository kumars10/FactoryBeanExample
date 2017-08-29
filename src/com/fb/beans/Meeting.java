package com.fb.beans;

import java.util.Calendar;
import java.util.List;

public class Meeting {
private int meetingno;
private String meetingname;
private List participants;
private Calendar meetingdate;
public void setMeetingno(int meetingno) {
	this.meetingno = meetingno;
}
public void setMeetingname(String meetingname) {
	this.meetingname = meetingname;
}
public void setParticipants(List participants) {
	this.participants = participants;
}
public void setMeetingdate(Calendar meetingdate) {
	this.meetingdate = meetingdate;
}
@Override
public String toString() {
	return "Meeting [meetingno=" + meetingno + ", meetingname=" + meetingname + ", participants=" + participants
			+ ", meetingdate=" + meetingdate + "]";
}

}
