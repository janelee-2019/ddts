package com.ddts.ac.common;

import java.util.List;

import javax.servlet.ServletContext;

import com.ddts.ac.model.Employee;
import com.ddts.ac.model.ProjectSummary;

public class Constant
{
	public static String SRNO;
	public static String ORIG_SRNO;
	public static List<ProjectSummary> LST_PROJ;
	public static List<Employee> LST_USER;
	public static ServletContext CONTEXT;
	public static String FILE_PATH;
	public static String IMG_PATH;

	public static String addBlank(int count)
	{
		StringBuilder result = new StringBuilder();
		for (int i = 0; i < count; i++)
		{
			if (i > 0)
			{
				result.append(" ");
			}
		}
		return result.toString();
	}
}
