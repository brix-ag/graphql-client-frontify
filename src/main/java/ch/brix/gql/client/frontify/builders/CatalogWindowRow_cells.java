package ch.brix.gql.client.frontify.builders;

public class CatalogWindowRow_cells extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.CatalogCell>> {
  public CatalogWindowRow_cells() {
    super(new ch.brix.gql.client.Call<>("cells", "CatalogCell"));
  }
  public CatalogWindowRow_cells onCatalogLinkCell(On_CatalogLinkCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CatalogWindowRow_cells onCatalogTextCell(On_CatalogTextCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CatalogWindowRow_cells onCatalogCell(On_CatalogCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
