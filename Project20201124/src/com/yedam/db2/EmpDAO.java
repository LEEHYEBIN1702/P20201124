package com.yedam.db2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.yedam.common.DAO;

public class EmpDAO {
	Connection conn = null;
	PreparedStatement pstmt;
	ResultSet rs;
	String sql;
	EmployeeVO vo = new EmployeeVO();

	// 전체조회
	public List<EmployeeVO> getEmpList() {
		conn = DAO.getConnection();
		sql = "select * from emp1 order by 1";
		List<EmployeeVO> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;

	}

	// 한건조회
	public EmployeeVO getEmp(int empId) {
		conn = DAO.getConnection();
		sql = "select * from emp1 where Employee_id = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return vo;

	}

	// 한건입력
	public void insertEmp(EmployeeVO vo) {
		conn = DAO.getConnection();
	    String sql = "insert into emp1(last_name, email, hire_date, job_id) values (?,?,?,?)";
	    
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getLastName());
			pstmt.setString(2, vo.getEmail());
			pstmt.setString(3, vo.getHireDate());
			pstmt.setString(4, vo.getJobId());

			int r = pstmt.executeUpdate();
			
			System.out.println(r + "건이 입력됨.");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 한건수정
	public void updateEmp(EmployeeVO vo) {
		conn = DAO.getConnection();
		 sql = "update emp1 " 
		       + "set email = nvl('" + vo.getEmail() + "', email)"
				+ ", phone_number = nvl('" + vo.getPhoneNumber() + "', phone_number)"
				+ ", salary = nvl (" + vo.getSalary() +", salary)"
				+ " where employee_id = " + vo.getEmployeeId();
		
		try {
			pstmt = conn.prepareStatement(sql);
			int r = pstmt.executeUpdate();
			System.out.println(r + "건 수정됨.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
				
			}catch (SQLException e) {
				e.printStackTrace();
		}

	}
}
	// 한건삭제
	public void deleteEmp(int empId) {
		sql = "delete from emp1 where employee_id = ?";
		conn = DAO.getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			rs = pstmt.executeQuery();
			
			System.out.println(rs +"건 삭제됨.");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
  
	}	
	
	public List<EmployeeVO> getDeptList(String dept) {
		conn = DAO.getConnection();
		sql = "select * from emp1 where department_id = (select department_id from departments where department_name = ?)";
		List<EmployeeVO> list = new ArrayList<>();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dept);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				EmployeeVO vo = new EmployeeVO();
				vo.setEmployeeId(rs.getInt("employee_id"));
				vo.setFirstName(rs.getString("first_name"));
				vo.setLastName(rs.getString("last_name"));
				list.add(vo);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
		
	}

}
