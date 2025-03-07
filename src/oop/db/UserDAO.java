package oop.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserDAO extends MyDAO {
	private MyDAO myDao;

	public UserDAO() {
		this.myDao = new MyDAO();
	}

	public List<UserDTO> getUsers(int limit, int offset) {
		List<UserDTO> users = new ArrayList<>();
		String sql = "SELECT * FROM users LIMIT ? OFFSET ?";

		try (
			Connection conn = this.myDao.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
		) {
			ps.setInt(1, limit);
			ps.setInt(2, offset);

			try(ResultSet rs = ps.executeQuery()) {
				while(rs.next()) {
					UserDTO user = new UserDTO();
					user.setUserId(rs.getLong("user_id"));
					user.setName(rs.getString("name"));
					user.setAccount(rs.getString("account"));
					user.setPassword(rs.getString("password"));
					user.setProfile(rs.getString("profile"));
					user.setGender(rs.getString("gender"));
					user.setRefreshToken(rs.getString("refresh_token"));
					user.setCreatedAt(rs.getString("created_at"));
					user.setUpdatedAt(rs.getString("updated_at"));
					user.setDeletedAt(rs.getString("deleted_at"));
					users.add(user);
				}
			}
		}catch (Exception e) {
			throw new RuntimeException(e);
		}

		return users;
	}
}
