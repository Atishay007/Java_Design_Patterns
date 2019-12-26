package com.atishay.creational.design.pattern;

/**
 * Builder Pattern This pattern falls in the category of Creational Pattern.
 * Builder Pattern gives the full Object along with required fields to be
 * populated.
 * 
 * @author Atishay
 *
 */
public class BuilderPattern {

	public static void main(String[] args) {
		Patient pat = new Patient.PatientBuilder("Atishay").withLastName("Jain").build();

		System.out.println("First Name:" + pat.getFirstName());
		System.out.println("Last Name:" + pat.getLastName());
	}

}

class Patient {
	private String firstName;
	private String lastName;
	private String middleName;
	private Long id;

	private Patient(PatientBuilder builder) {
		this.id = builder.id;
		this.firstName = builder.firstName;
		this.middleName = builder.middleName;
		this.lastName = builder.lastName;
	}

	public static class PatientBuilder {
		private String firstName;
		private String lastName;
		private String middleName;
		private Long id;

		public PatientBuilder(String firstName) {
			this.firstName = firstName;
		}

		public PatientBuilder withMiddleName(String middleName) {
			this.middleName = middleName;
			return this;
		}

		public PatientBuilder withLastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public PatientBuilder withPatientId(long id) {
			this.id = id;
			return this;
		}

		public Patient build() {
			return new Patient(this);
		}
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
