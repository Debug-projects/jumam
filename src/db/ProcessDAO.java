package db;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProcessDAO extends GenericDAO {

	public void save(Processos processo) {
		String sql = "INSERT INTO PROCESS(dteNome, dteEnd, dteCEP, dteBairro, dteCid, dteUF,dteCNPJ, dteRep, dteNac,"
				+ "dteNat, dteEC, dteRG, dteCPF, dteTel, ddoNome, ,ddoNac, ddoNat, ddoEC, ddoProf, ddoRG, ddoCPF,"
				+ "ddoEnd, ddoCEP, ddoBairro, ddoTel, acNome, acNac, acEC, acProf, acRG, acCPF, aaNome, aaNac, aaEC,"
				+ "aaProf, aaRG, aaCPF, audDate) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?"
				+ ",?,?,?,?,?,?,?)";
		save(sql, processo.getDteNome(), processo.getDteEnd(), processo.getDteCEP(), processo.getDteBairro(),
				processo.getDteCid(), processo.getDteUF(), processo.getDteCNPJ(), processo.getDteRep(),
				processo.getDteNac(), processo.getDteNat(), processo.getDteEC(), processo.getDteRG(),
				processo.getDteCPF(), processo.getDteTel(), processo.getDdoNome(), processo.getDdoNac(),
				processo.getDdoNat(), processo.getDdoEC(), processo.getDdoProf(), processo.getDdoRG(),
				processo.getDdoCPF(), processo.getDdoEnd(), processo.getDdoCEP(), processo.getDdoBairro(),
				processo.getDdoTel(), processo.getAcNome(), processo.getAcNac(), processo.getAcEC(),
				processo.getAcProf(), processo.getAcRG(), processo.getAcCPF(), processo.getAaNome(),
				processo.getAaNac(), processo.getAaEC(), processo.getAaProf(), processo.getAaRG(), processo.getAaCPF(),
				processo.getAudDate());
	}

	public void update(Processos processo) {
		String sql = "UPDATE PROCESS "
				+ "SET dteNome = ?, dteEnd = ?, dteCEP = ?, dteBairro = ?, dteCid = ?, dteUF = ?,dteCNPJ = ?,"
				+ " dteRep = ?, dteNac = ?, dteNat = ?, dteEC = ?, dteRG = ?, dteCPF = ?, dteTel = ?, ddoNome = ?,"
				+ "ddoNac = ?, ddoNat = ?, ddoEC = ?, ddoProf = ?, ddoRG = ?, ddoCPF = ?, ddoEnd = ?, ddoCEP = ?,"
				+ " ddoBairro = ?, ddoTel = ?, acNome = ?, acNac = ?, acEC = ?, acProf = ?, acRG = ?, acCPF = ?,"
				+ " aaNome = ?, aaNac = ?, aaEC = ?, aaProf = ?, aaRG = ?, aaCPF = ?, audDate = ?"
				+ "where id_process = ?";
		update(sql, processo.getDteNome(), processo.getDteEnd(), processo.getDteCEP(), processo.getDteBairro(),
				processo.getDteCid(), processo.getDteUF(), processo.getDteCNPJ(), processo.getDteRep(),
				processo.getDteNac(), processo.getDteNat(), processo.getDteEC(), processo.getDteRG(),
				processo.getDteCPF(), processo.getDteTel(), processo.getDdoNome(), processo.getDdoNac(),
				processo.getDdoNat(), processo.getDdoEC(), processo.getDdoProf(), processo.getDdoRG(),
				processo.getDdoCPF(), processo.getDdoEnd(), processo.getDdoCEP(), processo.getDdoBairro(),
				processo.getDdoTel(), processo.getAcNome(), processo.getAcNac(), processo.getAcEC(),
				processo.getAcProf(), processo.getAcRG(), processo.getAcCPF(), processo.getAaNome(),
				processo.getAaNac(), processo.getAaEC(), processo.getAaProf(), processo.getAaRG(), processo.getAaCPF(),
				processo.getAudDate(), processo.getId());
	}

	public List<Processos> findPessoas() {
		List<Processos> processos = new ArrayList<Processos>();
		String sql = "SELECT * FROM PROCESS";
		try {
			PreparedStatement pstmt = getConnection().prepareStatement(sql);

			ResultSet rs = pstmt.executeQuery();

			while (rs.next()) {
				Processos processo = new Processos();
				processo.setId(rs.getInt("id_process"));
				processo.setDteNome(rs.getString("dteNome"));
				processo.setDteEnd(rs.getString("dteEnd"));
				processo.setDteCEP(rs.getString("dteCEP"));
				processo.setDteBairro(rs.getString("dteBairro"));
				processo.setDteCid(rs.getString("dteCid"));
				processo.setDteUF(rs.getString("dteUF"));
				processo.setDteCNPJ(rs.getString("dteCNPJ"));
				processo.setDteRep(rs.getString("dteRep"));
				processo.setDteNac(rs.getString("dteNac"));
				processo.setDteNat(rs.getString("dteNat"));
				processo.setDteEC(rs.getString("dteEC"));
				processo.setDteRG(rs.getString("dteRG"));
				processo.setDteCPF(rs.getString("dteCPF"));
				processo.setDteTel(rs.getString("dteTel"));
				processo.setDdoNome(rs.getString("ddoNome"));
				processo.setDdoNac(rs.getString("ddoNac"));
				processo.setDdoNat(rs.getString("ddoNat"));
				processo.setDdoEC(rs.getString("ddoEC"));
				processo.setDdoProf(rs.getString("ddoProf"));
				processo.setDdoRG(rs.getString("ddoRG"));
				processo.setDdoCPF(rs.getString("ddoCPF"));
				processo.setDdoEnd(rs.getString("ddoEnd"));
				processo.setDdoCEP(rs.getString("ddoCEP"));
				processo.setDdoBairro(rs.getString("ddoBairro"));
				processo.setDdoTel(rs.getString("ddoTel"));
				processo.setAcNome(rs.getString("acNome"));
				processo.setAcNac(rs.getString("acNac"));
				processo.setAcEC(rs.getString("acEC"));
				processo.setAcProf(rs.getString("acProf"));
				processo.setAcRG(rs.getString("acRg"));
				processo.setAcCPF(rs.getString("acCPF"));
				processo.setAaNome(rs.getString("aaNome"));
				processo.setAaNac(rs.getString("aaNac"));
				processo.setAaEC(rs.getString("aaEC"));
				processo.setAaProf(rs.getString("aaProf"));
				processo.setAaRG(rs.getString("aaRG"));
				processo.setAaCPF(rs.getString("aaCPF"));
				processo.setAudDate(rs.getString("audDate"));
				processos.add(processo);
			}
			rs.close();
			pstmt.close();
			return processos;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

}
