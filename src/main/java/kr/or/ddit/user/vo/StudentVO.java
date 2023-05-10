package kr.or.ddit.user.vo;

import kr.or.ddit.academic.vo.AcademicVO;
import lombok.Data;

@Data
public class StudentVO {
	private String stuId;
	private String stuNameKo;
	private String stuNameEn;
	private int stuReg1;
	private int stuReg2;
	private String stuEmail;
	private String stuPhone;
	private String stuNation;
	private String stuGender;
	private String stuAddr1;
	private String stuAddr2;
	private String stuHandicap;
	private String stuBank;
	private String stuAccount;
	private int profileNo;
	
	private AcademicVO academicVO;
	private UserVO userVO;
}
