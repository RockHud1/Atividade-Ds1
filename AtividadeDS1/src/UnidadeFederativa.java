
public enum UnidadeFederativa {
    ACRE ("AC","Acre"),
    ALAGOAS("AL", "Alagoas"),
    AMAPA("AP", "Amapá"),
    AMAZONAS("AM", "Amazonas"),
    BAHIA("BA","Bahia"),
    CEARA("CE","Ceará"),
    DISTRITOFEDERAL("DF","Distrito Federal"),
    ESPIRITOSANTO("ES","Espírito Santo"),
    GOIAS("GO","Goiás"),
    MARANHAO("MA","Maranhão"),
    MATOGROSSO("MT","Mato Grosso"),
    MATOGROSSODOSUL("MS","Mato Grosso do Sul"),
    MINASGERAIS("MG","Minas Gerais"),
    PARA("PA","Pará"),
    PARAIBA("PB","Paraíba"),
    PARANA("PR","Paraná"),
    PERNAMBUCO("PE","Pernambuco"),
    PIAUI("PI","Piauí"),
    RIODEJANEIRO("RJ","Rio de Janeiro"),
    RIOGRANDEDONORTE("RN","Rio Grande do Norte"),
    RIOGRANDEDOSUL("RS","Rio Grande do Sul"),
    RONDONIA("RO","RONDÔNIA"),
    RORAIMA("RR","Roraima"),
    SANTACATARINA("SC","Santa Catarina"),
    SAOPAULO("SP","São Paulo"),
    SEERGIPE("SE","Sergipe"),
    TOCANTINS("TO","Tocantins");

    protected String sigla;
    protected String nome;

    private UnidadeFederativa(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNome() {
        return nome;
    }
}
