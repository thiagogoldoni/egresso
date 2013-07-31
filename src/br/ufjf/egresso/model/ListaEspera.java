package br.ufjf.egresso.model;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.FetchType;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.ManyToOne;
	import javax.persistence.Table;
	import org.hibernate.annotations.GenericGenerator;

	@Entity
	@Table(name = "listaespera")
	public class ListaEspera {

		@Id
		@Column(name = "idlistaEspera", unique = true, nullable = false)
		@GeneratedValue(generator = "increment")
		@GenericGenerator(name = "increment", strategy = "increment")
		int idlistaEspera;

		@Column(name = "matricula", nullable = false, unique = true, length = 15)
		String matricula;

		@Column(name = "nome", length = 65, nullable = false)
		String nome;

		@Column(name = "tokenfacebook", nullable = false, unique = true, length = 255)
		String tokenfacebook;
		
		@Column(name = "idfacebook", nullable = false, unique = true, length = 20)
		String idfacebook;
		
		@ManyToOne(fetch = FetchType.LAZY)
		@JoinColumn(name = "turma", nullable = false)
		private Turma turma;

		public int getIdlistaEspera() {
			return idlistaEspera;
		}

		public void setIdlista_de_espera(int idlistaEspera) {
			this.idlistaEspera = idlistaEspera;
		}

		public String getMatricula() {
			return matricula;
		}

		public void setMatricula(String matricula) {
			this.matricula = matricula;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getTokenfacebook() {
			return tokenfacebook;
		}

		public void setTokenfacebook(String tokenfacebook) {
			this.tokenfacebook = tokenfacebook;
		}

		public Turma getTurma() {
			return turma;
		}

		public void setTurma(Turma turma) {
			this.turma = turma;
		}

		public String getIdfacebook() {
			return idfacebook;
		}

		public void setIdfacebook(String idfacebook) {
			this.idfacebook = idfacebook;
		}

		public void setIdlistaEspera(int idlistaEspera) {
			this.idlistaEspera = idlistaEspera;
		}
		
	}