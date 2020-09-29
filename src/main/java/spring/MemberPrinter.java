package spring;

import org.springframework.stereotype.Component;

@Component
public class MemberPrinter {
//	private DateTimeFormatter dateTimeFormatter;
	
	public MemberPrinter() {
//		dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
	}
	
	public void print(Member member) {
//		if (dateTimeFormatter == null) {
			System.out.printf(
					"회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%tF\n", 
					member.getId(), member.getEmail(),
					member.getName(), member.getRegisterDateTime());
//		} else {
//			System.out.printf(
//					"회원 정보: 아이디=%d, 이메일=%s, 이름=%s, 등록일=%s\n", 
//					member.getId(), member.getEmail(),
//					member.getName(), 
//					dateTimeFormatter.format(member.getRegisterDateTime()));
//		}
	}
	
//	@Autowired /* (required = false) */
//	public void setDateFormatter(DateTimeFormatter dateTimeFormatter) {
//		this.dateTimeFormatter = dateTimeFormatter;
//	}

//	@Autowired
//	public void setDateFormatter(Optional<DateTimeFormatter> formatterOpt) {
//		if (formatterOpt.isPresent()) {
//			this.dateTimeFormatter = formatterOpt.get();
//		} else {
//			this.dateTimeFormatter = null;
//		}
//	}
//	
//	@Autowired
//	public void setDateFormatter(@Nullable DateTimeFormatter dateTimeFormatter) {
//		this.dateTimeFormatter = dateTimeFormatter;
//	}
	
}