package com.vdaproject.templatebespring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppMain {

	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
	}

	/*
	TODO: Controller POST (UPDATE, DELETE ?) + handle list req param
	TODO: Transactional - Save / Update
	TODO: BaseModel -> mappedSuperClass
	TODO: Relational Data Table
	TODO: Paging, sorting & filtering using JPA repository methods
	TODO: Data Seeding (Db populate)
	TODO: Implement Security
	TODO: CORS
	TODO: Standardized Response Payload
	TODO: BANNER !!!!!!!!!!!!!!!!!!
	TODO: Save File with multipart
	TODO: Save File with Base64
	TODO: DateTime converter
	TODO: DTO
	TODO: Logger
	*/

	/*
		REQUIREMENT APLIKASI:
		- Registrasi & Edit Data:
			-> Input data, password
			-> Encrypt password atau hash with bcrypt
			-> Upload profile picture / avatar (random avatar jika tidak ada foto)
		- Login
		- User punya role
		- Menu yang muncul based on role
		- Menampilkan data dalam table dan pagination
		- Security untuk tiap API kecuali login & register

		*poin plus -> BISA GANTI2 Database (MySql, postgresql, sqlite, H2, dll)
	*/
}
