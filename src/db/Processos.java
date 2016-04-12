package db;

public class Processos {
	private Integer id;
	private String dteNome;
	private String dteEnd;
	private String dteCEP;
	private String dteBairro;
	private String dteCid;
	private String dteUF;
	private String dteCNPJ;
	private String dteRep;
	private String dteNac;
	private String dteNat;
	private String dteEC;
	private String dteRG;
	private String dteCPF;
	private String dteTel;
	private String ddoNome;
	private String ddoNac;
	private String ddoNat;
	private String ddoEC;
	private String ddoProf;
	private String ddoRG;
	private String ddoCPF;
	private String ddoEnd;
	private String ddoCEP;
	private String ddoBairro;
	private String ddoTel;
	private String acNome;
	private String acNac;
	private String acEC;
	private String acProf;
	private String acRG;
	private String acCPF;
	private String aaNome;
	private String aaNac;
	private String aaEC;
	private String aaProf;
	private String aaRG;
	private String aaCPF;
	private String audDate;

	@Override
	public String toString() {
		return "Processo{" + "id=" + id + ", dteNome=" + dteNome + '\'' + ", dteEnd=" + dteEnd + '\'' + ", dteCEP="
				+ dteCEP + '\'' + ", dteBairro=" + dteBairro + '\'' + ", dteCid=" + dteCid + '\'' + ", dteUF=" + dteUF
				+ '\'' + ", dteCNPJ=" + dteCNPJ + '\'' + ", dteRep=" + dteRep + '\'' + ", dteNac=" + dteNac + '\''
				+ ", dteNat=" + dteNat + '\'' + ", dteEC=" + dteEC + '\'' + ", dteRG=" + dteRG + '\'' + ", dteCPF="
				+ dteCPF + '\'' + ", dteTel=" + dteTel + '\'' + ", ddoNome=" + ddoNome + '\'' + ", ddoNac=" + ddoNac
				+ '\'' + ", ddoNat=" + ddoNat + '\'' + ", ddoEC=" + ddoEC + '\'' + ", ddoProf=" + ddoProf + '\''
				+ ", ddoRG=" + ddoRG + '\'' + ", ddoCPF=" + ddoCPF + '\'' + ", ddoEnd=" + ddoEnd + '\'' + ", ddoCEP="
				+ ddoCEP + '\'' + ", ddoBairro=" + ddoBairro + '\'' + ", ddoTel=" + ddoTel + '\'' + ", acNome=" + acNome
				+ '\'' + ", acNac=" + acNac + '\'' + ", acEC=" + acEC + '\'' + ", acProf=" + acProf + '\'' + ", acRG="
				+ acRG + '\'' + ", acCPF=" + acCPF + '\'' + ", aaNome=" + aaNome + '\'' + ", aaNac=" + aaNac + '\''
				+ ", aaEC=" + aaEC + '\'' + ", aaProf=" + aaProf + '\'' + ", aaRG=" + aaRG + '\'' + ", aaCPF=" + aaCPF
				+ '\'' + ", audDate=" + audDate + '}';
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDteNome() {
		return dteNome;
	}

	public void setDteNome(String dteNome) {
		this.dteNome = dteNome;
	}

	public String getDteEnd() {
		return dteEnd;
	}

	public void setDteEnd(String dteEnd) {
		this.dteEnd = dteEnd;
	}

	public String getDteCEP() {
		return dteCEP;
	}

	public void setDteCEP(String dteCEP) {
		this.dteCEP = dteCEP;
	}

	public String getDteBairro() {
		return dteBairro;
	}

	public void setDteBairro(String dteBairro) {
		this.dteBairro = dteBairro;
	}

	public String getDteCid() {
		return dteCid;
	}

	public void setDteCid(String dteCid) {
		this.dteCid = dteCid;
	}

	public String getDteUF() {
		return dteUF;
	}

	public void setDteUF(String dteUF) {
		this.dteUF = dteUF;
	}

	public String getDteCNPJ() {
		return dteCNPJ;
	}

	public void setDteCNPJ(String dteCNPJ) {
		this.dteCNPJ = dteCNPJ;
	}

	public String getDteRep() {
		return dteRep;
	}

	public void setDteRep(String dteRep) {
		this.dteRep = dteRep;
	}

	public String getDteNac() {
		return dteNac;
	}

	public void setDteNac(String dteNac) {
		this.dteNac = dteNac;
	}

	public String getDteNat() {
		return dteNat;
	}

	public void setDteNat(String dteNat) {
		this.dteNat = dteNat;
	}

	public String getDteEC() {
		return dteEC;
	}

	public void setDteEC(String dteEC) {
		this.dteEC = dteEC;
	}

	public String getDteRG() {
		return dteRG;
	}

	public void setDteRG(String dteRG) {
		this.dteRG = dteRG;
	}

	public String getDteCPF() {
		return dteCPF;
	}

	public void setDteCPF(String dteCPF) {
		this.dteCPF = dteCPF;
	}

	public String getDteTel() {
		return dteTel;
	}

	public void setDteTel(String dteTel) {
		this.dteTel = dteTel;
	}

	public String getDdoNome() {
		return ddoNome;
	}

	public void setDdoNome(String ddoNome) {
		this.ddoNome = ddoNome;
	}

	public String getDdoNac() {
		return ddoNac;
	}

	public void setDdoNac(String ddoNac) {
		this.ddoNac = ddoNac;
	}

	public String getDdoNat() {
		return ddoNat;
	}

	public void setDdoNat(String ddoNat) {
		this.ddoNat = ddoNat;
	}

	public String getDdoEC() {
		return ddoEC;
	}

	public void setDdoEC(String ddoEC) {
		this.ddoEC = ddoEC;
	}

	public String getDdoProf() {
		return ddoProf;
	}

	public void setDdoProf(String ddoProf) {
		this.ddoProf = ddoProf;
	}

	public String getDdoRG() {
		return ddoRG;
	}

	public void setDdoRG(String ddoRG) {
		this.ddoRG = ddoRG;
	}

	public String getDdoCPF() {
		return ddoCPF;
	}

	public void setDdoCPF(String ddoCPF) {
		this.ddoCPF = ddoCPF;
	}

	public String getDdoEnd() {
		return ddoEnd;
	}

	public void setDdoEnd(String ddoEnd) {
		this.ddoEnd = ddoEnd;
	}

	public String getDdoCEP() {
		return ddoCEP;
	}

	public void setDdoCEP(String ddoCEP) {
		this.ddoCEP = ddoCEP;
	}

	public String getDdoBairro() {
		return ddoBairro;
	}

	public void setDdoBairro(String ddoBairro) {
		this.ddoBairro = ddoBairro;
	}

	public String getDdoTel() {
		return ddoTel;
	}

	public void setDdoTel(String ddoTel) {
		this.ddoTel = ddoTel;
	}

	public String getAcNome() {
		return acNome;
	}

	public void setAcNome(String acNome) {
		this.acNome = acNome;
	}

	public String getAcNac() {
		return acNac;
	}

	public void setAcNac(String acNac) {
		this.acNac = acNac;
	}

	public String getAcEC() {
		return acEC;
	}

	public void setAcEC(String acEC) {
		this.acEC = acEC;
	}

	public String getAcProf() {
		return acProf;
	}

	public void setAcProf(String acProf) {
		this.acProf = acProf;
	}

	public String getAcRG() {
		return acRG;
	}

	public void setAcRG(String acRG) {
		this.acRG = acRG;
	}

	public String getAcCPF() {
		return acCPF;
	}

	public void setAcCPF(String acCPF) {
		this.acCPF = acCPF;
	}

	public String getAaNome() {
		return aaNome;
	}

	public void setAaNome(String aaNome) {
		this.aaNome = aaNome;
	}

	public String getAaNac() {
		return aaNac;
	}

	public void setAaNac(String aaNac) {
		this.aaNac = aaNac;
	}

	public String getAaEC() {
		return aaEC;
	}

	public void setAaEC(String aaEC) {
		this.aaEC = aaEC;
	}

	public String getAaProf() {
		return aaProf;
	}

	public void setAaProf(String aaProf) {
		this.aaProf = aaProf;
	}

	public String getAaRG() {
		return aaRG;
	}

	public void setAaRG(String aaRG) {
		this.aaRG = aaRG;
	}

	public String getAaCPF() {
		return aaCPF;
	}

	public void setAaCPF(String aaCPF) {
		this.aaCPF = aaCPF;
	}

	public String getAudDate() {
		return audDate;
	}

	public void setAudDate(String audDate) {
		this.audDate = audDate;
	}
	
	

}