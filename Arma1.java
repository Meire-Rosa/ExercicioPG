package playgroundPOO;

public class Arma1 {
	
		
	private static final String TipoUm = "TipoUm";
	private static final String TipoDois = "TipoDois";
	private String tipo;
	private int tempoRecargaDoUltimoTiro;
	private int quantidadeMunicao;
	private boolean podeUsar;
	
	
	public Arma1(String tipo, int tempoRecargaDoUltimoTiro, int quantidadeMunicao) {
		super();
		if (tipo == TipoUm) {
			if ((quantidadeMunicao > 2) && (tempoRecargaDoUltimoTiro > 4)) {
				boolean podeUsar = true;
				System.out.println("A arma tipoUm está pronta para o uso");
			} else {
				boolean podeUsar = false;
				System.out.println("A arma tipoUm não está pronta para o uso");

			}
		} else if (tipo == TipoDois) {
			if ((quantidadeMunicao > 5) && (tempoRecargaDoUltimoTiro > 12)) {
				boolean podeUsar = true;
				System.out.println("A arma tipoDois está pronta para o uso");
			} else {
				boolean podeUsar = false;
				System.out.println("A arma tipoDois não está pronta para o uso");

			}
		} else {
			System.out.println("O tipo de arma solicitado, não se encontra disponível no momento.");
		}

	
	// TODO Auto-generated constructor stub

	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getTempoRecargaDoUltimoTiro() {
		return tempoRecargaDoUltimoTiro;
	}

	public void setTempoRecargaDoUltimoTiro(int tempoRecargaDoUltimoTiro) {
		this.tempoRecargaDoUltimoTiro = tempoRecargaDoUltimoTiro;
	}

	public int getQuantidadeMunicao() {
		return quantidadeMunicao;
	}

	public void setQuantidadeMunicao(int quantidadeMunicao) {
		this.quantidadeMunicao = quantidadeMunicao;
	}

	public boolean isPodeUsar() {
		return podeUsar;
	}

	public void setPodeUsar(boolean podeUsar) {
		this.podeUsar = podeUsar;
	}

	public static String getTipoum() {
		return TipoUm;
	}

	public static String getTipodois() {
		return TipoDois;
	}

}
