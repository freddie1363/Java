package co.kim.dto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.kim.dao.DAO;
import co.kim.dao.JobService;

public class JobServiceImpl extends DAO implements JobService {
	private PreparedStatement psmt;
	private ResultSet rs;
	private List<JobDto> list;
	
	private final String ALL_JOBS = "select * from jobs";

	@Override
	public List<JobDto> selectAll() throws Exception {
		list = new ArrayList<JobDto>();
		psmt = conn.prepareStatement(ALL_JOBS);
		rs = psmt.executeQuery();
		while(rs.next()) {
			JobDto dto = new JobDto();
			dto.setJob_id(rs.getString("job_id"));
			dto.setJob_title(rs.getString("job_title"));
			dto.setMax_salary(rs.getInt("max_salary"));
			dto.setMin_salary(rs.getInt("min_salary"));
			list.add(dto);
		}
		return list;

	}

	@Override
	public JobDto select(JobDto dto) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int update(JobDto dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(JobDto dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(JobDto dto) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
