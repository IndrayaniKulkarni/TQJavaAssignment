package com.vaccinePerson;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class MyCentre {

	static int count = 0;
	static SimpleDateFormat f1 = new SimpleDateFormat("dd/MM/yyyy");
	static Scanner sc = new Scanner(System.in);

	public static void searchByName(Person p[], String name) {

		for (int i = 0; i < count; i++) {
			if (p[i].getName().equals(name)) {
				System.out.println(p[i]);
			}
		}
	}

	public static int searchByUHID(Person p[], int UHID) {

		for (int i = 0; i < count; i++) {
			if (p[i].getUhid() == UHID) {
//				System.out.println(p[i]);
				return i;
			}
		}
		return -1;
	}

	public static void vaccineDetails(Person p) {
		Vaccine v1 = new Vaccine("Pfizer-BioNTech vaccine", 2453, "Pfizer");
		Vaccine v2 = new Vaccine("Moderna vaccine", 2453, "Moderna");
		Vaccine v3 = new Vaccine("Janssen/Johnson & Johnson vaccine", 2453, "Johnson & Johnson");

		int v;
		System.out.println("1." + v1 + "\n2." + v2 + "\n3." + v3 + "\n");
		System.out.println("Which vaccine (input int)");
		v = sc.nextInt();

		switch (v) {
		case 1:
			p.setVaccine(v1);
			break;
		case 2:
			p.setVaccine(v2);
			break;
		case 3:
			p.setVaccine(v3);
			break;
		default:
			System.out.println("Error..");
			break;
		}
	}

	public static void addPerson(Person p) throws ParseException {

		System.out.println("UHID :" + p.getUhid());
		System.out.println("Name :");
		p.setName(sc.next());
		System.out.println("Date of Birth :");
		String bdate = sc.next();
		try {
			Date dateDob = f1.parse(bdate);
			p.setDob(dateDob);
			Date currentDate = new Date();
//			p.setAge(Math.abs(currentDate - p.getDob()));
//			System.out.println(dateDob);
		} catch (ParseException e) {
			System.out.println("Invalid date..");
		}

		System.out.println("Vaccine status :");
		System.out.println(Arrays.toString(p.getVaccineStatus()));
		System.out.println("enter vaccine date");
		if (p.getVaccineStatus() == null) {
			String s = sc.next();
			Date status = f1.parse(s);
			Date arr[] = new Date[3];
			arr[0] = status;
			p.setVaccineStatus(arr);
		} else if (p.getVaccineStatus()[0] != null && p.getVaccineStatus()[1] == null
				&& p.getVaccineStatus()[2] == null) {
			String s = sc.next();
			Date status = f1.parse(s);
			Date arr[] = new Date[3];
			arr[0] = p.getVaccineStatus()[0];
			arr[1] = status;
			p.setVaccineStatus(arr);
		} else if (p.getVaccineStatus()[0] != null && p.getVaccineStatus()[1] != null
				&& p.getVaccineStatus()[2] == null) {
			String s = sc.next();
			Date status = f1.parse(s);
			Date arr[] = new Date[3];
			arr[0] = p.getVaccineStatus()[0];
			arr[1] = p.getVaccineStatus()[1];
			arr[2] = status;
			p.setVaccineStatus(arr);
		}
		System.out.println("Aadhar Number (12 digits):");
		p.setAadharNo(sc.nextLong());
		System.out.println("Vaccine details :");
		vaccineDetails(p);

	}

	public static void deletePerson(Person[] p, int id) {
		boolean status = false;
		int regid = 1000;
		for (int i = 0; i < count; i++) {
			if (regid == id) {
				status = true;

				for (int j = i; j < count; j++) {
					p[j] = p[j + 1];
				}
				p[count - 1] = null;
				count--;
				System.out.println("Person deleted successfully...");
				break;
			} else {
				regid++;
			}
		}
		if (!status) {
			System.out.println("Record not found..");
		}
	}

	public static void updatePerson(Person p[], int id) throws ParseException {
		boolean status = false;
		int regid = 1000;
		for (int i = 0; i < count; i++) {
			if (regid == id) {

				status = true;
				System.out.println("Person details = ");
				System.out.println(p[i]);
				addPerson(p[id]);
				System.out.println("Person updated successfully...");
				break;
			} else {
				regid++;
			}
		}
		if (!status) {
			System.out.println("Record not found..");
		}
	}

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		String etc = "";
		System.out.println("\n-----------------No of enteries = \n");
		int n = sc.nextInt();
		Person p[] = new Person[n];
		int ch;

		char yOrN = 'n';
		int width = 50;
		String title = "VACCINATION CENTRE";
		System.out.println("__________________________________________________");
		int padding = (width - title.length()) / 2;
		do {
			
			
			System.out.format("%" + padding + "s%s%" + padding + "s%n", "", title, "");
			System.out.println();
			System.out.printf("\t"+"1. Add a person\n");
			System.out.println("\t"+"2. Update a person");
			System.out.println("\t"+"3. Delete a person");
			System.out.println("\t"+"4. Search a person");
			System.out.println("\t"+"5.Display a person list");
			System.out.println("\t"+"6. Exit");
			System.out.println("\tChoice = ");
			ch = sc.nextInt();
			int uhid = 1000;
			switch (ch) {
			case 1:
				if (count <= n) {
					p[count] = new Person(uhid+count+1);

					addPerson(p[count]);

//					LocalDate currentDate = LocalDate.now();
//					System.out.println("Current date: " + currentDate);
					count++;
				}
				break;
			case 2:
				System.out.println("UHID =");
				int id = sc.nextInt();
				int index = searchByUHID(p, id);
				if (index != 0) {
//			        	addPerson(p[index]);
				}
				break;
			case 3:
				System.out.println("UHID =");
				id = sc.nextInt();
				deletePerson(p, id);
				break;
			case 4:
				System.out.println("1. Search by ID");
				System.out.println("2. Search by name");
				System.out.println("choice = ");
				int s = sc.nextInt();
				switch (s) {
				case 1:
					System.out.println("UHID = ");
					id = sc.nextInt();
					if (searchByUHID(p, id) != -1) {
						System.out.println(p[searchByUHID(p, id)]);
					} else {
						System.out.println("Record not found..");
					}
					break;
				case 2:
					System.out.println("Name = ");
					String name = sc.next();
					searchByName(p, name);
					break;
				default:
					System.out.println("Error ");
					break;
				}
				break;
			case 5:
				for (int i = 0; i < count; i++) {
					System.out.println(p[i] + "\n");
				}
				break;
			case 6:
				System.err.println("-------------------EXIT-------------------");
				break;
			default:
				System.out.println("Sorry ...choose correct menu.");
				break;
			}
			System.out.println("*Do you wish to continue (y/Y)? = ");
			yOrN = sc.next().charAt(0);
			System.out.println("__________________________________________________");
		} while (yOrN == 'y' || yOrN == 'Y');
	}

}
