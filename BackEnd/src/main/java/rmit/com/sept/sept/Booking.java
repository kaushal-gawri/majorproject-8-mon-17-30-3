package rmit.com.sept.sept;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/* Booking Class:	
 * 			This class is used to create a booking table in MYSQL
 */
@Entity
@Table(name = "booking")
public class Booking {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "booking_id")
	public int booking_id;

	@NotNull(message="User id is compulsory")
	@Column(name = "user_id")
	public int user_id;

	@NotNull(message="Service name is compulsory")
	@Column(name = "servicename")
	public String serviceName;

	@Column(name = "workerName")
	public String workerName;

	@Column(name = "status")
	public String status;

	@Column(name = "date")
	public String date;

	@Column(name = "time")
	public String time;
	
	
	public Booking(int user_id,int booking_id,String date, String time,String serviceName, String workerName) {
		this.user_id = user_id;
		this.booking_id = booking_id;
		this.date = date;
		this.time = time;
		this.serviceName = serviceName;
		this.workerName = workerName;
		
	}
	
	public Booking() {
		
	}

	public int getBookingId() {
		return booking_id;
	}

	public void setBookingId(int id) {
		this.booking_id = id;
	}

	public int getUserBookingId() {
		return user_id;
	}

	public void setUserId(int user_id) {
		this.user_id = user_id;
	}

	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String name) {
		this.serviceName = name;
	}


	public String getWorkerName() {
		return workerName;
	}

	public void setWorkerName(String name) {
		this.workerName = name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setDate(String currentDate){
		this.date = currentDate;

	}

	public String getDate(){
		return this.date;

	}

	public void setTime(String time){
		this.time = time;
	}

	public String getTime(){
		return this.time;
	}

	
}