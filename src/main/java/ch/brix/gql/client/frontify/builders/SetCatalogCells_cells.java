package ch.brix.gql.client.frontify.builders;

public class SetCatalogCells_cells extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.interfaces.CatalogCell>> {
  public SetCatalogCells_cells() {
    super(new ch.brix.gql.client.Call<>("cells", "CatalogCell"));
  }
  public SetCatalogCells_cells onCatalogLinkCell(On_CatalogLinkCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SetCatalogCells_cells onCatalogTextCell(On_CatalogTextCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public SetCatalogCells_cells onCatalogCell(On_CatalogCell typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
