package spring.my_pham.global.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "medication")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Medication {
	@Id
	@Column(name = "medicine_id")
	private Integer medicineId;

	@Column(name = "medicine_name")
	private String medicineName;

	@Column(name = "dosage")
	private Integer dosage;

	@Column(name = "method")
	private String method;

	@Column(name = "time")
	private LocalDateTime time;

	@Column(name = "deleted")
	@ColumnDefault("false")
	private Boolean deleted;

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Medication(String medicineName, Integer dosage, String method, LocalDateTime time, Boolean deleted) {
		this.medicineName = medicineName;
		this.dosage = dosage;
		this.method = method;
		this.time = time;
		this.deleted = deleted;
	}
}
