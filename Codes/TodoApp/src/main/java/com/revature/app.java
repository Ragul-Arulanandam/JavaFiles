package com.revature;

import java.sql.Connection;

import com.revature.repository.JdbcTodoRepo;
import com.revature.repository.TodoRepo;


public class app {

	public static void main(String[] args) throws Exception{
		TodoRepo todorepo = new JdbcTodoRepo(); 
		todorepo.save();
		}
	}
