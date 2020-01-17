package co.kim.service;

import java.util.List;

import co.kim.dto.ProfDto;

public interface ProfService {
	public List<ProfDto> allSelect();
	public ProfDto select(ProfDto dto);
	public int insert(ProfDto dto);
	public int update(ProfDto dto);
	public int delete(ProfDto dto);
	
	
	
	

}
