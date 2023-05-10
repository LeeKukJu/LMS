package kr.or.ddit.user.vo;

import java.util.List;

import lombok.Data;

@Data
public class UserVO {
	private String userId;
	private String password;
	private List<UserAuth> authList;	// 권한 목록
}
