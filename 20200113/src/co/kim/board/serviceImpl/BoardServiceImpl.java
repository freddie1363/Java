package co.kim.board.serviceImpl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import co.kim.board.dto.BoardDto;
import co.kim.board.service.DAO;
import co.kim.board.service.Service;

public class BoardServiceImpl extends DAO implements Service {
	private final String allSelect = "select * from board";
	private final String SELECT = "select * from board where board_id = ?";

	@Override
	public List<BoardDto> allSelect() {
		List<BoardDto> list = new ArrayList<BoardDto>();
		BoardDto dto;
		try {
			psmt = conn.prepareStatement(allSelect);
			rs = psmt.executeQuery();
			while(rs.next()) {
				dto = new BoardDto();
				dto.setBoard_id(rs.getInt("board_id"));
				dto.setWriter(rs.getString("writer"));
				dto.setWdate(rs.getDate("wdate"));
				dto.setTitle(rs.getString("title"));
				dto.setSubject(rs.getString("subject"));
				dto.setHit(rs.getInt("hit"));
				list.add(dto);
			}
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public BoardDto select(BoardDto dto) {
		try {
			psmt = conn.prepareStatement(SELECT);
			psmt.setInt(1, dto.getBoard_id());
			rs = psmt.executeQuery();
			if(rs.next()) {
				dto = new BoardDto();
				dto.setBoard_id(rs.getInt("board_id"));
				dto.setWriter(rs.getString("writer"));
				dto.setWdate(rs.getDate("wdate"));
				dto.setTitle(rs.getString("title"));
				dto.setSubject(rs.getString("subject"));
				dto.setHit(rs.getInt("hit"));
				
			}

		} catch (SQLException s) {
			s.printStackTrace();
		}
		return dto;
	}

	@Override
	public int insert(BoardDto dto) {
		
		return 0;
	}

	@Override
	public int update(BoardDto dto) {
		
		return 0;
	}

	@Override
	public int delete(BoardDto dto) {
		
		return 0;
	}

}
