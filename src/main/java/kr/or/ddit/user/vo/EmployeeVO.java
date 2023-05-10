package kr.or.ddit.user.vo;

import lombok.Data;

@Data
public class EmployeeVO {
	private String empId;
	private String deptCode;
	private String empNameKo;
	private String empNameEn;
	private int empReg1;
	private int empReg2;
	private String empEmail;
	private String empPhone;
	private String empNation;
	private String empGender;
	private String empAddr1;
	private String empAddr2;
	private String empHandicap;
	private String empBank;
	private String empAccount;
	private int profileNo;
	
	private UserVO userVO;
}
